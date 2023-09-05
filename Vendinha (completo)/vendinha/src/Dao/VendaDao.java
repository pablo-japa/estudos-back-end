package Dao;

import java.util.ArrayList;
import java.util.List;
import Model.VendaModel;
import Controller.VendaController;

public class VendaDao {
	private List<VendaModel> listaDeProdutos;

	public VendaDao() {
		listaDeProdutos = new ArrayList<>();
	}

	public void adicionarProduto(VendaModel vendaModel) {
		listaDeProdutos.add(vendaModel);
	}

	public List<VendaModel> obterListaProdutos() {
		return listaDeProdutos;

	}

	public void limparListaVenda() {
		listaDeProdutos.clear();
	}

}
