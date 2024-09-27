package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> coutas=new ArrayList<>();
	
	public Prestamo(double monto, double interes, int plazo) {
		super();
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCoutas() {
		return coutas;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	
	
}
