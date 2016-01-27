package com.upem.bibliotheque.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_comment;
	private String content;
	@ManyToOne
	@JoinColumn(name="etr_user_comment")
	private User user;
	@ManyToOne
	@JoinColumn(name="etr_book_comment")
	private Book book;
	
	public Comment(String content) {
		super();
		this.content = content;
	}

	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	@Override
	public String toString() {
		return "Comment [id_comment=" + id_comment + ", content=" + content
				+ "]";
	}

	
}
