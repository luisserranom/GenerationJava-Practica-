package cl.generationf20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		
		usuario.getTelefonos().add("321312");
		
		usuario.getTelefonos().add("32792");
		usuario.getTelefonos().add("3256412");
		System.out.println(usuario.getTelefonos());
		Direccion direccion = new Direccion();
		direccion.setCalle("a");
		direccion.setNumero("1234");
		direccion.setCiudad("temuco");
		direccion.setRegion("asda");
		
		usuario.setDireccion(direccion);
		
		
		System.out.println(usuario.getDireccion().toString());
		
		//si se inicializa en objeto usuario
		//usuario.getDireccion().setCalle("los pablo");
	}

}
