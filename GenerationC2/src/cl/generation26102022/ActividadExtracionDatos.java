package cl.generation26102022;

import java.util.Scanner;

public class ActividadExtracionDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su nombre \n");
		String nombre = sc.next();
		System.out.println("ingrese su primer apellido \n");
		String pApellido = sc.next();
		System.out.println("ingrese su segundo apellido \n");
		String sApellido = sc.next();
		System.out.println("ingrese su edad \n");
		String edad = sc.next();

		sc.close();
		String fullName = getfullName(nombre, pApellido, sApellido, direccion, email, numero);
		System.out.println(fullName);

	}

	/**
	 * 
	 * @param mNombre
	 * @param mPApellido
	 * @param mSApellido
	 * @param medad
	 * @param mIMC
	 * @param mNivel
	 * @return
	 */
	
	public static String getfullName(String mNombre, String mPApellido, String mSApellido, String medad,Float mIMC, Float mNivel ) {
		String nombreCompleto = "----------------------------------------------------" + "\n Tus datos uwu"
				+ "\n Su nombre completo es:" + " " + mNombre + " " + mPApellido + " " + mSApellido
				+ "\n Su edad es:" + " " + medad
				 
				+ "\n ----------------------------------------------------";
		return nombreCompleto;
	}

}
