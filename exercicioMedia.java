package exercicio;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float salarioBruto, AdicionalNoturno, horasExtras, descontos;
		
		System.out.print("Digite o salario bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		AdicionalNoturno = scanner.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.print("Digite os descontos: ");
		descontos = scanner.nextFloat();

		
		float salarioLiquido = salarioBruto + AdicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O Salário Líquido é: " + salarioLiquido);
		scanner.close();
		
		scanner.close();
	}

}
