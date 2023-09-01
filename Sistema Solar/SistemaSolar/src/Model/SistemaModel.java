package Model;
import Controller.SistemaController;
import View.SistemaView;

public class SistemaModel {
	
	private String planeta;
	
	public SistemaModel(String planeta) {
		this.planeta = planeta;
		
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	
	
	
	

}
