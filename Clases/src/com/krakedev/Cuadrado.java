package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
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
