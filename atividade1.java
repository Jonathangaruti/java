package loops;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		int pares = 0;
		int impares = 0;

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i +1) + "º numero: ");
			numeros[i] = leia.nextInt();

			
			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

		}
		
		System.out.println("total de números pares: " + pares);
		System.out.println("total de números impares: " + impares);
		leia.close();

	}

}
