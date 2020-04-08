package muca.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Cadastro;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Cadastro cad = em.find(Cadastro.class, 1); //find é uma função que busca pelo id
		
		System.out.println(cad);
		
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}

}
