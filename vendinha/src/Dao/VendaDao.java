package Dao;


import java.util.ArrayList;
import java.util.List;
import Model.VendaModel;
import View.VendaView;
import Controller.VendaController;

public class VendaDao {
	private List<VendaModel> listaDeProdutos;
	
	public VendaDao() {
		listaDeProdutos = new ArrayList<>();
	}
	
	public void adicionarProduto(VendaDao vendaDao) {
		listaDeProdutos.add(vendaDao);
	}
	

}
