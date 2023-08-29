package Controller;

import java.util.ArrayList;
import Model.SistemaModel;
import java.util.List;
import View.SistemaView;
import Dao.SistemaDao;

public class SistemaController {
	
	private List<SistemaModel> listaDePlanetas;
	private SistemaDao sistemaDao;
	private SistemaView sistemaView;
	
	public SistemaController() {
		listaDePlanetas = new ArrayList<>();
		sistemaView = new SistemaView();
	}
	
	public void adicionarPlaneta(String planeta) {
		SistemaModel sistemaModel = new SistemaModel(planeta);
		sistemaDao.adicionarPlaneta(sistemaModel);
	}
	
	

}
