package cl.generationActividad;

import java.util.Arrays;



public class actividadArray {

	public static void main(String[] args) {
		//Escribe un arreglo de tamaño de 10,con numeros positivos y negativos,captura en maximo y minimo
		//
		int[] numeros = new  int [10];
		
		numeros[0] = -1;
		numeros[1] = -5;
		numeros[2] = -4;
		numeros[3] = 3;
		numeros[4] = 1;
		numeros[5] = 4;
		numeros[6] = 0;
		numeros[7] = 9;
		numeros[8] = -11;
		numeros[9] = 11;
		
		int mayor = 0 ;
		int menor = 0 ;
		
		
		
		for(int i = 0; i<numeros.length; i++) {
			//System.out.println(Arrays.toString(numeros));
			if(numeros[i] < menor) {
				/*System.out.println("es mayor que 0 ");*/
				menor = numeros[i];
				/*System.out.println("cantidad de numeros positivos es;" + " " + menor);*/
				
			}
			if(numeros[i] > mayor) {
				mayor = numeros[i];
				
				
			}
			
			}
		
		System.out.println("mayor " + " " + mayor);
		System.out.println("mayor " + " " + menor);
		System.out.println("--------------------------ejercicio2--------------------------------");
		int[] pares = new int [numeros.length];
		int[] impares = new int [numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			/* System.out.println("a"); */
			if (numeros[i] % 2 == 0) {
				
				pares[i] = numeros[i];
				 
			}
			else {
				impares[i] = numeros[i];
				
			}
			
			
			
			
			
		}
		
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		System.out.println("--------------------------ejercicio3--------------------------------");
		
		float suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		
		float promedio = suma / (float)numeros.length;
		System.out.println(promedio);
		
		}
		

	}

