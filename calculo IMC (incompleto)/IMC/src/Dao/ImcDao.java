package Dao;

import Model.PessoaModel;
import Controller.ImcController;
import java.util.List;package Dao;

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
		double imc = calcularImc(pessoaModel);
		pessoaModel.setImc(imc);
		listaDePessoas.add(pessoaModel);

	}

	private double calcularImc(PessoaModel pessoaModel) {
		// TODO Auto-generated method stub
		return pessoaModel.getImc();
	}

	public List<PessoaModel> obterLista() {
		return listaDePessoas;

	}


}


import java.util.ArrayList;

public class ImcDao {

	private List<PessoaModel> listaDePessoas;

	public ImcDao() {
		listaDePessoas = new ArrayList<>();
	}

	public void adicionarPessoa(PessoaModel pessoaModel) {
		listaDePessoas.add(pessoaModel);

	}
	
	public List<PessoaModel> obterLista() {
		return listaDePessoas;
		
	}
	
	
	

}
