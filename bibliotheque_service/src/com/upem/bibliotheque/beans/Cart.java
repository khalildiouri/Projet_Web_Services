package com.upem.bibliotheque.beans;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cart implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cart;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

}
