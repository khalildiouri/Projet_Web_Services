package com.upem.bibliotheque.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Queue implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_queue;
	private String created;
	@ManyToOne
	@JoinColumn(name="etr_user_queue")
	private User user;
	@ManyToOne
	@JoinColumn(name="etr_book_queue")
	private Book book;
	
	public Queue(String created) {
		super();
		this.created = created;
	}
	

	public String getCreated() {
		return created;
	}


	public void setCreated(String created) {
		this.created = created;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public Queue() {
		// TODO Auto-generated constructor stub
	}

}
