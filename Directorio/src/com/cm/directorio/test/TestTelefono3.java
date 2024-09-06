package com.cm.directorio.test;

import com.cm.directorio.entidades.AdminTelefono;
import com.cm.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1=new Telefono("movi","098234237",15);
		Telefono t2=new Telefono("claro","098234230",5);
		Telefono t3=new Telefono("movi","098234233",8);
		
		AdminTelefono telf1=new AdminTelefono();
		Telefono A=telf1.contarMovi(t1);
		Telefono B=telf1.contarMovi(t2);
		Telefono C=telf1.contarMovi(t3);
		
		if(A!=null){
			System.out.println("Telefono:"+ A.getNumero()+" "+A.getOperadora()+" "+A.getCodigo());
		}if(B!=null) {
			System.out.println("Telefono:"+ B.getNumero()+" "+B.getOperadora()+" "+B.getCodigo());
		}if(C!=null){
			System.out.println("Telefono:"+ C.getNumero()+" "+C.getOperadora()+" "+C.getCodigo());
		}if(A==null) {
			System.out.println("TelefonoA= null");
		}if(B==null) {
			System.out.println("TelefonoB= null");
		}if(C==null) {
			System.out.println("TelefonoC= null");
		}
		
		
		
		
	}

}
