package exercicio;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	
		float nota1, nota2, nota3, nota4;
		System.out.print("Digite a nota 1: ");
		nota1 = scanner.nextFloat();
		
		System.out.print("Digite a nota 2: ");
		nota2 = scanner.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		nota3 = scanner.nextFloat();
		
		System.out.print("Digite a nota 4: ");
		nota4 = scanner.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média final do participante é: " + media);
		
		scanner.close();
	
	// O scanner ler as entradas do usuario.
	// System.out.println le as notas do usuario.


	}

}
