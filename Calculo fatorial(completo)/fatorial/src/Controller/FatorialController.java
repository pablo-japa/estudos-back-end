package Controller;

import Model.FatorialModel;
import View.FatorialView;

public class FatorialController {
	
	private FatorialModel fatorialModel;
	private FatorialView fatorialView;
	
	public FatorialController(FatorialModel fatorialModel, FatorialView fatorialView) {
		this.fatorialModel = fatorialModel;
		this.fatorialView = fatorialView;
		
	}
	   public void calcularFatorial() {
	        int numero = fatorialView.lerNumero();
	        long resultado = fatorialModel.calcularFatorial(numero);
	        fatorialView.exibirResultado(resultado);
	    }
	}

