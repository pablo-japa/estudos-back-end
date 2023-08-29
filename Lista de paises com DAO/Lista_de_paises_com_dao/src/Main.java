import java.util.Scanner;
import controller.PaisController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar País");
			System.out.println("2. Exibir lista de Países");
			System.out.println("3. Limpar Lista");
			System.out.println("4. remover um País");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o Nome do País: ");
				scanner.nextLine();
				String nome = scanner.nextLine();

				System.out.println("Digite a capital do País: " + nome + ":");
				String capital = scanner.nextLine();

				System.out.println("Digite a população do País: ");
				int populacao = scanner.nextInt();

				paisController.adicionarPais(nome, capital, populacao);
				break;
			case 2:
				paisController.exibirListaDePaises();
				break;
			case 3:
				System.out.println("Limpando lista...");
				paisController.limparLista();
				break;
			case 4:
				System.out.println("deseja remover qual Pa´ís?");
				scanner.nextLine();
				nome = scanner.nextLine();
				paisController.removerPais(nome);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}

		}
		scanner.close();
	}

}
