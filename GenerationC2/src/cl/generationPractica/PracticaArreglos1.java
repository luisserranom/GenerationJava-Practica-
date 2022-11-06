package cl.generationPractica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PracticaArreglos1 {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		//Lista o arreglo dinamico (ArrayList)
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		//agregar datos al arreglo dinamico (ArrayList)
		Numeros.add(0);
		Numeros.add(28);
		Numeros.add(30);
		Numeros.add(10);
		Numeros.add(4);
		
		//con forEach
		
		for (Integer Numero : Numeros) {
			System.out.println("Traer datos de ArrayList  Con for Each: " + Numero);	
		}
		//Con for normal
		for (int i = 0; i< Numeros.size(); i++) {
			System.out.println("For normal ArrayList: "+ Numeros.get(i));
			
		}
		
		
		
		System.out.println("------------------------------------");
		System.out.println("Array");
		// Crear arreglos (Array)
		int[]  Lnumeros = new int[3];
		//agregar Datos al Arreglo (Array)
		Lnumeros[0] = 1;
		Lnumeros[1] = 23;
		Lnumeros[2] = 3;
		
		System.out.println(Lnumeros.length); // imprime cantidad de elementos 
		System.out.println(Arrays.toString(Lnumeros));//imprimir array con funcion 
		
		//Recorrer array con for 
		for (int i=0; i < Lnumeros.length; i++) {
			System.out.println("Con for: " + Lnumeros[i]);
			
		}
		
		for (Integer Numero1: Lnumeros) {
			System.out.println("Traer datos de Array Con for Each: " + Numero1);	
		}
		
		
		System.out.println("---------------------------------------------");
		System.out.println("HashSet");
		//crear HashSet
		HashSet<String> ListaNombre= new HashSet<String>();
		
		//Agregar datos HashSet
		ListaNombre.add("ArmandoHouse");
		ListaNombre.add("Luis");
		ListaNombre.add("Ismael");
		ListaNombre.add("Lucho");
		
		//recorrer lista HashSet con For Each
		for (String Nombre : ListaNombre) {
			System.out.println("HashSet con ForEach: " + Nombre);
			
		}
		
		//recorrer lista HashSet con For Normal
		//averiguar
		for(int i = 0; i<ListaNombre.size(); i++ ) {
			System.out.println("HashSet con For normal: "+ ListaNombre);
		}
		
		// crear HashMap
		}

}
