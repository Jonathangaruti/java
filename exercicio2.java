package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Stack<String> livros = new Stack<>();

		int opcao;

		do {

			System.out.println("*********** MENU ***********\n");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair do programa");
			System.out.println("****************************");

			opcao = leitor.nextInt();
			leitor.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro para ser adicionado: ");
				String nome = leitor.nextLine();
				livros.add(nome);
				System.out.println("Livro adicionado na pilha");
				break;

			case 2:
				if (livros.empty()) {
					System.out.println("A pilha de livros está vazia");
				} else {
					System.out.println("Livros na pilha: " + livros);
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha de livros está vazia.");
				} else {
					String livrosRetirados = livros.pop();
					System.out.println("Um livro foi retirado da pilhado:" + livrosRetirados);
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. cuidado para não pegar virus.");
				break;
			}
		} while (opcao != 0);
		leitor.close();

	}

}
