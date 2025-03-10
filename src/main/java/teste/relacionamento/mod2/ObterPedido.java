package teste.relacionamento.mod2;

import infra.DAO;
import modelo.relacionamento.mod2.ItemPedido;
import modelo.relacionamento.mod2.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorID(1L);
		
		for (ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}
		
		dao.fechar();
		
	}
}
