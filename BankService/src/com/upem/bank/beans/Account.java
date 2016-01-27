package com.upem.bank.beans;

import java.io.Serializable;




public class Account implements Serializable{

	
	private int id_account;
	private String number;
	private String name;
	private String expireDate;
	private double balance;
	private String iban;
	private String currency;
	
	@Override
	public String toString() {
		return "Account [id_account=" + id_account + ", number=" + number
				+ ", name=" + name + ", expireDate=" + expireDate
				+ ", balance=" + balance + ", iban=" + iban + ", currency="
				+ currency + "]";
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_account() {
		return id_account;
	}
	public void setId_account(int id_account) {
		this.id_account = id_account;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Account(String number, String name, String expireDate,
			double balance, String iban, String currency) {
		super();
		this.number = number;
		this.name = name;
		this.expireDate = expireDate;
		this.balance = balance;
		this.iban = iban;
		this.currency = currency;
	}
	
	
	

}
