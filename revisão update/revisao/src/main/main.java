package main;

import java.util.Scanner;

import model.ListaModel;
import model.ListaModel.Status;
import controller.ListaController;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaController listaController = new ListaController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("aperta 1 pra testar");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("id");

				int id = scanner.nextInt();
				scanner.nextLine();

				System.out.println("titulo");

				String titulo = scanner.nextLine();

				System.out.println("descricao");

				String descricao = scanner.nextLine();

				System.out.println("Status");

				String status = scanner.nextLine();
				if (status.equalsIgnoreCase("A")) {
					listaController.adicionarTarefa(id, titulo, descricao, ListaModel.Status.A);
				} else if (status.equalsIgnoreCase("P")) {
					listaController.adicionarTarefa(id, titulo, descricao, ListaModel.Status.P);
				} else if (status.equalsIgnoreCase("C")) {
					listaController.adicionarTarefa(id, titulo, descricao, ListaModel.Status.C);
				}

				break;
			case 2:
				System.out.println("Limpando lista >:)");
				listaController.limparLista();
			}

		}
		scanner.close();

	}

}
