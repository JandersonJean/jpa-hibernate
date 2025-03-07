package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("test 2");
		usuario.setEmail("test2@test.com");
		
		em.detach(usuario);
		em.merge(usuario);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}

}
