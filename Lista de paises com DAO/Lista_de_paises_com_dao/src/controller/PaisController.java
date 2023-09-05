package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Pais;
import view.PaisView;
import Dao.PaisDao;

public class PaisController {
	
	private PaisView paisView;
	private PaisDao paisDao;
	
	public PaisController() {
		
		listaDePaises = new ArrayList<>();
		paisView = new PaisView();
	}

	public void adicionarPais(String nome, String capital, int populacao) {
		Pais pais = new Pais(nome, capital, populacao);
		//listaDePaises.add(pais);
		paisDao.adicionarPais(pais);
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(paisDao.obtemListaDePaises());

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
