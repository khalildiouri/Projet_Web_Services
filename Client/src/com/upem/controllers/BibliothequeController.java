package com.upem.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Objects.Comments;

import com.upem.bibliotheque.beans.Book;
import com.upem.bibliotheque.beans.BorrowBook;
import com.upem.bibliotheque.beans.Comment;
import com.upem.bibliotheque.beans.Queue;
import com.upem.bibliotheque.beans.User;
import com.upem.bibliotheque.dao.BankService;
import com.upem.bibliotheque.dao.BibliothequeServices;
import com.upem.bibliotheque.*;
import com.upem.validators.BookValid;

@Controller
public class BibliothequeController {

	User user;
	Date actuelle = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String dat = dateFormat.format(actuelle);
	BibliothequeServices service = new BibliothequeServices();;
	String id_user_session = "";

	@Autowired
	BookValid validBook;

	@RequestMapping(value = "/session")
	public String PageIndex() {
		System.out.println("spring ");
		return "index";
	}

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("books", service.getAllBooks());
		return "User_Index";
	}
	@RequestMapping(value = "/welcomeAdmin")
	public String welcomeAdmin(Model model) {
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("books", service.getAllBooks());
		return "Admin_Index";
	}

	@RequestMapping(value = "/authentifieruser")
	public String authentification(User u, Model model) {
		String username = u.getUsername();
		String password = u.getPassword();

		if (username.equals("admin") && password.equals("admin")) {
			model.addAttribute("firstname", "Administrateur");
			model.addAttribute("name", "");
			model.addAttribute("books", service.getAllBooks());
			return "Admin_Index";
		} else {
			if (service.getUserAuth(username, password) == null) {
				model.addAttribute("error",
						"- USERNAME ou PASSWORD incorrect !!");
				return "index";
			} else {
				user = service.getUserAuth(username, password);
				model.addAttribute("firstname", user.getFirstname());
				model.addAttribute("name", user.getName());
				model.addAttribute("books", service.getAllBooks());
				return "User_Index";
			}
		}
	}

	@RequestMapping(value = "/toBorrowBook")
	public String toBorrowBook(Model model) {
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("date", dat);
		model.addAttribute("books", service.getAllBooks());
		return "BorrowBook";
	}

	@RequestMapping(value = "/validateBorrow")
	public String validateBorrowBook(@ModelAttribute("br") BorrowBook br,
			Model model, @RequestParam("is") String is) {
		Book book = service.getBookByISBN(is);
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		if (book.getDisp().equals("OUI")) {
			service.addBorrowBook(br, is);
			String title = service.getBookByISBN(is).getTitle();
			model.addAttribute("date", dat);
			model.addAttribute("msg", "Vous avez bien emprunté le livre <b>"
					+ title + "</b>");
			model.addAttribute("date", dat);
			model.addAttribute("books", service.getAllBooks());
			return "BorrowBook";
		} else {

			service.addQueue(new Queue(dat), is);
			String title = service.getBookByISBN(is).getTitle();
			model.addAttribute("msg", "le livre <b>" + title
					+ "</b> que vous voulez emprunté n'est pas disponible"
					+ " vous serez informé par email dès qu'il sera disponible");
			model.addAttribute("date", dat);
			model.addAttribute("books", service.getAllBooks());
			return "BorrowBook";
		}

	}

	@RequestMapping(value = "/toComment")
	public String ajouterCommentaire(Model model) {

		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("books", service.getAllBooks());
		return "AddComment";
	}

	@RequestMapping(value = "/addcomment")
	public String ajouterCommentaire(Model model,
			@RequestParam("content") String content,
			@RequestParam("is") String is) {

		service.addComment(new Comment(content), is, user.getId_user());
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("books", service.getAllBooks());
		String title = service.getBookByISBN(is).getTitle();
		model.addAttribute("msg", "vous venez de commenter le livre <b>"
				+ title + "</b>  < commentaire ajouter avec succès> ");
		return "AddComment";
	}

	@RequestMapping(value = "/toListCompte")
	public String listCommentaire(Model model) {
		List<Comment> comments = service
				.getAllCommentsByUser(user.getId_user());
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("comments", list);
		model.addAttribute("msg", "voici vos commentaires :");
		return "MyComments";
	}

	@RequestMapping(value = "/toAddBook")
	public String VersajouterLivre(Model model) {
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("name", "");
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@RequestMapping(value = "/AddBook")
	public String ajouterLivre(Model model,
			@Valid @ModelAttribute("book") Book book, BindingResult br) {
		boolean exist = false;
		validBook.validate(book, br);
		if(br.hasErrors()){
			model.addAttribute("firstname", "Administrateur");
			model.addAttribute("name", "");
			model.addAttribute("book", book);
			return "addBook";
		}
		for (Book f : service.getAllBooks()) {
			if (book.getIsbn().equals(f.getIsbn())) {
				exist = true;
			}
		}
		if (exist == true) {
			model.addAttribute("book", book);
			model.addAttribute("isbn", "ISBN existe déja (changer ISBN");

			model.addAttribute("firstname", "Administrateur");
			model.addAttribute("name", "");
			return "addBook";
		} else {
			service.addBook(book);
			model.addAttribute("book", book);
			model.addAttribute("good", "Livre ajouté avec succès");

			model.addAttribute("firstname", "Administrateur");
			model.addAttribute("name", "");
			return "addBook";
		}
	}
	@RequestMapping(value="/AdminAddComment")
	public String AdminAddComment(Model model){
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("books", service.getAllBooks());
		return "AdminAddComment";
	}
	@RequestMapping(value = "/addcommentAdmin")
	public String ajouterCommentaireAdmin(Model model,
			@RequestParam("content") String content,
			@RequestParam("is") String is) {

		service.addComment(new Comment(content), is, "admin");
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("books", service.getAllBooks());
		String title = service.getBookByISBN(is).getTitle();
		model.addAttribute("msg", "vous venez de commenter le livre <b>"
				+ title + "</b>  < commentaire ajouter avec succès> ");
		return "AdminAddComment";
	}
	
	@RequestMapping(value = "/toListCompteADMIN")
	public String listCommentaireADMIN(Model model) {
		List<Comment> comments = service
				.getAllCommentsByUser("admin");
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("name", "ADMIN");
		model.addAttribute("comments", list);
		model.addAttribute("msg", "voici vos commentaires :");
		return "MyCommentsADMIN";
	}
	@RequestMapping(value = "/toBorrowBookADMIN")
	public String toBorrowBookADMIN(Model model) {
		model.addAttribute("firstname","Administrateur");
		model.addAttribute("date", dat);
		model.addAttribute("books", service.getAllBooks());
		return "BorrowBookADMIN";
	}
	@RequestMapping(value = "/validateBorrowADMIN")
	public String validateBorrowBookADMIN(@ModelAttribute("br") BorrowBook br,
			Model model, @RequestParam("is") String is) {
		Book book = service.getBookByISBN(is);
		model.addAttribute("firstname", "Administrateur");
		if (book.getDisp().equals("OUI")) {
			service.addBorrowBook(br, is);
			String title = service.getBookByISBN(is).getTitle();
			model.addAttribute("date", dat);
			model.addAttribute("msg", "Vous avez bien emprunté le livre <b>"
					+ title + "</b>");
			model.addAttribute("date", dat);
			model.addAttribute("books", service.getAllBooks());
			return "BorrowBookADMIN";
		} else {

			service.addQueue(new Queue(dat), is);
			String title = service.getBookByISBN(is).getTitle();
			model.addAttribute("msg", "le livre <b>" + title
					+ "</b> que vous voulez emprunté n'est pas disponible"
					+ " vous serez informé par email dès qu'il sera disponible");
			model.addAttribute("date", dat);
			model.addAttribute("books", service.getAllBooks());
			return "BorrowBookADMIN";
		}

	}
	@RequestMapping(value="/toCommentsAdminBook")
	public String ToCommentsBookAdmin(Model model){
	
		List<Comment> comments = service.getAllCommentsByBook("1");
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}

		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("commts", list);
		model.addAttribute("books", service.getAllBooks());
		return "CommentsBookAdmin";
	}
	@RequestMapping(value="/ShowCommentsBookAdmin")
	public String ShowCommentsBookAdmin(Model model,@RequestParam("c") String a){
		
		List<Comment> comments = service.getAllCommentsByBook(a);
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}

		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("commts", list);
		model.addAttribute("books", service.getAllBooks());
		return "CommentsBookAdmin";
	}
	@RequestMapping(value="/toCommentsBook")
	public String ToCommentsBook(Model model){
	
		List<Comment> comments = service.getAllCommentsByBook("1");
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("commts", list);
		model.addAttribute("books", service.getAllBooks());
		return "CommentsBook";
	}
	@RequestMapping(value="/ShowCommentsBook")
	public String ShowCommentsBook(Model model,@RequestParam("c") String a){
		
		List<Comment> comments = service.getAllCommentsByBook(a);
		List<Comments> list = new ArrayList<Comments>();
		for (Comment c : comments) {
			Book b = service.getBookByISBN(c.getBook().getIsbn());
			list.add(new Comments(b.getTitle(), b.getAuthor(), b
					.getDescription(), c.getContent()));
		}
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("name", user.getName());
		model.addAttribute("commts", list);
		model.addAttribute("books", service.getAllBooks());
		return "CommentsBook";
	}
	@RequestMapping(value="/toUpdateBook")
	public String updateBookShow(Model model){
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("books", service.getAllBooks());
		return "UpdateBook";
	}
	@RequestMapping(value="/updatebook")
	public String updateBook(Model model,@RequestParam("titre") String titre,@RequestParam("c") String isbn,
			@RequestParam("auteur") String auteur,@RequestParam("prix") double prix){
		Book livre = service.getBookByISBN(isbn);
		service.Update(livre, titre, prix, auteur);
		model.addAttribute("firstname", "Administrateur");
		model.addAttribute("msg", "Livre  modifié !");
		model.addAttribute("books", service.getAllBooks());
		return "UpdateBook";
	}
	
}
