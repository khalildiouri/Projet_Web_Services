package com.upem.selling.dao;

import java.util.List;

import com.upem.selling.beans.BookWS;
import com.upem.selling.beans.UserWS;


public interface ISellingDAO {
	
	public List<UserWS> getAllUsers();
	public void addBook(BookWS b);
	public List<BookWS> getAllBookForSelling();
	public List<BookWS> getAllBorrowedBooks(String isbn);
}
