package exercicioExemplo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class exemploCollections {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double y = Double.valueOf(8);
		
		notas.add(y);
		notas.add(5.5);
		notas.add(4.5);
		notas.add(3.5);
		notas.add(4.5);
		notas.add(8.0);
		notas.add(8.25);
		notas.add(7.7);
		notas.add(2.5);
		
		System.out.println("Notas cadastradas interface interator: ");
		Iterator <Double> iNotas = notas.iterator();
		while (iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
		iNotas.next();	
		}
	
}
