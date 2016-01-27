package com.upem.bibliotheque.dao;

import com.upem.bankservices.Account;
import com.upem.bankservices.BankDAOImpl;
import com.upem.bankservices.BankDAOImplService;

public class BankService implements IbankService{
	BankDAOImpl dao;
	public BankService() {
		dao = new BankDAOImplService().getBankDAOImplPort();
		
	}
	
	public BankDAOImpl getDao() {
		return dao;
	}

	public void setDao(BankDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	public Account getAccountByIDNumber(String iban,String number,String expireDate) {
		// TODO Auto-generated method stub
		return dao.getAccountByIDNumber(iban,number,expireDate);
	}

	@Override
	public void prelevement(Account a, double mt) {
		dao.prelevement(a, mt);
		
	}

}
