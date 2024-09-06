package com.cm.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
				telefono.setTieneWhatsapp(true);
		}
	}
	
	public 	Telefono contarMovi(Telefono t) {
		
		if(t.getOperadora()=="movi") {
			return t;
		}else {
			return null;
		}
	}	
}
	