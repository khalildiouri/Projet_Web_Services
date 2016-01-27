package com.upem.selling.beans;

import java.io.Serializable;


public class CommentWS implements Serializable{

	private int id_comment;
	private String content;
	private String etr_book_comment;
	private String etr_user_comment;
	
	
	
	public int getId_comment() {
		return id_comment;
	}

	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}

	public String getEtr_book_comment() {
		return etr_book_comment;
	}

	public void setEtr_book_comment(String etr_book_comment) {
		this.etr_book_comment = etr_book_comment;
	}

	public String getEtr_user_comment() {
		return etr_user_comment;
	}

	public void setEtr_user_comment(String etr_user_comment) {
		this.etr_user_comment = etr_user_comment;
	}

	public CommentWS(String content) {
		super();
		this.content = content;
	}

	public CommentWS() {
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	@Override
	public String toString() {
		return "Comment [id_comment=" + id_comment + ", content=" + content
				+ "]";
	}

	
}
