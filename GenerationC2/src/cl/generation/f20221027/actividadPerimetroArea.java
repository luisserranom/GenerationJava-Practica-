package cl.generation.f20221027;

import java.util.Scanner;

public class actividadPerimetroArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();

	}

	// solcitia el programa
	// area de un triangulo (base * altura)/2
	// area de un rectangulo base * altura

	// opcional
	// area de un cuuadrado base * base

	public static void menu() {
		System.out.println("**************************");
		System.out.println("*          Menú          *");
		System.out.println("**************************\n");
		System.out.println("Escoja operación deseada:");
		System.out.println("1. TRIANGULO");
		System.out.println("2. RECTANGULO");
		System.out.println("3. CIRCUNFERENCIA");
		System.out.println("0. SALIR");

		System.out.println("**************************\n");
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("* Selecciona una opción *");
			opcion = sc.nextInt();

		} while (opcion < 0 || opcion > 3);
		
		switch (opcion) {
		case 1:
			System.out.println("****triangulo****");
			System.out.println("Ingrese la base del triangulo");
			Float baseT = sc.nextFloat();
			
			System.out.println("Ingrese la altura del triangulo");
			Float alturaT = sc.nextFloat();
			
			System.out.println("Ingrese el primer lado del triangulo");
			Float lado1T = sc.nextFloat();
			
			System.out.println("Ingrese el segundo lado del triangulo");
			Float lado2T = sc.nextFloat();
			
			Float areaT = (baseT * alturaT)/2;
			Float PerimetroT = baseT + lado1T + lado2T;
			
			System.out.println("El resultado del area es: "+ areaT);
			System.out.println("El resultado del perimetro es: "+ PerimetroT);
			System.out.println("****Fin resultado****");
			break;
		case 2:
			System.out.println("****Rectangulo****");
			System.out.println("Ingrese la base del Rectangulo");
			Float baseR = sc.nextFloat();
			
			System.out.println("Ingrese la altura del Rectangulo");
			Float alturaR = sc.nextFloat();
			
			Float areaR = (baseR * alturaR);
			Float PerimetroR = (baseR * baseR) + (alturaR * alturaR);
			
			System.out.println("El resultado del area es: "+ areaR);
			System.out.println("El resultado del perimetro es: "+ PerimetroR);
			
			System.out.println("****Fin resultado****");

			
			break;
		case 3:
			//System.out.println("circulo");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("ingrese datos de radio");
			double area = 0;
			double radio = sc1.nextDouble();
			double perimetro = 0;
			area = Math.PI * Math.pow(radio, 2);
			perimetro = 2 * Math.PI * radio;
			
			sc1.close();			
			System.out.println("el resultado del area del circulo es :"+ area);
			System.out.println("el resultado del perimetro del circulo es :"+ perimetro);
			break;
		case 0:
			System.out.println("salir");
			break;

		default:
			System.out.println("Opcion no valida");
			break;
		}

	}

}
//