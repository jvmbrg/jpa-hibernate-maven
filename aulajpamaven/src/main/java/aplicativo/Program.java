package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "João Vítor", "joaovitor@gmail.com");
		Pessoa p2 = new Pessoa(null, "Felipe Draugovich", "fdraugovich@outlook.com");
		Pessoa p3 = new Pessoa(null, "Lewis Hamilton", "lwh@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//getTransiction().begin() e .commit() sempre são usados quando a operação não for uma consulta
		/* COMANDOS PARA ADICIONAR DADOS NO BANCO
			em.getTransaction().begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.getTransaction().commit();
		*/
		
		/* COMANDOS PARA BUSCA DE DADOS NO BANCO
			Pessoa p = em.find(Pessoa.class, 2);
			System.out.println(p);
		*/
		
		/* COMANDOS PARA DELETAR DADOS NO BANCO
		Pessoa p = em.find(Pessoa.class, 2);
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
		*Aqui é necessário que o Objeto esteja mapeado, ou seja, esse obejto precisa ter sido buscado no banco de dados antes ou
		*precisa ter sido inserido no banco recentemente, por que ainda vai constar na memoria da aplicação*
		*/ 
		
		System.out.println("pronto");
		em.close();
		emf.close();
		
	}

}
