package com.upem.bibliotheque.dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

import com.upem.bibliotheque.beans.Book;
import com.upem.bibliotheque.beans.BorrowBook;
import com.upem.bibliotheque.beans.Comment;
import com.upem.bibliotheque.beans.Queue;
import com.upem.bibliotheque.beans.User;
import com.upem.bibliotheque.dao.*;

public class BibliothequeDAOImpl extends UnicastRemoteObject implements
		IBibliothequeDAO {

	public BibliothequeDAOImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(Book b) throws RemoteException {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		if (b.getCopy_number() > 0) {
			b.setDisp("OUI");
		} else
			b.setDisp("NON");
		b.setBorrowed(false);
		b.setYears(0);
		session.save(b);
		session.getTransaction().commit();

	}

	@Override
	public List<User> getAllUsers() throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from User").list();
	}

	@Override
	public void addUser(User u) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();

	}

	@Override
	public User getUserByName(String name) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User c = null;
		// c =
		// (Session)session.createQuery("from Session where login = '"+login+"' and password = '"+password+"'");
		Query q = session.createQuery("from User where name = '" + name + "'");
		c = (User) q.uniqueResult();

		return c;
	}

	@Override
	public User getUserAuth(String username, String password)
			throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User c = null;
		Query q = session.createQuery("from User where username = '" + username
				+ "' and password = '" + password + "'");
		c = (User) q.uniqueResult();
		return c;
	}

	@Override
	public List<Book> getAllBooks() throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Book").list();
	}

	@Override
	public Book getBookByISBN(String isbn) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Book c = null;
		// c =
		// (Session)session.createQuery("from Session where login = '"+login+"' and password = '"+password+"'");
		Query q = session.createQuery("from Book where isbn = '" + isbn + "'");
		c = (Book) q.uniqueResult();
		return c;
	}

	@Override
	public void addComment(Comment c, String isbn, String user)
			throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Book b = getBookByISBN(isbn);
		User u = getUserById(user);
		c.setUser(u);
		c.setBook(b);
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public void addBrrowBook(BorrowBook br, String isbn) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Book b = getBookByISBN(isbn);
		b.setCopy_number(b.getCopy_number() - 1);
		b.setBorrowed(true);
		br.setBook(b);
		Date actuelle = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dat = dateFormat.format(actuelle);
		br.setDateFrom(dat);
		session.save(br);
		session.getTransaction().commit();

	}

	@Override
	public void addQueue(Queue q, String isbn) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Book b = getBookByISBN(isbn);
		q.setBook(b);
		session.save(q);
		session.getTransaction().commit();

	}

	@Override
	public User getUserById(String id) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User c = null;
		// c =
		// (Session)session.createQuery("from Session where login = '"+login+"' and password = '"+password+"'");
		Query q = session.createQuery("from User where id_user = '" + id + "'");
		c = (User) q.uniqueResult();

		return c;
	}

	@Override
	public List<Comment> getAllCommentsByUser(String user)
			throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery(
				"from Comment where etr_user_comment = '" + user + "'").list();

	}

	@Override
	public List<Comment> getAllCommentsByBook(String isbn) throws RemoteException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery(
				"from Comment where etr_book_comment = '" + isbn + "'").list();

	}

	@Override
	public void validateSale(Book b) throws RemoteException {
		Book a =getBookByISBN(b.getIsbn());
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		a.setCopy_number(a.getCopy_number()-1);
		if(a.getCopy_number()==0) a.setDisp("NON");
		session.save(a);
		session.getTransaction().commit();
	}

	@Override
	public void Update(Book b,String titre,double prix,String auteur) throws RemoteException {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		b.setTitle(titre);b.setPrice(prix);b.setAuthor(auteur);
		session.merge(b);
		session.getTransaction().commit();
		
	}

}