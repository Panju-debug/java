package com.cm.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public boolean getActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public void imprimir() {
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println("Operadora:"+telefono.getOperadora()+" "+"Numero:"+telefono.getNumero()+" "+"Codigo:"+telefono.getCodigo());
		System.out.println(peso);
	}
}
