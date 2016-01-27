package com.upem.bibliotheque.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{

	@Id
	private String id_user;
	private String firstname;
	private String name;
	private String username;
	private String password;
	private String email;
	private String role;
	private String adresse;
	private String brithDate;
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Book> books;
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<BorrowBook> brrows;
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Comment> comments;
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Queue> queues;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String id_user, String firstname, String name, String username,
			String password, String email, String role, String adresse,
			String brithDate) {
		super();
		this.id_user = id_user;
		this.firstname = firstname;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.adresse = adresse;
		this.brithDate = brithDate;
	}


	public String getId_user() {
		return id_user;
	}


	public void setId_user(String id_user) {
		this.id_user = id_user;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getBrithDate() {
		return brithDate;
	}


	public void setBrithDate(String brithDate) {
		this.brithDate = brithDate;
	}


	

	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
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
		return "User [id_user=" + id_user + ", firstname=" + firstname
				+ ", name=" + name + ", username=" + username + ", password="
				+ password + ", email=" + email + ", role=" + role
				+ ", adresse=" + adresse + ", brithDate=" + brithDate + "]";
	}

	
	

}
