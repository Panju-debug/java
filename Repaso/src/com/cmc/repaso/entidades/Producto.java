package com.cmc.repaso.entidades;

public class Producto {
	private String Nombre;
	private double Precio;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		if(precio<0) {
			precio=precio*-1;
		}
		Precio = precio;
	}
	public double calcularPrecioPromo(double porcentajeDescuento) {
		double descuento=(Precio*porcentajeDescuento)/100;
		Precio=Precio-descuento;
		return Precio;
	}
	
}
