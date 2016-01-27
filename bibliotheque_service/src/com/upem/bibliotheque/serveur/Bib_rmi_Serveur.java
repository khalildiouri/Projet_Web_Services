
package com.upem.bibliotheque.serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import com.upem.bibliotheque.beans.BorrowBook;
import com.upem.bibliotheque.beans.Comment;
import com.upem.bibliotheque.dao.BibliothequeDAOImpl;
import com.upem.bibliotheque.dao.IBibliothequeDAO;

public class Bib_rmi_Serveur {

	public static void main(String[] args) {
		try {
			/*UserWebService u = new UserWebService();
			System.out.println(u.getAllCommentsByUser("kdiouri").get(0));*/
			IBibliothequeDAO c = new BibliothequeDAOImpl();
			Registry r = LocateRegistry.createRegistry(1099);
			r.rebind("BibService", c);
			/*c.addComment(new Comment("contenue"), "1");
			c.addBrrowBook(new BorrowBook("01/01/2015", "18/01/2015"), "3");*/
			System.out.println("Serveur RMI connected");
			/*Endpoint endpoint =Endpoint.publish("http://localhost:9999/userservice", new UserWebService());
			JOptionPane.showMessageDialog(null, "arreter serveur ?");
			endpoint.stop();
			*/
			
			while(true);
			
			
		} catch (Exception e) {
			System.out.println("Trouble:" + e);
		}

	}

}
