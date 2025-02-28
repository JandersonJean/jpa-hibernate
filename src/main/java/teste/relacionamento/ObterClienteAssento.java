package teste.relacionamento;

import infra.DAO;
import modelo.relacionamento.Assento;
import modelo.relacionamento.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getNome());
		daoCliente.fechar();
		
		
		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(3L);
		System.out.println(cliente.getAssento().getCliente().getNome());
		daoAssento.fechar();
		
	}

}
