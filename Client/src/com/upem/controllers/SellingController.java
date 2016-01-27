package com.upem.controllers;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.upem.bankservices.Account;
import com.upem.bibliotheque.beans.Book;
import com.upem.bibliotheque.beans.Cart;
import com.upem.bibliotheque.dao.BankService;
import com.upem.bibliotheque.dao.BibliothequeServices;
import com.upem.bibliotheque.dao.ConverterService;
import com.upem.bibliotheque.dao.ConvertisseurService;
import com.upem.bibliotheque.dao.SellingDAOImpl;
import com.upem.validators.AccountValid;


@Controller
public class SellingController {

	@Autowired
	AccountValid valid; 
	
	private SellingDAOImpl service = new SellingDAOImpl();
	List<Cart> paniers = new ArrayList<Cart>();
	BibliothequeServices bib = new BibliothequeServices();
	double somme = 0;
	BankService bank = new BankService();
	String currencyfrom = "euro";
	ConvertisseurService converter = new ConvertisseurService();

	// System.out.println(currencyconvertor.conversionRate(Currency.EUR,
	// Currency.JPY));
	public SellingController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/toClient_index")
	public String tocientIndex(Model model) throws ServiceException,
			RemoteException {
		somme = 0;
		paniers = new ArrayList<Cart>();
		model.addAttribute("books", service.getAllBookForSelling());
		return "client_index";
	}

	@RequestMapping(value = "/addCart")
	public String addCart(Model model, @RequestParam("isbn") String isbn) {
		System.out.println(isbn);
		Book b = bib.getBookByISBN(isbn);
		Cart c = new Cart(b.getTitle(), b.getAuthor(), b.getPrice(), isbn);
		paniers.add(c);
		somme = somme + c.getPrix();
		model.addAttribute("msgPanier", " Le Livre " + b.getTitle()
				+ " a bien été ajouter au panier");
		model.addAttribute("somme", somme);
		model.addAttribute("carts", paniers);
		model.addAttribute("books", service.getAllBookForSelling());
		return "client_index";
	}

	@RequestMapping(value = "/tovalidateAccount")
	public String toValiderCompte(Model model,@ModelAttribute("obj") Account obj) {
		
		if (somme == 0) {
			model.addAttribute("books", service.getAllBookForSelling());
			model.addAttribute("msg", "Votre Panier est vide !");
			return "client_index";
		} else {
			model.addAttribute("somme", somme);
			model.addAttribute("obj",new Account());
			return "Bank";
		}
	}

	@RequestMapping(value = "/tochangeCurrency")
	public String tochangeCurrency(Model model,
			@RequestParam("cur") String currencyTo) {
		if (currencyTo.equals("euro") && currencyfrom.equals("dollars")) {
			currencyfrom = currencyTo;
			try {
				somme = converter.convert("EUR", "USD", somme);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			if (currencyTo.equals("euro") && currencyfrom.equals("pound")) {
				currencyfrom = currencyTo;
				try {
					somme = converter.convert("EUR", "GBP", somme);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				if (currencyTo.equals("dollars") && currencyfrom.equals("euro")) {
					currencyfrom = currencyTo;
					try {
						somme = converter.convert("USD", "EUR", somme);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					if (currencyTo.equals("dollars")
							&& currencyfrom.equals("pound")) {
						currencyfrom = currencyTo;
						try {
							somme = converter.convert("USD", "GBP", somme);
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						if (currencyTo.equals("pound")
								&& currencyfrom.equals("euro")) {
							currencyfrom = currencyTo;
							try {
								somme = converter.convert("GBP", "EUR", somme);
							} catch (RemoteException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							if (currencyTo.equals("pound")
									&& currencyfrom.equals("dollars")) {
								currencyfrom = currencyTo;
								try {
									somme = converter.convert("GBP", "USD",
											somme);
								} catch (RemoteException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		model.addAttribute("obj",new Account());
		model.addAttribute("money", currencyTo);
		model.addAttribute("books", service.getAllBookForSelling());
		model.addAttribute("somme", somme);
		return "Bank";

	}

	@RequestMapping(value = "/validateaccount")
	public String validerAchat(Model model,
			@Valid  @ModelAttribute("obj") Account af,BindingResult br) {
		valid.validate(af, br);
		Account a = bank.getAccountByIDNumber(af.getIban(),
				af.getNumber(), af.getExpireDate());
		
		if (a == null) {
			model.addAttribute("somme", somme);
			model.addAttribute("bankMSG",
					"<b>coordonnées incorrecte</b>, veuillez réessayer svpl !");
			return "Bank";
		} else {
			bank.prelevement(a, somme);
			for (Cart cart : paniers) {
				Book bok = bib.getBookByISBN(cart.getIsbn());
				bib.validateSale(bok);
			}
			
			model.addAttribute("books", service.getAllBookForSelling());
			model.addAttribute("bankMSG2",
					"<b>Vous avez bien effectué votre achat </b>,Merci !");
			somme = 0;
			return "client_index";
		}

	}

	@RequestMapping(value = "/toemptycart")
	public String viderPanier(Model model) {
		somme = 0;
		model.addAttribute("msg", "Panier vidé !");
		paniers = new ArrayList<Cart>();
		model.addAttribute("books", service.getAllBookForSelling());
		return "client_index";
	}
}
