package exercicioLacoRepeticao;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int mulheresCisTrans = 0, homensCisTrans = 0, pessoasBackend = 0, naoBinarios = 0, totalPessoas = 0,
				totalIdades = 0;

		char continuar;

		do {
			System.out.println("Idade: ");
			int idade = leia.nextInt();

			System.out.println(
					"Identidade de Gênero:(1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros): ");
			int genero = leia.nextInt();

			System.out.println("Pessoa Desenvolvedora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
			int tipoDesenvolvedor = leia.nextInt();

			if (tipoDesenvolvedor == 1) {
				pessoasBackend++;
			}

			if ((genero == 1 || genero == 4) && tipoDesenvolvedor == 2) {
				mulheresCisTrans++;
			}

			if (genero == 3 && tipoDesenvolvedor == 4 && idade < 30) {
				naoBinarios++;
			}

			if ((genero == 2 || genero == 5) && tipoDesenvolvedor == 3 && idade > 40) {
				homensCisTrans++;
			}
			totalPessoas++;
			totalIdades += idade;

			System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
			continuar = leia.next().charAt(0);
		} while (continuar == 'S' || continuar == 's');
		System.out.println("\nResultados:");
		System.out.println("Número de pessoas desenvolvedoras Backend: " + pessoasBackend);
		System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisTrans);
		System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisTrans);
		System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinarios);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);

		double mediaIdades = totalPessoas > 0 ? (double) totalIdades / totalPessoas : 0;
		System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdades);

		leia.close();
	}

}
