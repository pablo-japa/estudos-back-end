package View;

import java.util.Scanner;
import Model.FatorialModel;
import Controller.FatorialController;

public class FatorialView {
	
	public int lerNumero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo:");
		return scanner.nextInt();
	}
	
	public void exibirResultado(long resultado) {
		System.out.println("O Fatorial é " + resultado);
		
	}


}

	