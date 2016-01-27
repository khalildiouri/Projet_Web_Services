package com.upem.bibliotheque.dao;

import java.util.List;

import com.upem.sellingservices.*;
import com.upem.sellingservices.SellingDAO;
import com.upem.sellingservices.SellingDAOService;

public class SellingDAOImpl implements ISellingLibDAO {

	private SellingDAO dao;
	
	public SellingDAO getDao() {
		return dao;
	}
	public void setDao(SellingDAO dao) {
		this.dao = dao;
	}
	public SellingDAOImpl() {
		dao = new SellingDAOService().getSellingDAOPort();
	}
	@Override
	public List<UserWS> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public void addBook(BookWS b) {
		dao.addBook(b);
		
	}

	@Override
	public List<BookWS> getAllBookForSelling() {
		// TODO Auto-generated method stub
		return dao.getAllBookForSelling();
	}

	@Override
	public List<BookWS> getAllBorrowedBooks(String isbn) {
		// TODO Auto-generated method stub
		return dao.getAllBorrowedBooks(isbn);
	}

	

}
