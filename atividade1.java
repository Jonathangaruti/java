package exercicioLacoCondicional;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		float numeroA, numeroB, numeroC, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o priemiro numero: ");
		numeroA = leia.nextFloat();

		System.out.println("Digite o segundo numero: ");
		numeroB = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		numeroC = leia.nextFloat();
		
		soma = (numeroA + numeroB);
		
		if (soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if(soma == numeroC) {
			System.out.println("A Soma de A + B é Igual a C");
		}
		leia.close();
		
		
		
	}
	
}
