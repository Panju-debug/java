package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda>celdas;
	
	private double saldo;
	
	
	
	public MaquinaDulces(){
		celdas =new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda codigoCelda) {

		celdas.add(codigoCelda);
	}
	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			System.out.println("Celda"+(1+i)+":"+elementoCelda.getCodigo());
		}
		
	}
	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada=elementoCelda;
			}
		}return celdaEncontrada;
	}
	public void cargarProducto(Producto producto,String codigoCelda,int stock) {
		Celda celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}
	public void mostrarProductos() {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto()!=null) {
				System.out.println("Celda:"+elementoCelda.getCodigo()+" "+"Stock:"+elementoCelda.getStock()+" "+"Producto:"+elementoCelda.getProducto().getNombre()+" "+"Precio:"+elementoCelda.getProducto().getPrecio());
				
			}else {
				System.out.println("Celda:"+elementoCelda.getCodigo()+" "+"Stock:"+elementoCelda.getStock()+" "+"Sin producto asignado");
			}
		}
		System.out.println("Saldo Maquina:"+saldo);		
	}
	public Producto buscarProductoEnCelda(String codeCelda) {
		Celda elementoCelda;
		
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codeCelda.equals(elementoCelda.getCodigo())) {
				if(elementoCelda.getProducto()!=null) {
					return elementoCelda.getProducto();
				}
			}
		}return null;
	}
	public double consultarPrecio(String codeCelda) {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codeCelda.equals(elementoCelda.getCodigo())) {
				if(elementoCelda.getProducto()!=null) {
					return elementoCelda.getProducto().getPrecio();
				}
			}
		}return 0;
	}
	public Celda buscarCeldaProducto(String codeProduct) {
		Celda elementCelda;
		for(int i=0;i<celdas.size();i++) {
			elementCelda=celdas.get(i);
			if(elementCelda.getProducto()!=null) {
				if(codeProduct.equals(elementCelda.getProducto().getCodigo())) {
					return elementCelda;
				}
			}

		}return null;
	}
	public void incrementarProductos(String codigo,int stock) {
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
		int numStock=celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock+numStock);
	}
	public void vender(String codigo) {
		Celda celda=buscarCelda(codigo);
		int stockCelda=celda.getStock();
		celda.setStock(stockCelda-1);
		double precio=celda.getProducto().getPrecio();
			this.saldo=(saldo+precio);
			
	}
	public double venderConCambio(String codigo,double valor) {
		Celda celda=buscarCelda(codigo);
		int stockCelda=celda.getStock();
		celda.setStock(stockCelda-1);
		double cambio=valor-celda.getProducto().getPrecio();
		this.saldo=(saldo+celda.getProducto().getPrecio());
		return cambio;
	}
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto>menorPrecio=new ArrayList<Producto>();
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			
			if(elementoCelda.getProducto().getPrecio()<=limite) {
				menorPrecio.add(elementoCelda.getProducto());
			}
		}return menorPrecio;
	}
}
