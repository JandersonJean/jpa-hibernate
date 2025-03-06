package teste.heranca.mod1;

import infra.DAO;
import modelo.heranca.mod1.Aluno;
import modelo.heranca.mod1.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(456L, "Maria", 1000);
		
		alunoDAO.tCompleta(aluno1);
		alunoDAO.tCompleta(aluno2);
		
		
		alunoDAO.fechar();

	}

}
