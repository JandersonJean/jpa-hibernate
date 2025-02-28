package teste.relacionamento.mod2;

import infra.DAO;
import modelo.basico.Produto;
import modelo.relacionamento.mod2.ItemPedido;
import modelo.relacionamento.mod2.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Macbook", 5690.99);
		ItemPedido item = new ItemPedido(pedido, produto, 5);
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}
}
