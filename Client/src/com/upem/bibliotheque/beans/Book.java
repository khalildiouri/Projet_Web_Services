package com.upem.bibliotheque.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.upem.bibliotheque.dao.*;

@Entity
public class Book implements Serializable{

	@Id
	private String isbn;
	private String title;
	private String author;
	private String description;
	private double price;
	private String category;
	private String disp;
	private int years;
	private boolean borrowed;
	private int copy_number;
	@ManyToOne
	@JoinColumn(name="etr_user_book",nullable = true)
	private User user;
	@OneToMany(mappedBy="book")
	private List<BorrowBook> brrows;
	@OneToMany(mappedBy="book")
	private List<Comment> comments;
	@OneToMany(mappedBy="book")
	private List<Queue> queues;
	
	
	
	public Book(String isbn, String title, String author, String description,
			double price, String category, int copy_number,int y) {
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

	public boolean isBorrowed() {
		return borrowed;
	}


	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
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

	public Book() {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

	public List<BorrowBook> getBrrows() {
		return brrows;
	}

	public void setBrrows(List<BorrowBook> brrows) {
		this.brrows = brrows;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Queue> getQueues() {
		return queues;
	}

	public void setQueues(List<Queue> queues) {
		this.queues = queues;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", description=" + description + ", price=" + price
				+ ", category=" + category + ", copy_number=" + copy_number
				+ "]";
	}

	
}
