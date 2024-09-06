package com.cm.directorio.test;

import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono("movi","0123456789",126);
		Contacto c=new Contacto("Juan","Quishpe",telef,55.2);
		c.imprimir();
	}

}
