package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validar=new Validacion();
		boolean probar=validar.validarMoto(10);
		System.out.println(probar);
	}

}
