package cl.generation25102022;

import java.util.ArrayList;

public class arregloDinamico {

	public static void main(String[] args) {
		// arrayList
		// ArrayList<tipodato> nombre_array = new Arraylist<Tipodedato>

		ArrayList<String> grupo6 = new ArrayList<String>();
		grupo6.add("javier");
		grupo6.add("julian");
		grupo6.add("francisca");
		grupo6.add("rocio");
		grupo6.add("luis");

		System.out.println(grupo6);
		// tamaño arraylist
		// size dinamico y length estatico
		System.out.println(grupo6.size());
		// obtener un elemento dentro del arreglo
		System.out.println(grupo6.get(4));
		// eliminar un elemento dentro del arraylist
		grupo6.remove(3);
		grupo6.remove(3);
		System.out.println(grupo6);
		// 6 recorrer el arraylist
		for (int i = 0; i < grupo6.size(); i++) {
			System.out.println("grupo 6 " + grupo6.get(i));

		}
		// for iterador o for de objecto o for iterator 
		System.out.println("-------------------------------------------------------");
		for (String integrante:grupo6) {
			System.out.println(integrante);
		}
		
	}

}
