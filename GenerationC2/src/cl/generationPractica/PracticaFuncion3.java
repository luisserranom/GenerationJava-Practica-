package cl.generationPractica;

import java.text.BreakIterator;
import java.util.Scanner;

public class PracticaFuncion3 {

	public static void main(String[] args) {
		Double numero = 0.0;
		Grado(numero);
		

	}
	
	public static Double Grado( Double fTemperatura ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la temperatura en grado celsius");
		fTemperatura = sc.nextDouble();
		 Double resultado = 0.0;
		if(fTemperatura == -999) {
			
			
			System.out.println("Temperatura ingresada es igual a -999");
			System.out.println("Vuelve a intentarlo mas tarde");
			
			
			
		}
		else {
			resultado = (fTemperatura * 1.8f ) + 32;
			System.out.println("El resultado es: " + resultado);
			
		}
		return resultado ;
	}

}
