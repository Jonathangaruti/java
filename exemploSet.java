package exercicioExemplo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exemploSet {

	public static void main(String[] args) {
		
		Set<String> setLivros = new HashSet<String>();
		
		// Adiciona alguns livros na Colection Set
		setLivros.add("It a Coisa");
		setLivros.add("Percy Jackson");
		setLivros.add("Harry Potter");
		setLivros.add("hellraiser");
		setLivros.add("Le Petit Prince");
		setLivros.add("Harry Potter");
		
		/* Mostra o s dados armazenados an Collection Set
		 * 
		
		System.out.println("Livros na coleção: \n" + setLivros);
		
		// Verifica se um elemento está armazenado na Collection Set
		System.out.println("Tem o livro Harry Potter \n" + 
		setLivros.contains("Harry Potter"));
		
		System.out.println("------- -------");
		// Remove um elemento da Collection
		System.out.println("Removendo um item da coleção: \n"
				+ setLivros.remove("Le Petit Prince"));
		
		
		System.out.println(SetLivros);
		System.out.println("Tem o livro Le Petit Prince? \n" + 
				setLivros.contains("Le Petit Prince"));
		
		*/
		for (String livro : setLivros) {
			if(livro != null) {
				System.out.println("O HashCode do Elemento Livro" + 
			livro + " " + livro.hashCode()); 
			
			}
		}
		System.out.println("Listando todos os elementos do iterator");
		Iterator<String> iSetLivros = setLivros.iterator();
		while(iSetLivros.hasNext()) {
			
			System.out.println(iSetLivros.next());
			
		}
	}
	
}
