package cl.generation02112022;

public class Directivos extends DatosPersona{
	private String cargo;

	public Directivos(String nombre, String apellido, int edad, String rut, String cargo) {
		super(nombre, apellido, edad, rut);
		this.cargo = cargo;
	}

	public Directivos(String nombre, String apellido, int edad, String rut) {
		super(nombre, apellido, edad, rut);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Directivos [cargo=" + cargo + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getRut()=" + getRut() + "]";
	}
	
	
	
}
