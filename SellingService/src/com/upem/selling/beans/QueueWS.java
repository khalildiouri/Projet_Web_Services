package com.upem.selling.beans;

import java.io.Serializable;


public class QueueWS implements Serializable{

	private int id_queue;
	private String created;
	private String etr_book_queue;
	private String etr_user_queue;

	
	public int getId_queue() {
		return id_queue;
	}


	public void setId_queue(int id_queue) {
		this.id_queue = id_queue;
	}


	public String getEtr_book_queue() {
		return etr_book_queue;
	}


	public void setEtr_book_queue(String etr_book_queue) {
		this.etr_book_queue = etr_book_queue;
	}


	public String getEtr_user_queue() {
		return etr_user_queue;
	}


	public void setEtr_user_queue(String etr_user_queue) {
		this.etr_user_queue = etr_user_queue;
	}


	public QueueWS(String created) {
		super();
		this.created = created;
	}
	

	public String getCreated() {
		return created;
	}


	public void setCreated(String created) {
		this.created = created;
	}



	public QueueWS() {
		// TODO Auto-generated constructor stub
	}

}
