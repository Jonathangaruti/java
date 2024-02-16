package loops;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int totalPositivos = 0;

		Scanner leia = new Scanner(System.in);
		int i = 0;

		do {
			System.out.println("Digite um numero inteiro " + (i + 1) + ";");
			numeros[i] = leia.nextInt();

			if (numeros[i] == 0)
			{
				System.out.println("numero Zero digitado, loop finalizado.");
				break;
			}

			if (numeros[i] > 0) {
				totalPositivos += numeros[i];
			}
			
			i++;

		} while (i < numeros.length);

		System.out.println("A soma dos numeros positivos é: " + totalPositivos);
		leia.close();
	}
}
