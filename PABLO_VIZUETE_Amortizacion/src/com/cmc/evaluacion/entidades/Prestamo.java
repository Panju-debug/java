package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

import com.cmc.evaluacion.servicios.Banco;



public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas=new ArrayList<>();
	
	public Prestamo(double monto, double interes, int plazo) {
		
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}
	
	public Prestamo(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	public Prestamo() {
		
	}

	public ArrayList<Cuota> cuotas() {
		return cuotas;
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

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	
	
}
