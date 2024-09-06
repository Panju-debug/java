package com.cm.directorio.test;

import com.cm.directorio.entidades.AdminContactos;
import com.cm.directorio.entidades.AdminTelefono;
import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono tl1=new Telefono("claro","087654312",572);
		AdminTelefono ad=new AdminTelefono();
		AdminContactos adCt=new AdminContactos(); 
		Contacto ct=new Contacto("Pedro","Espinoza",tl1,56.7);
		
		
		ad.activarMensajeria(tl1);
		System.out.println(tl1.getOperadora());
		System.out.println(tl1.getNumero());
		System.out.println(tl1.getCodigo());
		System.out.println(tl1.isTieneWhatsapp());
		
		adCt.activarUsuario(ct);
		System.out.println(ct.getActivo());
		
	}

}
