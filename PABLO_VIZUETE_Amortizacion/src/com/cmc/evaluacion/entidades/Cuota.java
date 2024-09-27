package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.utilitarios.Utilitario;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	Utilitario utilitario=new Utilitario();
	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota =utilitario.redondear(cuota);
		 
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = utilitario.redondear(capital);
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = utilitario.redondear(inicio);
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = utilitario.redondear(interes);
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = utilitario.redondear(abonoCapital);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuota(int numero) {

		this.numero = numero;
	}
	
	public void mostrarPrestamo() {
		System.out.println(numero + " | " + getCuota() + " | " + getCapital() + " | " + getInteres() + " | "
				+ getAbonoCapital() + " | " + getSaldo() + " | ");

	}

}
