package main;

import java.sql.SQLException;
import java.util.Scanner;

import controller.AlunoController;

public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		AlunoController alunoController = new AlunoController();

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adicionar Aluno");
			System.out.println("2 - Adicionar Telefone");
			System.out.println("3 - Listar Alunos");
			System.out.println("4 - Exibir Aluno");
			System.out.println("5 - Atualizar Aluno");
			System.out.println("6 - Excluir Aluno");
			System.out.println("0 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha após a leitura do número

			switch (opcao) {
			case 1:
				System.out.println("escreva o ID do aluno:");
				int idAluno = scanner.nextInt();
				scanner.nextLine();
				System.out.println("escreva o nome do aluno:");
				String nome = scanner.nextLine();
				System.out.println("escreva a idade do aluno:");
				int idade = scanner.nextInt();
				alunoController.inserirAluno(idAluno, nome, idade);

				break;
			case 2:
				//alunoController.adicionaTelefone();
				//break;
//			case 3:
//				alunoController.listaAlunos();
//				break;
//			case 4:
//				alunoController.exibeAluno();
//				break;
//			case 5:
//				alunoController.atualizaAluno();
//				break;
//			case 6:
//				alunoController.excluiAluno();
//				break;
//			case 0:
//				System.out.println("Saindo...");
//				scanner.close();
//				System.exit(0);
				default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
