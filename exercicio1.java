package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leitor = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("*********** MENU ***********\n");
			System.out.println("1 - Adicionas clientes na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("****************************");

			opcao = leitor.nextInt();
			leitor.nextLine(); // Após a leitura acontece uma quebra de linha.

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do Cliente: ");
				String nome = leitor.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado à fila.");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					System.out.println("Clientes na fila: " + fila);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteAtendido = fila.poll(); // Retira o cliente da fila
					System.out.println("Cliente atendido: " + clienteAtendido);
					
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Seu computador vai pegar virus.");
				break;
			}
		} while (opcao != 0);

		leitor.close();

	}

	
}
