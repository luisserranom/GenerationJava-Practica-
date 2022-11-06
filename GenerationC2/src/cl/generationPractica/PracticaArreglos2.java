package cl.generationPractica;

import java.util.ArrayList;

public class PracticaArreglos2 {

	public static void main(String[] args) {
	ArrayList<Integer> Numeros = new ArrayList<Integer>();
	Numeros.add(0);
	Numeros.add(28);
	Numeros.add(30);
	Numeros.add(10);
	Numeros.add(4);
	
	for (int i=0; i<Numeros.size(); i++) {
		aux = Numeros[i];
        Numeros[i] = Numeros[Numeros.length-1-i];
        Numeros[Numeros.size(-1-i)] = aux;
	}
	}

}
