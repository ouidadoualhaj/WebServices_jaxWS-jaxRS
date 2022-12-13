package app.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ouidad");
				
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		System.out.println("COMITTING");
		

		//Station s=new Station(0,"gaz","tanger","tanger 23");
		//em.persist(s);
		
		Carburant c=new Carburant(0,"gazoile","pur");
		em.persist(c);
		
		em.getTransaction().commit();
	}
}