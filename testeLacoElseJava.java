package exercicioLacoCondicional;

import java.util.Scanner;

public class testeLacoElseJava {

	public static void main(String[] args) {
		float n1, n2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		media = (n1+n2) / 2;
		
		if(media >= 6) {
			System.out.println("Passou!!!!");
		} else if (media == 5) {
				System.out.println("Você ficou de recuperação");
		} else {
			System.out.println("Você reprovou.");
			leia.close();
		}
	}
}
