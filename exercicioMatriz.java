package exercicio14do02;

import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double[][] notas = new double[10][4];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas de todos os participantes " + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				System.out.println("Bimestre" + (j + 1) + ": ");
				notas[i][j] = leitor.nextDouble();
			}
		}

		double[] media = new double[10];
		for (int i = 0; i < 10; i++) {
			double totalNotas = 0;
			for (int j = 0; j < 4; j++) {
				totalNotas += notas[i][j];
			}
			media[i] = totalNotas / 4;
		}
		System.out.println("Média dos participantes:");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Participante %d: %.1f%n", (i + 1), media[i]);
		}

		leitor.close();
	}

}
