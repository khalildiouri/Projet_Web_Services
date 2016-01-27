package com.upem.selling.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class BookWS implements Serializable {

	private String isbn;
	private String title;
	private String author;
	private String description;
	private double price;
	private String category;
	private String disp;
	private int copy_number;
	private int years;
	private boolean borrowed;
	private String etr_user_book;

	public String getEtr_user_book() {
		return etr_user_book;
	}

	public void setEtr_user_book(String etr_user_book) {
		this.etr_user_book = etr_user_book;
	}

	public boolean isBorrowed() {
		return borrowed;
	}


	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public BookWS(String isbn, String title, String author, String description,
			double price, String category, int copy_number, int y) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.category = category;
		this.copy_number = copy_number;
		years = y;
		borrowed = false;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getDisp() {
		return disp;
	}

	public void setDisp(String disp) {
		this.disp = disp;
	}

	public BookWS() {
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCopy_number() {
		return copy_number;
	}

	public void setCopy_number(int copy_number) {
		this.copy_number = copy_number;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", description=" + description + ", price=" + price
				+ ", category=" + category + ", copy_number=" + copy_number
				+ "]";
	}

}
