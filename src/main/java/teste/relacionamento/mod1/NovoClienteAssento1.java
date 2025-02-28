package teste.relacionamento.mod1;

import infra.DAO;
import modelo.relacionamento.mod1.Assento;
import modelo.relacionamento.mod1.Cliente;

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
