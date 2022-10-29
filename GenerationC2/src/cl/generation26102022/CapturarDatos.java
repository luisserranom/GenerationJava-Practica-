package cl.generation26102022;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		float IMC = calculoIMC();
		System.out.println("su imc es: "+ " " +IMC);
		nivelIMC(IMC);
		

	}
	
	public static Float calculoIMC() {
		// capturar datos ingresados por el ususario
				Scanner sc = new Scanner(System.in);
				// calculo del IMC imc = kilos/(estatura*estatura)
				System.out.println("Ingrese si peso en kilogramos");
				Float peso = sc.nextFloat();
				System.out.println("El peso del paciente es:" + " " + peso);
				Float metro  = sc.nextFloat() ;
				System.out.println("El Estatura del paciente es:" + " " + metro);
				Float imc =  peso/(metro * metro);
				System.out.println("Su imc es de:"+ " " +imc);
				sc.close();
				
				
				
				

		
		return imc;
	}
	
	public static void nivelIMC(Float IMC) {
		if(IMC < 18.5f) {
			System.out.println("Ustes esta bajo peso");
		
		}
		else if(IMC >= 18.5 && IMC<25) {
			System.out.println("Ustes tiene un peso Noraml");
			
		}
		else if(IMC >= 25 && IMC<30) {
			System.out.println("Usted esta en sobrepeso");
		}
		else {
			System.out.println("ustes esta obeso");
		}
		
	}

}
