package exercicioExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores: ");

		// Adiciona as cores no ArrayList

		for (int i = 0; i < 5; i++) {
			String cor = leia.next();
			cores.add(cor);
		}

		// Exibe as cores adicionadas
		System.out.println("lista de todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// Ordena as cores em ordem crescente
		String[] arrayCores = cores.toArray(new String[0]);
		Arrays.sort(arrayCores);

		// Mostra as cores ordenadas
		System.out.println("\n Ordenar as cores: ");
		for (String cor : arrayCores) {
			System.out.println(cor);
		}

		
		leia.close();
	}

}
