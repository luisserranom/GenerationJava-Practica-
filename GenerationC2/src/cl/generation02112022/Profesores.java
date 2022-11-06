package cl.generation02112022;

public class Profesores extends DatosPersona{
	private String asignatura;
	private String curso;
	//contructores
	public Profesores(String asignatura, String curso) {
		super();
		this.asignatura = asignatura;
		this.curso = curso;
	}
	public Profesores() {
		super();
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Profesores [asignatura=" + asignatura + ", curso=" + curso + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getRut()=" + getRut() + "]";
	}
	
	
	
	
	
}
