package cl.generation.f20201102.interfaces;

public class Humano extends Ornivoro implements Generico{
	private Boolean razonamiento;

	public Humano(Boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public Humano() {
		super();
	}

	public Boolean getRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(Boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public String toString() {
		return "Humano [razonamiento=" + razonamiento + "]";
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
