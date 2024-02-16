package exercicioLacoRepeticao;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int primeiroNumero, segundoNumero;

		System.out.println("Digite o primeiro número de intervalo: ");
		primeiroNumero = leia.nextInt();

		System.out.println("Digite o segundo número de intervalo (maior que o primeiro): ");
		segundoNumero = leia.nextInt();

		if (primeiroNumero >= segundoNumero) {
			System.out.println("Intervalo inválido!");
			System.exit(0); // Sai do programa
		}

		System.out.println("No intevalo entre " + primeiroNumero + "e" + segundoNumero + ":");
		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5 ");
			}
		}

		leia.close();
	}

}
