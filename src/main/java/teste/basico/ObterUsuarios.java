package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(3);
		
		List<Usuario> usuarios = query.getResultList();
		
		List<Usuario> usuarios2 = em
				.createQuery("select u from Usuario u", Usuario.class)
				.setMaxResults(3)
				.getResultList();
		
		for (Usuario usuario : usuarios) {
			System.out.println("ID: "+ usuario.getId()+" E-mail: "+usuario.getEmail());
		}
		System.out.println();
		for (Usuario usuario : usuarios2) {
			System.out.println("ID: "+ usuario.getId()+" E-mail: "+usuario.getEmail());
		}
		
		
		emf.close();
		em.close();
	}

}
