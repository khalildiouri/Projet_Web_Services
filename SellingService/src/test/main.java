package test;

import java.rmi.RemoteException;
import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

import com.upem.selling.beans.BookWS;
import com.upem.selling.beans.UserWS;
import com.upem.selling.dao.SellingDAO;

public class main {
	
	public main() {
		SellingDAO dao =new SellingDAO();
		dao.getAllBookForSelling();
	}
	
	
	public static void main(String[] args) {
		new main();

	}

}
