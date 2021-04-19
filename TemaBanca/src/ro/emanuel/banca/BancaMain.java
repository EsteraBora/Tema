package ro.emanuel.banca;

import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.banca.clientiDAO.*;
import ro.emanuel.banca.clientiPOJO.*;

import ro.emanuel.banca.dao.BancaDAO;
import ro.emanuel.banca.pojo.Banca;

public class BancaMain {
	  public static void main(String[] args) throws SQLException {

	        ArrayList<Banca> banci = BancaDAO.getBanca();
	        ArrayList<Client> client = ClientiDAO.getClient();
	        for (Banca b : banci) {
	            System.out.println(b.getId() + "| " + b.getNume() + " | " + b.getAdresa() + " | " + b.getTelefon());
	        }
	         for (Client c : client) {
          System.out.println(c.getId() + "| " + c.getNume() + " | " + c.getPrenume() + " | " + c.getCont()+ " | " + c.getSold());
      }
	        Banca BT = new Banca(1, "Banca Transilvania", "Oradea", "0786598745");
	        BancaDAO.createBanca(BT);
	        Banca BRD = new Banca(2, "BRD", "Oradea", "0786594565");
	        BancaDAO.createBanca(BRD); 
            Client c1 = new Client(1, "Pop", "Dacian", "BT789000", 5);
            ClientiDAO.createClient(c1);
            Client c2 = new Client(2, "Vladimirescu", "Maria", "BRD078659", 898);
            ClientiDAO.createClient(c2);

	        Banca x = BancaDAO.getBancaByID(1);

	            ArrayList<Banca> bancaByName = BancaDAO.getBancaByName("BRD");
	         

	            for (Banca ba: banci) {
	                BancaDAO.updateBanca(ba);
	                System.out.println(ba.getId() + "| " + ba.getNume() + " | " + ba.getAdresa() + " | " + ba.getTelefon());
	            }


	            for (Banca ba: banci) {
	                BancaDAO.deleteBanca(ba);
	                System.out.println(ba.getId() + "| " + ba.getNume() + " | " + ba.getAdresa() + " | " + ba.getTelefon());
	            }
	  
	
      

      Client y = ClientiDAO.getClientByID(1);

          ArrayList<Client> clientByName = ClientiDAO.getClientByName("c1");
       

          for (Client c: client) {
              ClientiDAO.updateClient(c);
              System.out.println(c.getId() + "| " + c.getNume() + " | " + c.getPrenume() + " | " + c.getCont()+ " | " + c.getSold());
          }


          for (Client c: client) {
              ClientiDAO.deleteClient(c);
              System.out.println(c.getId() + "| " + c.getNume() + " | " + c.getPrenume() + " | " + c.getCont()+ " | " + c.getSold());
          }
      }
}
