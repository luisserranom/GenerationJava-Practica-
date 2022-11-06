package cl.generation.f20201102.interfaces;

public abstract class Animal {
	private Float peso;
	private Float altura;

	public Animal(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	

	public Animal() {
		super();
		
	}


	public Float getPeso() {
		return peso;
	}


	public void setPeso(Float peso) {
		this.peso = peso;
	}


	public Float getAltura() {
		return altura;
	}


	public void setAltura(Float altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", altura=" + altura + "]";
	}
	
	/*public void metodoEnAnimal() {
		System.out.println("Estoy en el metodo animal");
		//las clases abtracta no se pueden llamar
	}*/

	public abstract void metodoEnAnimal();{
		
	}
	
}
