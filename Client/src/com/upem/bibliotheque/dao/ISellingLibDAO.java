package com.upem.bibliotheque.dao;

import java.util.List;

import com.upem.sellingservices.*;



public interface ISellingLibDAO {

	public List<UserWS> getAllUsers();
	public void addBook(BookWS b);
	public List<BookWS> getAllBookForSelling();
	public List<BookWS> getAllBorrowedBooks(String isbn);
}
