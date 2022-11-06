package cl.generationPractica;

import java.util.ArrayList;

public class PracticaArreglo4 {

	public static void main(String[] args) {
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		Numeros.add(0);
		Numeros.add(28);
		Numeros.add(30);
		Numeros.add(10);
		Numeros.add(4);
		Integer mayor = 0;
		for (Integer numero : Numeros) {
			if(numero > mayor) {
				
				mayor = numero;
				
			}
			System.out.println(mayor);
			
		}
	}

}
