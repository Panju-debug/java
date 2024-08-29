package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p2=new Persona();
		
		Persona p; //Paso 1: declaro una variable llamada p de tipo persona
		
		p=new Persona(); //Paso 2: instanciar un objeto persona y se referencio en p
		
		//paso 3: accedo a los atributos
		System.out.println("Nombre:"+p.nombre);
		System.out.println("Nombre:"+p.edad);
		System.out.println("Nombre:"+p.estatura);
		
		//paso 4: modificar atributos
		p.nombre="Juan";
		p.edad=45;
		p.estatura=1.67;
		
		p2.nombre="Angelina";
		
		System.out.println("*****");
		System.out.println("p.nombre:" +p.nombre);
		System.out.println("p2.nombre:" +p2.nombre);
	}

}
