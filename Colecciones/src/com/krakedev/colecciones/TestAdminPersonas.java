package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Juan","Benedetti",50));
		admin.agregar(new Persona("Pepe","Benedetti",50));
		admin.imprimir();
		
		
		Persona p1=admin.buscarPorNombre("Mario");
		if(p1!=null) {
			System.out.println(p1.getNombre());
		}else {
			System.out.println("Persona no encontrada");
		}
		
		ArrayList<Persona>personasMayores=admin.buscarMayores(25);
		System.out.println(personasMayores.size());
	}

}
