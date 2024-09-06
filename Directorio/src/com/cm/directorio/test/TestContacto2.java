package com.cm.directorio.test;

import com.cm.directorio.entidades.AdminContactos;
import com.cm.directorio.entidades.Contacto;
import com.cm.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		Telefono telef1=new Telefono("claro","0999123456",143);
		Telefono telef2=new Telefono("movi","0999123987",184);
		AdminContactos ad=new AdminContactos();
		Contacto a=new Contacto("Brandon","Paillacho",telef1,55.2);
		Contacto b=new Contacto("Josue","Tipan",telef2,55.1);
		
		Contacto aa=ad.buscarMasPesado(a, b);
		if(aa!=null) {
			System.out.println("Nombre:"+aa.getNombre()+aa.getApellido());
			System.out.println("Telefono:"+aa.getTelefono().getNumero()+" "+aa.getTelefono().getOperadora()+" "+aa.getTelefono().getCodigo());
			System.out.println("Peso:"+aa.getPeso());
		}else {
			System.out.println("Null");
		}
		System.out.println("***************************************");
		boolean o=ad.compararOperadoras(b, a);
		if(o==true) {
			System.out.println("Las operadoras son iguales");
		}else {
			System.out.println("Las operadoras no son iguales");
		}
		

	}

}
