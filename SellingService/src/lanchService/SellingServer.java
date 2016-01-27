package lanchService;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import com.upem.selling.dao.SellingDAO;

public class SellingServer {

	public static void main(String[] args) {
		
		Endpoint end = Endpoint.publish("http://localhost:1478/sellingserviceWS", new SellingDAO());
		JOptionPane.showMessageDialog(null, "stop server ?");
		end.stop();
		
	}

}//se déplacer dans dossier src du projet client et lancer la commande 
//wsimport -keep -p com.upem.projetrmi http://localhost:1478/sellingserviceWS?wsdl
