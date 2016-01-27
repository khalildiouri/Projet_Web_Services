package com.upem.bibliotheque.dao;

import com.upem.bankservices.Account;

public interface IbankService {
	public Account getAccountByIDNumber(String iban,String number,String expireDate);
	public void prelevement(Account a,double mt);
}
