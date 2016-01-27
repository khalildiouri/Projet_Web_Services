package com.upem.converter.server;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import com.upem.converter.dao.ConverterDAOImpl;

public class ConverterServer {

	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.publish("http://localhost:1235/convertirservice",new ConverterDAOImpl());
		JOptionPane.showMessageDialog(null,"arreter convertissuer serveur");
		endpoint.stop();

	}

}
