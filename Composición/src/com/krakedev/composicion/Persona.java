package com.krakedev.composicion;

public class Persona {
	private String nombre;
	private String Apellido;
	private int edad;
	private double estatura;
	private Direccion direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public void imprimir() {
		if(direccion!=null) {
			System.out.println("Nombre:"+nombre+" "+"Apellido:"+Apellido+" "+"Dirección:"+direccion.getCallePrincipal()+
					" "+direccion.getNumero()+" "+"y"+" "+direccion.getCalleSecundaria());
		}else {
			System.out.println("Nombre:"+nombre+" "+"Apellido:"+Apellido+" "+"Dirección:null");
		}
		
	}
	
}
