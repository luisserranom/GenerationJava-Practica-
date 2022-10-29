package cl.generation26102022;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		//  metodos
		// 4 convinaciones
		//seccion main para llamar metodos
		
		//llamar a un metodo
		System.out.println("-----metodo1----");
		//sin parametros
		nombreMetodo();
		
		System.out.println("-----metodo2----");
		//con un parametros String
		Metodo2("Luchooo");
		
		System.out.println("-----metodo3----");
		//metodo con parametro integer
		Metodo3(3);
		
		System.out.println("-----metodo4----");
		//metodo con 2 parametros(no tiene limite) con uno integer y otro float
		Metodo4(3, 9.9f);
		System.out.println("-----metodo5----");
		//
		
		String[] arreglitos = {"a","e","i","o","u"};

		Metodo5(arreglitos);
		
		//retorno1;// no hace nada con el valor
		//System.out.println(retorno1());
		
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado + 35);
		System.out.println(valorRetornado + 35/7);
		System.out.println(valorRetornado + 35/5);
		
		
		String fullName = getObtenerNombreCompleto("luis", "Serrano", "Miranda");
		
		llamadaOtroPramatro();

	}
	//defincion o estructura de un metodo
	//void-> el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("estoy dentro del metodo inicial.....");
		
	}
	
	public static void Metodo2(String nombre) {
		System.out.println("soy" + nombre);
		
	}
	
	public static void Metodo3(Integer numero) {
		System.out.println("soy el numero " + numero);
		
	}
	public static void Metodo4(Integer numero, float numero2) {
		System.out.println("soy el numero " + numero);
		System.out.println("soy el numero2 " + numero2);
		
	}
	
	public static void Metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo "+ Arrays.toString(arreglito));

		
		
	}
	//funciones con retornos
	public static Integer retorno1() {
		Integer totalAlumnos =35;
		return totalAlumnos;
	}
	/**
	 * 
	 * @param nombre
	 * @param aPaterno
	 * @param aMaterno
	 * @return
	 */
	public static  String getObtenerNombreCompleto(String nombre, String aPaterno, String aMaterno ) {
		String nombreCompleto = nombre + " " + " aPaterno"+ " " + aMaterno;
		
		return nombreCompleto;
		
	}
	
	//metodo que llama a otro metodo
	
	public static void llamadaOtroPramatro() {
		System.out.println("Llamada a otro metodo desde otro metodo");
		Metodo4(2, 10.1f);
	}

}
