package cl.generation02112022;

public class DatosPersona{
	private String nombre;
	private String apellido;
	private int edad;
	private String rut;
	public DatosPersona(String nombre, String apellido, int edad, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
	}
	public DatosPersona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut + "]";
	}

	

}
