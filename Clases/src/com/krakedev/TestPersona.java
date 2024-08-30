package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p2=new Persona();
		
		Persona p; //Paso 1: declaro una variable llamada p de tipo persona
		
		p=new Persona(); //Paso 2: instanciar un objeto persona y se referencio en p
		
		//paso 3: accedo a los atributos
		System.out.println("Nombre:"+p.getNombre());
		System.out.println("Edad:"+p.getEdad());
		System.out.println("Estatura:"+p.getEstatura());
		
		//paso 4: modificar atributos
		p.setNombre("Juan");
		p.setEdad(45);
		p.setEstatura(1.67);
		
		p2.setNombre("Angelina");
		
		System.out.println("*****");
		System.out.println("p.nombre:" +p.getNombre());
		System.out.println("p2.nombre:" +p2.getNombre());
	}

}
