package cl.generation02112022.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		
		Perro perro = new Perro();
		perro.emitirSonido();
		
		Gato gato = new Gato();
		gato.emitirSonido();
		
		System.out.println("-----------------");
		
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		Mascota michi = new Gato();
		michi.emitirSonido();
		/*que es el polimorfismo
		 * Una super clase como una clase hija, pero no es la clase hija
		 *  debe existir herencia
		 *  */
		michi.horasSiesta(16.5F);
		//POLIMORFISMO DE INCLUSION
		
		//Perro dog = (Perro) new Mascota();
		Perro dog = (Perro) regalon;
		
	}

}
