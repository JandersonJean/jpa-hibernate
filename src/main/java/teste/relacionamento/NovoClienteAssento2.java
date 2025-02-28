package teste.relacionamento;

import infra.DAO;
import modelo.relacionamento.Assento;
import modelo.relacionamento.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		
		Assento assento = new Assento("4A");
		
		Cliente cliente = new Cliente("Jose", assento);
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.tCompleta(cliente).fechar();
	}
}
