import Controller.ImcController;
import Model.PessoaModel;
import java.util.Scanner;

	
	
public class Main {

	public static void main(String[] args) {
		
		ImcController imcController = new ImcController();
		Scanner scanner = new Scanner(System.in);
		
	
	int opcao = -1;
	while (opcao >= 0) {
		System.out.println("-------CALCULADOR DE IMC--------");
		System.out.println("Escolha as op��es a baixo:");
		System.out.println("1 - adicionar pessoa");
		System.out.println("2 - exibir lista das pessoas e suas informa��es");
		System.out.println("3 - remover uma pessoa");
		
		
		switch (opcao) {
		case 1: System.out.println("Digite o nome da pessoa");
		scanner.nextLine();
		String pessoa = scanner.nextLine();
		
		System.out.println("Digite o sexo da pessoa");
		String sexo = scanner.nextLine();
		
		System.out.println("Digite a Idade da pessoa");
		int idade = scanner.nextInt();
		
		System.out.println("Digite a altura");
		int altura = scanner.nextInt();
		
		System.out.println("Digite o peso");
		double peso = scanner.nextDouble();
		
		imcController.adicionarPessoa(pessoa, sexo, idade, altura, peso);
		
		
		
		}
		
	}
		

}
}

