package com.krakedev;

public class EsFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha(12,05,2006);
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
		}

}
