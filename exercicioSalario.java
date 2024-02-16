package exercicio;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salario;
		System.out.print("Digite o salario: ");
		salario = scanner.nextFloat();
		float abono;
		System.out.print("Digite o abono: ");
		abono = scanner.nextFloat();
		float novoSalario = (salario + abono);
		System.out.println("O novo salário é: " + novoSalario);
		scanner.close();
	}

}
