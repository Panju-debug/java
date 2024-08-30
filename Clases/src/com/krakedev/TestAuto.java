package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto("Porche",2006,50000.00);
		Auto auto2= new Auto("Kia",2020,16000.00);
		
		auto1.setMarca("Porche");
		auto1.setAnio(2006);
		auto1.setPrecio(50000.00);
		
		auto2.setMarca("Kia");
		auto2.setAnio(2020);
		auto2.setPrecio(16000.00);
		
		System.out.println("marca:"+" "+auto1.getMarca());
		System.out.println("anio:"+" "+auto1.getAnio());
		System.out.println("precio:"+" "+auto1.getPrecio());
		
		System.out.println("-------------------");
		
		System.out.println("marca:"+" "+auto2.getMarca());
		System.out.println("anio:"+" "+auto2.getAnio());
		System.out.println("precio:"+" "+auto2.getPrecio());
	}

}
