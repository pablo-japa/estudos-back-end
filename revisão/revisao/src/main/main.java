package main;

import java.util.Scanner;

import controller.ListaController;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaController listaController = new ListaController();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != -1) {
			System.out.println("aperta 1 pra testar");
			opcao = scanner.nextInt();
			
			
		switch (opcao) {
		case 1: System.out.println("id");
		int id = scanner.nextInt();
		System.out.println("titulo");
		String titulo = scanner.nextLine();
		System.out.println("descricao");
		String descricao = scanner.nextLine();
		
		listaController.adicionarTarefa(id, titulo, descricao, null);
		break;

		}
			
			
		}
		scanner.close();

	}

}
