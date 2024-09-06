package com.cm.directorio.test;

import com.cm.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		System.out.println(telf.getOperadora());
		System.out.println(telf.getNumero());
		System.out.println(telf.getCodigo());
	}

}
