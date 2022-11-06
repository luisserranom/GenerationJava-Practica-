package cl.generation.f20201102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces y clases abstractas
		//clase abstrata no se puede inicializar 		
		//no se pueden instanciar clases abstractas
		
		//Animal animal = new Animal();
		Caballo caballo = new Caballo();
		caballo.comer();
		caballo.respirar();
		caballo.setPeso(1.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		//crear clase leon 
		Leon leon = new Leon();
		leon.setAltura(1.6f);
		leon.setPeso(1.6f);
		//imprimir los valores seteados
		System.out.println(leon.getAltura());
		System.out.println(leon.getPeso());
		
		//imprimir come carne
		leon.comer();
	}

}
