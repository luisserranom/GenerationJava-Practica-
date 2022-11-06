package cl.generationPractica;

import java.util.Scanner;

public class PracticaFunciones2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero");
		int numero = sc.nextInt();
		
		sc.close();
		NumeroPar(numero);
		

	}
	
	public static int NumeroPar (int fNumero) {
		
		
		if (fNumero % 2 == 0) {
			System.out.println("Es par");
			fNumero = fNumero - 1;
			System.out.println(fNumero);
		}
		else {
			System.out.println("Es impar");
			fNumero = fNumero - 2;
			System.out.println(fNumero);
		}
		
		return fNumero;
	}

}
