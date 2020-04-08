package muca.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Cadastro;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Cadastro cad = em.find(Cadastro.class, 1); //tem que fazer uma busca depois chamar o begin e finalizar com o commit
		em.getTransaction().begin();
		em.remove(cad);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}

}
