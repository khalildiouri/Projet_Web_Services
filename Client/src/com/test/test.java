package com.test;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.upem.bibliotheque.beans.Book;
import com.upem.bibliotheque.beans.BorrowBook;
import com.upem.bibliotheque.dao.BankService;
import com.upem.bibliotheque.dao.IBibliothequeDAO;
import com.upem.selling.beans.UserWS;
import com.upem.sellingservices.BookWS;
import com.upem.sellingservices.SellingDAO;
import com.upem.sellingservices.SellingDAOService;

public class test {

	public static void main(String[] args) {
		
		 try { Registry r = LocateRegistry.getRegistry("127.0.0.1",1099);
		  IBibliothequeDAO c = (IBibliothequeDAO) r.lookup("BibService");
		// * System.out.println(c.getBookByISBN("3")); 
		c.getUserAuth("kdiouri", "123");
		//BankService bank = new BankService();
		// System.out.println(bank.getAccountByIDNumber("1", "1",
		// "01/01/2016").toString());
		Book b =c.getBookByISBN("6");
		c.Update(b,"rf",1000,"rf");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
