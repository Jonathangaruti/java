package exercicio14do02;

import java.util.Scanner;

public class exercicioVetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar: ");
		int numeroDigitado = leitor.nextInt();

		boolean digitado = false;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroDigitado) {
				System.out.println("O numero " + numeroDigitado + " está localiado na posição "+ i +" do vetor.");
				digitado = true;
				break;
			}

		}
		if (!digitado) {
			System.out.println("o numero" + numeroDigitado + "não foi encontrado!");

		}
		leitor.close();
	}

}
