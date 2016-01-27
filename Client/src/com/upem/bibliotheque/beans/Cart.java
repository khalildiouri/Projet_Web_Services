package com.upem.bibliotheque.beans;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cart implements Serializable {

	private String titre;
	private String author;
	private double prix;
	private String isbn;

	@Override
	public String toString() {
		return "Cart [titre=" + titre + ", author=" + author + ", prix=" + prix
				+ ", isbn=" + isbn + "]";
	}

	public Cart(String titre, String author, double prix, String isbn) {
		super();
		this.titre = titre;
		this.author = author;
		this.prix = prix;
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}

}
