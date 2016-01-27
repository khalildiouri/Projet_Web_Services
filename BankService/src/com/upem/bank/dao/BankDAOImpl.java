package com.upem.bank.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import util.HibernateUtil;

import com.upem.bank.beans.Account;

@WebService
public class BankDAOImpl implements IBankDAO {

	public BankDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@WebMethod
	public Account getAccountByIDNumber(String iban,String number,String expireDate) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Account c = null;
		Query q = session.createQuery("from Account where iban = '"
				+ iban + "' and number = '" + number + "' and expireDate = '"+expireDate+"'" );
		c = (Account) q.uniqueResult();
		return c;
	}

	@Override
	@WebMethod
	public void prelevement(Account a,double montant) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		a.setBalance(a.getBalance()-montant);
		session.merge(a);
		session.getTransaction().commit();
	}

}
