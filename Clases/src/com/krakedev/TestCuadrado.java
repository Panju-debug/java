package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		double a1;
		double a2;
		double a3;
		
		double p1;
		double p2;
		double p3;
		
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();

		c1.setLado(5);
		c2.setLado(9);
		c3.setLado(7);
		
		a1=c1.calcularArea();
		a2=c2.calcularArea();
		a3=c3.calcularArea();
		
		p1=c1.calcularPerimetro();
		p2=c2.calcularPerimetro();
		p3=c3.calcularPerimetro();
		
		System.out.println("Area de c1="+" "+a1);
		System.out.println("Area de c2="+" "+a2);
		System.out.println("Area de c3="+" "+a3);
		
		System.out.println("Perimetro de c1="+" "+p1);
		System.out.println("Perimetro de c2="+" "+p2);
		System.out.println("Perimetro de c3="+" "+p3);
		
	}

}
