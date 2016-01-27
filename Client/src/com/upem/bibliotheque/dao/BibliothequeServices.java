package com.upem.bibliotheque.dao;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.util.List;


import com.upem.bibliotheque.beans.*;



public class BibliothequeServices {

	IBibliothequeDAO dao;
	public IBibliothequeDAO getDao() {
		return dao;
	}

	public void setDao(IBibliothequeDAO dao) {
		this.dao = dao;
	}

	public BibliothequeServices() {
		try {
			Registry r = LocateRegistry.getRegistry("127.0.0.1", 1099);
			dao = (IBibliothequeDAO) r.lookup("BibService");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public void addBook(Book b) {
		try {
			dao.addBook(b);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void addUser(User u) {

	}

	public User getUserByName(String name) {
		return null;
	}

	public User getUserAuth(String username, String password) {
		try {
			return dao.getUserAuth(username, password);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<User> getAllUsers() {
		try {
			return dao.getAllUsers();
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Book> getAllBooks(){
		try {
			return dao.getAllBooks();
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Book getBookByISBN(String isbn){
		try {
			return dao.getBookByISBN(isbn);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void addComment(Comment c,String isbn,String usr){
		try {
			dao.addComment(c, isbn,usr);
		} catch (RemoteException e) {
			e.printStackTrace();
			
		}
	}
	public void addBorrowBook(BorrowBook br,String isbn){
		try {
			dao.addBrrowBook(br, isbn);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	public void addQueue(Queue q,String isbn){
		try {
			dao.addQueue(q, isbn);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	public List<Comment> getAllCommentsByUser(String user){
		try {
			return dao.getAllCommentsByUser(user);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Comment> getAllCommentsByBook(String book){
		try {
			return dao.getAllCommentsByBook(book);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void validateSale(Book b){
		try {
			dao.validateSale(b);
		} catch (RemoteException e) {
			e.printStackTrace();
			
		}
	
	}
	public void Update(Book b,String titre,double prix,String auteur){
		try {
			dao.Update(b,titre,prix,auteur);
		} catch (RemoteException e) {
			e.printStackTrace();
			
		}
	}
}
