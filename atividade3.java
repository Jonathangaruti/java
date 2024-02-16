package exercicioLacoRepeticao;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int [10];
		int multiplosDeTres = 0;
		int soma = 0;
		int i = 0;
		
		do {
			System.out.println("Digite numeros inteiros: " + (i + 1) + ":");
			numeros[i] = leia.nextInt();
			
			if (numeros[i] == 0)
			{
				System.out.println("numero Zero digitado, loop finalizado.");
				break;
			}
			
			if (numeros[i] % 3 == 0) {
				multiplosDeTres++;
				soma += numeros[i];
			}
			
		i++;
		
		} while ( i < 10);
		if (multiplosDeTres > 0) {
			double media = (double) soma / multiplosDeTres;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		} else {
			System.out.println("Nenhum número multipo de 3 foi encotrado.");
		}
		
		leia.close();
		
		
	}
	
}
