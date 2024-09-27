package com.cmc.evaluacion.servicios;

import java.lang.Math;

import com.cmc.evaluacion.entidades.Prestamo;
public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interes=(prestamo.getInteres()/100)/12;
		double monto=prestamo.getMonto();
		int plazo=prestamo.getPlazo();
		double cuota=(monto*interes)/(1-(Math.pow(interes+1, -plazo)));
		return cuota;
	}
}
