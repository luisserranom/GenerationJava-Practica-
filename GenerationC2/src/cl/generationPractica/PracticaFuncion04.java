package cl.generationPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticaFuncion04 {

	public static void main(String[] args) {
		Verdadero();

	}

	public static void Verdadero() {
		Boolean check = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lNumero = new ArrayList<Integer>();

		do {

			System.out.println("ingre un numero");
			int numero = sc.nextInt();
			lNumero.add(numero);
			
			
			if (numero % 2 == 0) {
				System.out.println("Su numero primo es: "+ numero);
				check = true;
			}else {
				System.out.println("Su numero no es primo: "+ numero);
				if(numero % 2 == 0) {//
					System.out.println("Su numero primo es: "+ numero);
					System.out.println("ingre un numero");
					numero = sc.nextInt();
					lNumero.add(numero);
				}else if(numero <=1){
					System.out.println("El numero ingresado es 1 o menor que este adios");
					check = true;
				}
			}
		} while (check == false);
		sc.close();
		

		
	}

}
