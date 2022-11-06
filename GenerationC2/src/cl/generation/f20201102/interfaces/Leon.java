package cl.generation.f20201102.interfaces;

public class Leon extends Carnivoro implements Generico {

	@Override
	public void respirar() {
		System.out.println("si");
		
	}

	@Override
	public void comer() {
		System.out.println("Carne");
		
	}
	

}
