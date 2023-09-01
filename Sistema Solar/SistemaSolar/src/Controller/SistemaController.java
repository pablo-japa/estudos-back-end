package Controller;

import java.util.ArrayList;
import Model.SistemaModel;
import java.util.List;
import View.SistemaView;
import Dao.SistemaDao;

public class SistemaController {
	
	private SistemaDao sistemaDao;
	private SistemaView sistemaView;
	
	public SistemaController() {
		sistemaView = new SistemaView();
		sistemaDao = new SistemaDao();
	}
	
	public void adicionarPlaneta(String planeta) {
		SistemaModel sistemaModel = new SistemaModel(planeta);
		sistemaDao.adicionarPlaneta(sistemaModel);
	}
	
	public void exibirListaDePlanetas() {
		List <SistemaModel> listaDePlanetas = sistemaDao.obterListaDePlanetas();
		sistemaView.exibirListaDePlanetas(listaDePlanetas);
	}
	
	public void removerPlaneta(String nomePlanetaRemover) {
		boolean planetaRemovido = false;
		
		for (SistemaModel sistemaModel : sistemaDao.obterListaDePlanetas()) {
			
			if (sistemaModel.getPlaneta().equalsIgnoreCase(nomePlanetaRemover)) {
				
				sistemaDao.removerPlaneta(sistemaModel);
				planetaRemovido = true;
			}
		}
		
	}
	public void limparListaDePlanetas() {
		sistemaDao.limparListaDePlanetas();
	}
	

}
