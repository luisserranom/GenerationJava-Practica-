package cl.generation.f20221027;

public class UsoOnjeto {

	public static void main(String[] args) {
		//instancia de clase
		Auto auto1 = new Auto();
		auto1.text = "daskjdlkj "; //este si se puede cambiar valor ya que es public
		//auto1.marca = "a"; no se puede por que es private para cambiar valor
		//asignar valores a los atributos privado
		//solo atraves del metodo setter
		auto1.setColor("rojo");
		auto1.setMarca("nissan");
		
		//Consultar el contenido de los atributos
		auto1.getColor();
		auto1.getMarca();
		System.out.println(auto1.getColor());
		System.out.println(auto1.getMarca());
		//saber ek contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de auto 
		
		Auto car = new Auto("Nissan","rojo","ñuñoku",240f,22f,22f);
	}

}

// solicitar al usuario o clientes sus datos con objeto llamado nombre apellido direccion edad numero 
