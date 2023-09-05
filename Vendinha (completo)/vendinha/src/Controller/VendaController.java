package Controller;

import java.util.List;
import Model.VendaModel;
import View.VendaView;
import Dao.VendaDao;

public class VendaController {
	private VendaDao vendaDao;
	private VendaView vendaView;

	public VendaController() {
		 vendaView = new VendaView();
		 vendaDao = new VendaDao();

	}

	public void adicionarProduto(String produto, double preco) {
		VendaModel vendaModel = new VendaModel(produto, preco);
		vendaDao.adicionarProduto(vendaModel);

	}

	public void exibirProdutos() {
		List<VendaModel> listaDeProdutos = vendaDao.obterListaProdutos();
		vendaView.exibirProdutos(listaDeProdutos);

	}

	public void limparListaDeProdutos() {
		vendaDao.limparListaVenda();
	}
}
