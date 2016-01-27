package com.upem.selling.dao;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

import com.upem.selling.beans.BookWS;
import com.upem.selling.beans.BorrowBookWS;
import com.upem.selling.beans.UserWS;

@WebService
public class SellingDAO implements ISellingDAO {

	@Override
	@WebMethod
	public List<UserWS> getAllUsers() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from UserWS").list();
	}

	@Override
	@WebMethod
	public void addBook(BookWS b) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		if (b.getCopy_number() > 0) {
			b.setDisp("OUI");
		} else
			b.setDisp("NON");
		session.save(b);
		session.getTransaction().commit();

	}

	@Override
	@WebMethod
	public List<BookWS> getAllBookForSelling() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<BookWS> books = new ArrayList<BookWS>();
		List<BookWS> list =session.createQuery("from BookWS").list();
		for(BookWS b : list){
			if(b.getYears()>=2 && b.getCopy_number()>0 && b.isBorrowed()){
				books.add(b);
				
			}
		}
		return books;
	}

	public BookWS getBookByISBN(String isbn) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BookWS c = null;
		// c =
		// (Session)session.createQuery("from Session where login = '"+login+"' and password = '"+password+"'");
		Query q = session
				.createQuery("from BookWS where isbn = '" + isbn + "'");
		c = (BookWS) q.uniqueResult();
		return c;
	}

	@Override
	@WebMethod
	public List<BookWS> getAllBorrowedBooks(String isbn) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<BorrowBookWS> list = session.createQuery("from BorrowBookWS").list();
		List<BookWS> books = new ArrayList<BookWS>();
		for (BorrowBookWS b : list) {
			if (b.getEtr_book_borrow().equals(isbn)) {
				books.add(getBookByISBN(isbn));
			}
		}
		return books;
	}

}
