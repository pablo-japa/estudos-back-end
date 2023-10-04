package controller;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import dao.AlunoDAO;
import dao.AlunoTelefoneDAO;
import model.Aluno;
import model.AlunoTelefone;
import view.AlunoView;

public class AlunoController {
	
	private AlunoDAO alunoDao;
	private AlunoTelefoneDAO alunoTelefone;
	
	public AlunoController() {
		alunoDao = new AlunoDAO();
		alunoTelefone = new AlunoTelefoneDAO();
	}
	
	public void inserirAluno(int idAluno, String nome, int idade) throws SQLException {
		Aluno novoaluno = new Aluno(idAluno, nome, idade);
		alunoDao.inserirAluno(novoaluno);
		
	}
	
}


