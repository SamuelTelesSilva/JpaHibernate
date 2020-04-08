package muca.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Cadastro;

public class Programa {

	public static void main(String[] args) {
		
		Cadastro cad1 = new Cadastro(null, "Samuel", "Teles", "21", "Masculino", "samuel.silva@uni9.edu.br", "55533");
		Cadastro cad2 = new Cadastro(null, "Samuel", "Teles", "21", "Masculino", "samuel.silva@uni9.edu.br", "55533");
		Cadastro cad3 = new Cadastro(null, "Samuel", "Teles", "21", "Masculino", "samuel.silva@uni9.edu.br", "55533");
		
		/*EntityManagerFactory Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager
		 EntityManager encapsula uma conexão com a base de dados
		 *  e serve para efetuar operações de acesso a dados (inserção, remoção, deleção, atualização) em entidades
		 */
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //name que eu coloquei no persistence.xml
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); //inicia uma transação com o BD
		em.persist(cad1);
		em.persist(cad2);
		em.persist(cad3);
		em.getTransaction().commit(); //confirma as alterações realizadas
		
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}

}
