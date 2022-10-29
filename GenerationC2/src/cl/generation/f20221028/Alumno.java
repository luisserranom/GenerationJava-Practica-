package cl.generation.f20221028;

public class Alumno {
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String correo;
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param rut
	 * @param correo
	 */
	public Alumno(String nombre, String apellido, Integer edad, String rut, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.correo = correo;
	}

	
	public Alumno() {
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut + ", correo="
				+ correo + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
