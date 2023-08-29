package Dao;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import view.PaisView;
import controller.PaisController;

public class PaisDao {
	private List<Pais> listaDePaises;
	
	public PaisDao() {
		listaDePaises = new ArrayList<>();
	}
	
	public void adicionarPais(Pais pais){
		listaDePaises.add(pais);
	}
	
	public List<Pais> obtemListaDePaises(){
		return listaDePaises;
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(listaDePaises);

	}

	public void limparLista() {
		listaDePaises.removeAll(listaDePaises);
	}

	public void removerPais(String nome) {
		for (Pais pais : listaDePaises) {
			if (pais.getNome().equalsIgnoreCase(nome)) {
				listaDePaises.remove(pais);
				break;
			}
		}
	}
	

}