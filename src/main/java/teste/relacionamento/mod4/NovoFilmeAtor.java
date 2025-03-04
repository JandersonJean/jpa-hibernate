package teste.relacionamento.mod4;

import infra.DAO;
import modelo.relacionamento.mod4.Ator;
import modelo.relacionamento.mod4.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme("O Senhor dos Anéis", 9.9);
		Ator atorA = new Ator("Ian McKellen");
		Ator atorB = new Ator("Orlando Bloom");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.tCompleta(filmeA);
		
	}
}
