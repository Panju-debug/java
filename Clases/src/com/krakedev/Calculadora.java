package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado;
		resultado=valor1+valor2;
		return resultado;
	}	
	public int restar(int valor1, int valor2) {
		int resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	public double multiplicar(double numero1, double numero2) {
		double resultado;
		resultado= numero1*numero2;
		return resultado;
	}
	public double dividir(double dividendo1, double dividendo2) {
		double resultado;
		resultado=dividendo1/dividendo2;
		return resultado;
	}
	public double promediar (double valor1, double valor2, double valor3) {
		double suma=valor1 + valor2 +valor3;
		double resultado=suma/3;
		return resultado;
	}
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, sali al almuerzo.Regreso en 5 minutos");
	}
}
