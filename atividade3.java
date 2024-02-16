package exercicioLacoCondicional;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String[] produtos = { "Cachorro Quente", "X-Salada", "X-bacon", "Bauru", "Refrigerante", "Suco de laranja" };
		double[] precos = { 10.00, 15.00, 18.00, 12.00, 8.00, 13.00 };
		int codigo, quantidade;

		System.out.println("Digite o código do produto (de 1 a 6): ");
		codigo = leia.nextInt(); // Utilizado para ler o codigo do produto

		// cada case corresponde a um codigo disponivel
		switch (codigo) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:

			System.out.print("Quantidade: ");
			quantidade = leia.nextInt();

			// calular o valor total
			double total = precos[codigo - 1] * quantidade; // o -1 utilizado para ordernar.

			System.out.println("Valor total R$: " + total);
			System.out.println("Produto: " + produtos[codigo - 1]);
			break;
		default:
			System.out.println("Código inválido, reinicie o programa.");

			leia.close();

		}

	}
}
