package Controller;

import java.util.List;
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
	
	public void adicionarPessoa(String pessoa, String sexo, int idade, double altura, double peso, double imc) {
		PessoaModel pessoaModel = new PessoaModel(pessoa, sexo, idade, altura, peso, imc);
		dao.adicionarPessoa(pessoaModel);
		
	}
	
	public void exibirLista(PessoaModel pessoaModel) {
		List <PessoaModel> listaDePessoas = dao.obterLista();
		view.exibirLista(listaDePessoas);
	}
	



}
