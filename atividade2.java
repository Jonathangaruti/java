package exercicioLacoCondicional;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}

		if (numero > 0) {
			System.out.println("O número é positivo");
		} else if (numero < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é zero");
			leia.close();
		}
	}
}
