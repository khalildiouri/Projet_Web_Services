package test;

import com.upem.bank.beans.Account;
import com.upem.bank.dao.BankDAOImpl;

public class TestBank {

	public static void main(String[] args) {
		BankDAOImpl bank = new BankDAOImpl();
		Account a = bank.getAccountByIDNumber("123456", "123456", "01/01/2016");
		System.out.println(a);
		bank.prelevement(bank.getAccountByIDNumber("123456", "123456", "01/01/2016"), 111);

	}

}
