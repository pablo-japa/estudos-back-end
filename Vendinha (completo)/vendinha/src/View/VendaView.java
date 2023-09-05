package View;

import java.util.List;

import Model.VendaModel;
import Controller.VendaController;
import Dao.VendaDao;

public class VendaView {

	public void exibirProdutos(List<VendaModel> listaDeProdutos) {
		System.out.println("-------Lista De Produtos-------");

		for (VendaModel vendaModel : listaDeProdutos) {
			System.out.println("Produto: " + vendaModel.getProduto());
			System.out.println("Preço: " + vendaModel.getPreco());
		}

		System.out.println("-----------------------------");

	}

}
