package com.upem.selling.beans;

import java.io.Serializable;


public class BorrowBookWS implements Serializable{

	private int id_borrow;
	private String dateFrom;
	private String dateTo;
	private String etr_book_borrow;
	private String etr_user_borrow;
	
	public BorrowBookWS(String dateFrom, String dateTo) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public BorrowBookWS() {
		
	}

	
	public int getId_borrow() {
		return id_borrow;
	}

	public void setId_borrow(int id_borrow) {
		this.id_borrow = id_borrow;
	}

	public String getEtr_book_borrow() {
		return etr_book_borrow;
	}

	public void setEtr_book_borrow(String etr_book_borrow) {
		this.etr_book_borrow = etr_book_borrow;
	}

	public String getEtr_user_borrow() {
		return etr_user_borrow;
	}

	public void setEtr_user_borrow(String etr_user_borrow) {
		this.etr_user_borrow = etr_user_borrow;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	
}
