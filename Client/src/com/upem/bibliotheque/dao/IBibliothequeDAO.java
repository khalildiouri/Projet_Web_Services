package com.upem.bibliotheque.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.upem.bibliotheque.beans.*;



public interface IBibliothequeDAO extends Remote{

	public void addBook(Book b) throws RemoteException;
	public void addUser(User u)throws RemoteException;
	public User getUserByName(String name)throws RemoteException;
	public User getUserAuth(String username,String password)throws RemoteException;
	public User getUserById(String id)throws RemoteException;
	public List<User> getAllUsers()throws RemoteException;
	public List<Book> getAllBooks()throws RemoteException;
	public Book getBookByISBN(String isbn)throws RemoteException;
	public void addComment(Comment c,String isbn,String user)throws RemoteException;
	public void addBrrowBook(BorrowBook br,String isbn)throws RemoteException;
	public void addQueue(Queue q,String isbn)throws RemoteException;
	public List<Comment> getAllCommentsByUser(String user)throws RemoteException;
	public List<Comment> getAllCommentsByBook(String user)throws RemoteException;
	public void validateSale(Book b) throws RemoteException;
	public void Update(Book b,String titre,double prix,String auteur)throws RemoteException;
	
}
