package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	
	public Celda getCelda1() {
		return celda1;
	}


	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}


	public Celda getCelda2() {
		return celda2;
	}


	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}


	public Celda getCelda3() {
		return celda3;
	}


	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}


	public Celda getCelda4() {
		return celda4;
	}


	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void configurarMaquina(String codeCelda1,String codeCelda2,String codeCelda3,String codeCelda4) {
		celda1.setCodigo(codeCelda1);
		celda1.setCodigo(codeCelda2);
		celda1.setCodigo(codeCelda3);
		celda1.setCodigo(codeCelda4);
	}
	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
	}
	public Celda buscarCelda(String codigo){
		if(codigo==celda1.getCodigo()) {
			return celda1;
		}else if(codigo==celda2.getCodigo()) {
			return celda2;
		}else if(codigo==celda3.getCodigo()) {
			return celda3;
		}else if(codigo==celda4.getCodigo()) {
			return celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto producto,String codigo,int cantidad) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	public void mostrarProductos() {
		System.out.println(celda1.getProducto().getCodigo()+celda1.getProducto().getNombre());
	}
}
