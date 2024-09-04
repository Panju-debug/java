package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private	double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	public void calificar(double nota1) {
		nota=nota1;
		if(nota<8) {
			resultado="F";
			System.out.println(resultado);
		}else {
			resultado="A";
			System.out.println(resultado);
		}
		
	}
	
}
