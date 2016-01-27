package com.upem.bank.dao;

import com.upem.bank.beans.Account;

public interface IBankDAO {
	
	public Account getAccountByIDNumber(String number,String expireDate,String iban);
	public void prelevement(Account a,double mt);
}
