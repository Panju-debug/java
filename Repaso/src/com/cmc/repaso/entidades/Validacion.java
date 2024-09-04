package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMoto (double monto){
		if(monto>0) {
			return true;
		}else {
			return false;
		}
	}
}
