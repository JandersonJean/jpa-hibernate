package teste.relacionamento;

import infra.DAO;
import modelo.relacionamento.Assento;
import modelo.relacionamento.Cliente;

public class NovoClienteAssento1 {
 public static void main(String[] args) {
	 
	Assento assento = new Assento("16B");
	Cliente cliente = new Cliente("João", assento);
	
	DAO<Object> dao = new DAO<>();
	
	dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
}
}
