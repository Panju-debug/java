package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto probar=new Producto();
		double descuento;
		probar.setPrecio(4.5);
		descuento=probar.calcularPrecioPromo(1.5);
		System.out.println(descuento);
	}

}
