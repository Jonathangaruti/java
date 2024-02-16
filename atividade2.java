package exercicioExemplo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

		System.out.println("Digite 10 numeros inteiros não repetidos: ");

		// adiciona os numeros ao Set
		for (int i = 0; i < 10; i++) {
			Integer numero = leia.nextInt();

			if (!numeros.contains(numero)) {
				numeros.add(numero);
			} else {
				System.out.println("Número repetido, por favor digite novamente.");
				i--; // Decrementa para adiconar novamente
			}
		}

		// Mostra na tela todos os elementos da Collection Set
		System.out.println("listar dados do Set: ");

		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		leia.close();
	}

}
