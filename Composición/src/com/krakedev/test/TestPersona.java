package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Janin");
		p1.setApellido("Altamirano");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av Siempre Viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
	
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av Shyris","Eloy Alfaro","S/N");
		p2.setNombre("Pablo");
		p2.imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("Hola","Adios","123"));
		p3.imprimir();
		
	}

}
