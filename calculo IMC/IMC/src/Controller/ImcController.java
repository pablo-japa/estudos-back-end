package Controller;

import Dao.ImcDao;
import Model.PessoaModel;
import View.ImcView;

public class ImcController {
	
	ImcDao dao;
	PessoaModel model;
	ImcView view;
	
	public ImcController() {
		 dao = new ImcDao();
		 view = new ImcView();
		
	}
	
	public void adicionarPessoa(String pessoa, String sexo, int idade, int altura, double peso) {
		PessoaModel pessoaModel = new PessoaModel(pessoa, sexo, idade, altura, peso);
		dao.adicionarPessoa(pessoaModel);
		
	}
	



}
