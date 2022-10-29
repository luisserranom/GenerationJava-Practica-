package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoObjeto {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		int continuar = 2;
		
		//para agregar alumnos a la listas
		do {
			//instancia al objeto estudiante
			//Alumno alumno = new Estudiante(nombre, apellido);
			
			System.out.println("ingrese el nombre:");
			String nombre = sc.nextLine();
			
			System.out.println("ingrese el apellido:");
			String apellido = sc.nextLine();
			
			Alumno alumno = new Alumno();
			//modificando o asignando  el atributo
			alumno.setNombre(nombre);
			alumno.setApellido(apellido);;
			
			//agregamos un objeto al arreglo con add
			alumnos.add(alumno);
			
			System.out.println("desea agregar otro estudiante");
			System.out.println("(1) SI | (2)NO");
			continuar = sc.nextInt();
			
			sc.nextLine(); // CORRIGE EL ERROR DE CAPTURAR UN NUMERO DESPUES DE UN TEXTO
			
			
		}while (continuar == 1 );
			
			//recorrer la lista de alumnos
			for (Alumno alumno : alumnos) {
				System.out.println("nombre: " + alumno.getNombre());
				System.out.println("apellido: " + alumno.getApellido());
			}
			
			
			//obtener un estudiante especifico por pocison
			System.out.println(alumnos.get(0));
			
			//accedemos a un atributo del objeto
			System.out.println(alumnos.get(0).getNombre());
	}
	
	
	
	

}
