package cl.generation.f20221027;

public class Auto {
	


	//investigar herencia y encapsulamiento
	//(Buena Practica)
	//atributos
	private String marca;// "Nissan"	
	private String color; //"Negro"
	private String modelo; // "ñuñuqui"
	private Float cilindrada; //1,6 o 2,4
	private Float rendimiento;// 10.5 km/l
	private Float velocidad;// km/h
	public  String text;
	
	//Constructor 
	// nos permite instanciar al objeto 
	// tambie nos permite inicializar los atributos
	/**
	 * 
	 * @param marca
	 * @param color
	 * @param modelo
	 * @param cilindrada
	 * @param rendimiento
	 * @param velocidad
	 */
	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	
	}
	
	public Auto() {
		super();
	}
	//GETTER Y SETTERS (ACCESADOR Y MUTADOR )
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	
	//METODOS DEL OBJETO(Acciones)}
	public void avanzar() {
		System.out.println("estoy en el metodo avanzar del objeto");
	}


	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
	
	
	
	
}
