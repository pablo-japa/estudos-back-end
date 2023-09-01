package View;

import java.util.List;

import Model.SistemaModel;

public class SistemaView {

	public void exibirListaDePlanetas(List<SistemaModel> listaDePlanetas) {
		System.out.println("-----Lista De Planetas-----");
		for (SistemaModel sistemaModel: listaDePlanetas ) {
			System.out.println("Planeta:" + sistemaModel.getPlaneta());
			
		}
		
		System.out.println("---------------------------");
		
		
	}

}
