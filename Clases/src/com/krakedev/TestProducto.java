package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos productoA= new Productos();
		Productos productoB= new Productos();
		Productos productoC= new Productos();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Para el dolor de todo");
		productoA.setPrecio(3.00);
		productoA.setStockActual(4);
		
		productoB.setNombre("Lemonflu");
		productoB.setDescripcion("Para la gripe");
		productoB.setPrecio(2.50);
		productoB.setStockActual(10);
		
		productoC.setNombre("Condon");
		productoC.setDescripcion("Mejor prevenir que lamentar");
		productoC.setPrecio(0.50);
		productoC.setStockActual(20);
		
		System.out.println("Producto:"+" "+productoA.getNombre());
		System.out.println("Descripcion:"+" "+productoA.getDescripcion());
		System.out.println("Precio:"+" "+productoA.getPrecio());
		System.out.println("Stock:"+" "+productoA.getStockActual());
		
		System.out.println("-----------------------------");
		
		System.out.println("Producto:"+" "+productoB.getNombre());
		System.out.println("Descripcion:"+" "+productoB.getDescripcion());
		System.out.println("Precio:"+" "+productoB.getPrecio());
		System.out.println("Stock:"+" "+productoB.getStockActual());
		
		System.out.println("-----------------------------");
		
		System.out.println("Producto:"+" "+productoC.getNombre());
		System.out.println("Descripcion:"+" "+productoC.getDescripcion());
		System.out.println("Precio:"+" "+productoC.getPrecio());
		System.out.println("Stock:"+" "+productoC.getStockActual());
	}

}
