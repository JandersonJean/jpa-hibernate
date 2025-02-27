package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Monitor 22", 760.99);
		
		//dao.abrirT().incluir(produto).fecharT().fechar();
		dao.tCompleta(produto).fechar();
		
		
	}
}
