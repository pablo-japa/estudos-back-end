package Main;
import java.util.Scanner;
import Controller.SistemaController;
import Model.SistemaModel;


public class main {

	public static void main(String[] args) {
		
		SistemaController sistemaController = new SistemaController();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("------------Lista De Planetas-------------");
			System.out.println("1 - Inserir um planeta");
			System.out.println("2 - exibir lista de planetas");
			System.out.println("3 - Remover um planeta");
			System.out.println("4 - limpar lista");
			System.out.println("-------------------------------------------");
				
			
			
				opcao = scanner.nextInt();
				
				switch (opcao) {
				
				case 1:
					System.out.println("Digite o nome do planeta");
					scanner.nextLine();
					String planeta = scanner.nextLine();
					sistemaController.adicionarPlaneta(planeta);
					break;
					
				case 2: 
					sistemaController.exibirListaDePlanetas();
					break;
					
				case 3:
					System.out.println("Qual planeta deseja apagar?");
					scanner.nextLine();
					
					String nomePlanetaRemover = scanner.nextLine();
					
					sistemaController.removerPlaneta(nomePlanetaRemover);
					break;
				case 4:
					sistemaController.limparListaDePlanetas();
					System.out.println("Todos os planetas foram apagados");
					break;
				
				default:
					System.out.println("Opção invalida");
					break;
			
			}
		
		
		}	
	}

}
