package cl.generation26102022;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		//do while
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		do {
			System.out.println("ingrese tu edad");
			edad = sc.nextInt();
			
			
		} while (edad <= 18);

		System.out.println("Felicidades ustes es mayor de edad");
		sc.close();
	}

}
