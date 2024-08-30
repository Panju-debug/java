package com.krakedev;

public class Cuadrado {
	int lado;
	public double calcularArea(){
		double areaCuadrado;
		areaCuadrado=lado*lado;
		return areaCuadrado;
	}
	public double calcularPerimetro() {
		double perimetroCuadrado=4*lado;
		return perimetroCuadrado;
	}
}
