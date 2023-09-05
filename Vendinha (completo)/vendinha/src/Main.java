import Controller.VendaController;
import View.VendaView;
import Model.VendaModel;
import Dao.VendaDao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		VendaController vendaController = new VendaController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("-------------------------");
			System.out.println("Escolha sua opção");
			System.out.println("1 - Adicionar produtos");
			System.out.println("2 - exibir produtos");
			System.out.println("3 - limpar lista");
			System.out.println("4 - sair");
			System.out.println("-------------------------");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Qual produto deseja adicionar?");
				scanner.nextLine();
				String produto = scanner.nextLine();

				System.out.println("Digite o preço do produto " + produto + ":");
				double preco = scanner.nextDouble();

				vendaController.adicionarProduto(produto, preco);
				break;
			case 2:
				System.out.println("Exibindo...");
				vendaController.exibirProdutos();
				break;
			case 3:
				System.out.println("Limpando...");
				vendaController.limparListaDeProdutos();
				break;
			case 4:
				System.out.println("Saindo...");

			}
		}
		scanner.close();

	}
}
