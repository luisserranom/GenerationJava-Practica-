package cl.generationPractica;

import java.util.ArrayList;

public class PracticaArreglo3 {

	public static void main(String[] args) {
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		Numeros.add(0);
		Numeros.add(28);
		Numeros.add(30);
		Numeros.add(10);
		Numeros.add(4);
		Integer suma = 0;
		
		for (Integer Numero : Numeros) {
			System.out.println(Numero);
			suma = suma + Numero;
			System.out.println( "Es" + suma);
		}

	}

}
