package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1 = new Celda();
	private Celda celda2 = new Celda();
	private Celda celda3= new Celda();
	private Celda celda4= new Celda();
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
		celda2.setCodigo(codeCelda2);
		celda3.setCodigo(codeCelda3);
		celda4.setCodigo(codeCelda4);
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
		
		System.out.println(celda1.getCodigo());
		System.out.println(celda1.getStock());
		if(celda1.getProducto()==null) {
			
		}else {
			System.out.println(celda1.getProducto().getNombre());
			System.out.println(celda1.getProducto().getPrecio());
			System.out.println(celda1.getProducto().getCodigo());
		}
		
		System.out.println("******************");
		System.out.println(celda2.getCodigo());
		System.out.println(celda2.getStock());
		if(celda2.getProducto()==null) {
			System.out.println("No tiene producto");
		}else {
			System.out.println(celda2.getProducto().getNombre());
			System.out.println(celda2.getProducto().getPrecio());
			System.out.println(celda2.getProducto().getCodigo());
		}
		System.out.println("******************");
		System.out.println(celda3.getCodigo());
		System.out.println(celda3.getStock());
		System.out.println(celda3.getProducto().getNombre());
		System.out.println(celda3.getProducto().getPrecio());
		System.out.println(celda3.getProducto().getCodigo());
		System.out.println("******************");
		System.out.println(celda4.getCodigo());
		System.out.println(celda4.getStock());
		if(celda4.getProducto()==null) {
			System.out.println("No tiene producto");
		}else {
			System.out.println(celda4.getProducto().getNombre());
			System.out.println(celda4.getProducto().getPrecio());
			System.out.println(celda4.getProducto().getCodigo());
		}
		
	}
	public Producto buscarProductoEnCelda(String codigo) {
			if(codigo==celda1.getCodigo()) {
				return celda1.getProducto();
			}else if(codigo==celda2.getCodigo()) {
				return celda2.getProducto();
			}else if(codigo==celda3.getCodigo()) {
				return celda3.getProducto();
			}else if(codigo==celda4.getCodigo()) {
				return celda4.getProducto();
			}else {
				return null;
			}
	}
	public double consultarPrecio(String codigo) {
		if(codigo==celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		}else if(codigo==celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		}else if(codigo==celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		}else if(codigo==celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}else {
			return 0;
		}
	}
	public Celda buscarCeldaProducto(String codigo) {
		if(celda1.getProducto()!=null) {
			if(codigo==celda1.getProducto().getCodigo()) {
				return celda1;
			}
		}else if(celda2.getProducto()!=null) {
				if(codigo==celda2.getProducto().getCodigo()) {
					return celda2;
				}
		}else if(celda3.getProducto()!=null) {
				if(celda3.getProducto().getCodigo()==codigo) {
					return celda3;
				}
		}else if(celda4.getProducto()!=null) {
				if(celda4.getProducto().getCodigo()==codigo) {
					return celda4;
				}
		}
		return null;
		}
	
	public void incrementarProductos(String codigo,int stock) {
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(stock);
	}
	public void vender(String codigo) {
		Celda celda=buscarCelda(codigo);
		int stockCelda=celda.getStock();
		celda.setStock(stockCelda-1);
		double precio=celda.getProducto().getPrecio();
			setSaldo(saldo+precio);
		System.out.println(getSaldo());
		mostrarProductos();
	}
	public double venderConCambio(String codigo,double valor) {
		Celda celda=buscarCelda(codigo);
		int stockCelda=celda.getStock();
		celda.setStock(stockCelda-1);
		double cambio=valor-celda.getProducto().getPrecio();
		setSaldo(saldo-cambio);
		return cambio;
	}
}
