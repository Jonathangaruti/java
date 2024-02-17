package calculadora;

import java.util.Scanner;

public class calculadoraLambda {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		float n1 = 0, n2 = 0;

		System.out.println("====================================================");
		System.out.println("              Calculadora com Lambda                ");
		System.out.println("====================================================");
		System.out.println("Digite o primeiro numero: ");
		n1 = leitor.nextFloat();
		System.out.println("Digite o primeiro numero: ");
		n2 = leitor.nextFloat();

		System.out.println("Soma = " + soma(n1, n2));
		System.out.println("Multiplicação = " + multiplicacao(n1, n2));
		System.out.println("Subtração = " + subtracao(n1, n2));
		System.out.println("Divisão = " + divisao(n1, n2));

		leitor.close();

	}

	public static float soma(float n1, float n2) {
		return n1 + n2;
	}

	public static float multiplicacao(float n1, float n2) {
		return n1 * n2;
	}

	public static float subtracao(float n1, float n2) {
		return n1 - n2;
	}

	public static float divisao(float n1, float n2) {
		return n1 % n2;
	}
}
