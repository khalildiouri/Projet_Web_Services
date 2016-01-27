package com.Bank.Server;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import com.upem.bank.dao.BankDAOImpl;

public class ServeurBank {

	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.publish("http://localhost:1234/bankservice",new BankDAOImpl());
		JOptionPane.showMessageDialog(null,"arreter banque serveur");
		endpoint.stop();
	}

}
