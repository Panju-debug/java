package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1= new Producto(123,"Papas");
		
		p1.setDescripcion("Buena calidad");
		p1.setPeso(1.5);
		
		System.out.println("Producto:"+" "+p1.getNombre());
		System.out.println("Codigo:"+" "+p1.getCodigo());
		System.out.println("Descripcion:"+" "+p1.getDescripcion());
		System.out.println("Peso:"+" "+p1.getPeso());

}
}