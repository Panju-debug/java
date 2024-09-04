package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos=0;
	private int productosVendidos=0;
	
	
	
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void vender(int vendidos) {
		productosActuales=productosActuales-vendidos;
		productosVendidos=productosVendidos+vendidos;
	}
	public void devolver(int devolver) {
		productosActuales=productosActuales+devolver;
		productosVendidos=productosVendidos-devolver;
		productosDevueltos=productosDevueltos+devolver;
	}
	public void imprimir() {
		System.out.println("Item:"+" "+nombre);
		System.out.println("Productos Actuales:"+" "+productosActuales);
		System.out.println("Productos devueltos:"+" "+productosDevueltos);
		System.out.println("Productos Vendidos:"+" "+productosVendidos);
	}
}
