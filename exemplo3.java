package exercicioLacoCondicional;

public class exemplo3 {
	public static void main(String[] args) {
		
		int idade = 25;
		boolean possuiCarteira = true, possuiCarro = false;
		
		if(idade >= 18 && possuiCarteira && possuiCarro) {
			
			System.out.println("Pode dirigir.");
			
		} else {
			System.out.println("Não pode dirigir.");
		}
		
	}
}
