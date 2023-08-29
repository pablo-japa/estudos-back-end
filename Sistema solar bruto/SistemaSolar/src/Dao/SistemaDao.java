package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.SistemaModel;

public class SistemaDao {
	
	private List<SistemaModel> listaDePlanetas;
	
	public SistemaDao() {
		listaDePlanetas = new ArrayList<>();
	}
	
	public void adicionarPlaneta(SistemaModel sistemaModel) {
		listaDePlanetas.add(sistemaModel);
	}

}
