package teste.relacionamento.mod4;

import java.util.List;

import infra.DAO;
import modelo.relacionamento.mod4.Filme;

public class ObterFilmes {

	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5); 
		
		for (Filme filme : filmes) {
			System.out.println(filme.getNome());
		}
		
	}

}
