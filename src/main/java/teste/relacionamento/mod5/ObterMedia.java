package teste.relacionamento.mod5;

import infra.DAO;
import modelo.relacionamento.mod5.NotaFilme;

public class ObterMedia {

	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<NotaFilme>();
		NotaFilme nota = dao.consultarUm("mediaGeral");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
	}

}
