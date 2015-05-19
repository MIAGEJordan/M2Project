package web;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Joueur;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		Joueur joueur = new Joueur();
		joueur.setName("toto");
		
		Joueur joueur2 = new Joueur();
		joueur2.setName("titi");
		

		
		entityManager.persist(joueur);	
		entityManager.persist(joueur2);
		
		tx.commit();
	}

}
