package teste.relacionamento.mod1;

import infra.DAO;
import modelo.relacionamento.mod1.Assento;
import modelo.relacionamento.mod1.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		
		Assento assento = new Assento("4A");
		
		Cliente cliente = new Cliente("Jose", assento);
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.tCompleta(cliente).fechar();
	}
}
