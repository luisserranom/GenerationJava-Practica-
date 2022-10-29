package cl.generation25102022;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> relatores = new HashMap<Integer, String>();
		System.out.println("---------------------------------------------------");
		// 2.agregar valor al map
		relatores.put(1, "luis");
		relatores.put(2, "javier");
		relatores.put(3, "fran");
		relatores.put(4, "julian");
		relatores.put(1, "rocio");// si existe esa clave se sobreescribe el ultimo valor o values ingresado

		System.out.println("map: " + relatores);
		System.out.println("---------------------------------------------------");
		// 3-tamaño del map
		System.out.println(relatores.size());
		System.out.println("---------------------------------------------------");
		// 4acceder a un dato un objeto
		System.out.println(relatores.get(4));
		System.out.println("---------------------------------------------------");
		// 5- eliminar un par de datos
		relatores.remove(1);
		System.out.println("---------------------------------------------------");
		// 6 recorremos un map
		/*
		 * for (Map.Entry<keyType, valType> entry : map.entrySet()) { keyType key =
		 * entry.getKey(); valType val = entry.getValue();
		 * 
		 * 
		 * 
		 * }
		 */

		System.out.println("---------------------------------------------------");
		// formap
		for (Integer clave : relatores.keySet()) {
			System.out.print("clave: " + clave + " ");
			System.out.println("Valor: " + relatores.get(clave));

		}

	}

}
