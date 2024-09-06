package com.cm.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto cont1,Contacto cont2){
		if(cont1.getPeso()>cont2.getPeso()) {
			return cont1;
		}else if(cont2.getPeso()>cont1.getPeso()) {
			return cont2;
		}else {
			return null;
		}
	}
	public boolean compararOperadoras(Contacto cont1,Contacto cont2) {
		if(cont1.getTelefono().getOperadora()==cont2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public void activarUsuario(Contacto cont1) {
		if(cont1.getTelefono().isTieneWhatsapp()==true) {
			cont1.setActivo(true);
		}else {
			cont1.setActivo(false);
		}
	}
}
