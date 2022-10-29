package cl.generation.f20221027;

import java.util.Scanner;

public class PersonaObjeto {

	public static void main(String[] args) {
		//instancia de los objetos
		Persona ArmandoHouse = new Persona();
		//Persona Luis = new Persona();
		
		Scanner sc = new Scanner(System.in);
		//datos solicitados

		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		
		System.out.println("Ingrese su apellido");
		String apellido = sc.next();
		
		System.out.println("Ingrese su direccion");
		String direccion = sc.next();
		
		System.out.println("Ingrese su email");
		String email = sc.next();
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		
		System.out.println("Ingrese su numero");
		Integer numero = sc.nextInt();
		
		System.out.println("Ingrese su nacionalidad");
		String pais = sc.next();
		
		sc.close();
		
		ArmandoHouse.setNombre(nombre);
		ArmandoHouse.setApellido(apellido);
		ArmandoHouse.setDireccion(direccion);
		ArmandoHouse.setDireccion(email);
		ArmandoHouse.setEdad(edad);
		ArmandoHouse.setNumero(numero);
		ArmandoHouse.setNacionalidad(pais);
		
		System.out.println("****Tus Datos****");
		System.out.println("tu Nombre completo es: " + ArmandoHouse.getNombre()+ " " + ArmandoHouse.getApellido());
		System.out.println(" Tu dirrecion es: "+ ArmandoHouse.getDireccion());
		System.out.println(" Tu email es: "+ ArmandoHouse.getEmail());
		System.out.println(" Tu edad es: "+ ArmandoHouse.getEdad());
		System.out.println(" Tu numero es: "+ ArmandoHouse.getNumero());
		System.out.println(" Tu numero es: "+ ArmandoHouse.getNacionalidad());
		
		/*Persona ArmandoHouse = new Persona(ArmandoHouse.getNombre(), ArmandoHouse.getApellido(), ArmandoHouse.getDireccion(),
				ArmandoHouse.getEmail(), ArmandoHouse.getEdad(), ArmandoHouse.getNumero(), ArmandoHouse.getNacionalidad());*/
		

	}

}
