package cl.generation02112022.poli;

public class Perro extends Mascota {

	private String sonido;

	public Perro() {
		super();
	}

	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + "]";
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("el sonido es: ladrillo guaaauu ");
	}
}
