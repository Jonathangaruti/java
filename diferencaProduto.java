package exercicio;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		System.out.print("Digite a n1: ");
		n1 = scanner.nextFloat();
		
		System.out.print("Digite a n2: ");
		n2 = scanner.nextFloat();
		
		System.out.print("Digite a n3: ");
		n3 = scanner.nextFloat();
		
		System.out.print("Digite a n4: ");
		n4 = scanner.nextFloat();
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença do produto é : " + diferenca);
		scanner.close();

	}

}
