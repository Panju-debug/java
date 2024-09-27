package com.cmc.evaluacion.utilitarios;



public class Utilitario {
	public double redondear(double valor) {
		 double resultado = Math.round(valor * 100.0) / 100.0;
		 return resultado;
	}
}
