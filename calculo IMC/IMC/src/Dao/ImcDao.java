package Dao;

import Model.PessoaModel;
import Controller.ImcController;
import java.util.List;
import java.util.ArrayList;

public class ImcDao {

	private List<PessoaModel> listaDePessoas;

	public ImcDao() {
		listaDePessoas = new ArrayList<>();
	}

	public void adicionarPessoa(PessoaModel pessoaModel) {
		listaDePessoas.add(pessoaModel);

	}
	
	

}
