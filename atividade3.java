package loops;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		int[] idade = new int[11]; // cria uma array com a quantidade de vezes você delimitar
		int maiores = 0, menores = 0; 

		Scanner leia = new Scanner(System.in); // não esquecer de iniciar o contador
		int i = 0;

		while (i < idade.length) // atribuição no index 
			{ 
			System.out.println("Digite uma idade " + (i + 1) + ": ");
			idade[i] = leia.nextInt();
			
			if(idade[i] < 0) {
				System.out.println("idade negativa, loop encerrado.");
				break;  // serve para encerrar o loop
			}

			
			if (idade[i] < 21) {
				menores++;
			} else if (idade[i] > 50) {
				maiores++;
			}
			
			i++; // serve para dizer ao contador prosseguir para o proximo numero
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);

		leia.close();
	}

}
