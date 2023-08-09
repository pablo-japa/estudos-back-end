import java.util.Scanner;
import Controller.CaixaController;
import View.CaixaView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaixaView caixaView = new CaixaView();
		CaixaController caixaController = new CaixaController(0.0, caixaView);
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
		System.out.println("==== Menu ====");
		System.out.println("1. Exibir Saldo");
		System.out.println("2. Depositar");
		System.out.println("3. Sacar Saldo");
		System.out.println("4. Sair");
		System.out.print("Escolha uma opção: ");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			caixaController.saldoAtual();
			break;
		case 2:
			System.out.println("Quantidade a depositar: ");
			//double valorDeposito = scanner.nextDouble();
			//caixaController.depositarSaldo(valorDeposito, valorDeposito);
			double valorDeposito = scanner.nextDouble();
            caixaController.depositarSaldo(valorDeposito);			
			break;
		case 3:
			System.out.println("Valor a Sacar: ");
			double valorSaque = scanner.nextDouble();
			caixaController.sacarSaldo(valorSaque);
			break;
		default:
			System.out.println("-------Caixa Eletrônico-------");
			System.out.println("Saindo...");
			System.out.println("--------//---------//---------");
		}
		}
		scanner.close();

	}
}
