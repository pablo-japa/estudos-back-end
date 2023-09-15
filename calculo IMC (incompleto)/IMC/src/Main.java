import Controller.ImcController;
import Model.PessoaModel;
import java.util.Scanner;

	
	
public class Main {

	public static void main(String[] args) {
		
		ImcController imcController = new ImcController();
		Scanner scanner = new Scanner(System.in);
		
	
	int opcao = -1;
	while (opcao != 0) {
		System.out.println("-------CALCULADOR DE IMC--------");
		System.out.println("Escolha as opções a baixo:");
		System.out.println("1 - adicionar pessoa");
		System.out.println("2 - exibir lista das pessoas e suas informações");
		System.out.println("3 - remover uma pessoa");
		
		opcao = scanner.nextInt();
		
		
		switch (opcao) {
		case 1: System.out.println("Digite o nome da pessoa");
		scanner.nextLine();
		String pessoa = scanner.nextLine();
		
		System.out.println("Digite o sexo da pessoa");
		String sexo = scanner.nextLine();
		
		System.out.println("Digite a Idade da pessoa");
		int idade = scanner.nextInt();
		
		System.out.println("Digite a altura");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite o peso");
		double peso = scanner.nextDouble();
		
		System.out.println("O imc será exibido");
		double imc = scanner.nextDouble();
		
		
		imcController.adicionarPessoa(pessoa, sexo, idade, altura, peso, imc);
		break;
		
		case 2:
		
		
		
		
		}
		
	}
		

}
}


