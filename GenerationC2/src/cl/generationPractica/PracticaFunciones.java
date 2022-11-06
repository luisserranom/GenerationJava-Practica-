package cl.generationPractica;

import java.util.Scanner;

public class PracticaFunciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero que desea sumar");
		int numero1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo numero que desea sumar");
		int numero2 = sc.nextInt();
		
		System.out.println(Suma(numero1,numero2)); 
		

	}
	
	
	//funcion suma
	public static Float Suma(int fNumero1 ,int fNumero2) {
		
		float resultado = (fNumero1 + fNumero2) / 2;
		
		return resultado;
	}
	

}
