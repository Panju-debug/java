package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item probar=new Item();
		Item probar2=new Item();
		
		probar.setNombre("Papas");
		probar.setProductosActuales(20);
		probar.vender(10);
		probar.devolver(5);
		probar.imprimir();
		
		probar2.setNombre("Fideos");
		probar2.setProductosActuales(30);
		probar2.vender(15);
		probar2.devolver(9);
		probar2.imprimir();
	}

}
