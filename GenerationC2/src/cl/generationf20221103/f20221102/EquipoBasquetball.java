package cl.generation.f20221102;

public class EquipoBasquetball { //Equipo Padre, Super Clase
	
	private String nombre;
	private String apellido;
	private int edad;
	public EquipoBasquetball() {
		super();
	}
	public EquipoBasquetball(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
	@Override
	public String toString() {
		return "EquipoBasquetball [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	//Creando el método
	public void metodoImprimir() {
		System.out.println("estoy en el método de la super clase");
	}
}
