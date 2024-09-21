package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;


public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces dulces=new MaquinaDulces();
		dulces.agregarCelda(new Celda("A1"));
		dulces.agregarCelda(new Celda("A2"));
		dulces.agregarCelda(new Celda("A3"));
		dulces.agregarCelda(new Celda("A4"));
		
		Producto producto1=new Producto("Papitas",0.85,"KE34");
		dulces.cargarProducto(producto1, "A1", 4);
		Producto producto2=new Producto("Doritos",0.5,"KE33");
		dulces.cargarProducto(producto2, "A2", 4);
		Producto producto3=new Producto("Jet",0.25,"KE32");
		dulces.cargarProducto(producto3, "A3", 4);
		Producto producto4=new Producto("De todito",0.6,"KE31");
		dulces.cargarProducto(producto4, "A4", 4);
		
		ArrayList<Producto>preciosMenores=dulces.buscarMenores(4);
		Producto productos;
		System.out.println("Productos Menores: 4");
		for(int i=0;i<preciosMenores.size();i++) {
			productos=preciosMenores.get(i);
			System.out.println("Nombre:"+productos.getNombre()+" "+"Precio:"+productos.getPrecio());
		}
		
	}

}
