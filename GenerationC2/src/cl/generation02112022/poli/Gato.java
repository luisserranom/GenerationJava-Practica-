package cl.generation02112022.poli;

public class Gato extends Mascota {
	private String sonido;
	//polimorfismo parametrico, el metodo se escribe igual pero recibe diferentes parametros
	public Gato() {
		super();
	}

	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	public Gato(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}

	public Gato(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
		
	}


	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getSexo()="
				+ getSexo() + "]";
	}
	@Override
	public void emitirSonido() {
		System.out.println("el sonido es: maullido mauuuuuuu ");
		
	//polimorfismo parametrico, el metodo se escribe igual pero recibe diferentes parametros
		
	}

	
	
	
	
	
	
	
}
