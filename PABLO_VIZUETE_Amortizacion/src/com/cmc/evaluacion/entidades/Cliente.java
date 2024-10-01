package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Cliente {
	 private String cedula;
	    private String nombre;
	    private String apellido;
	    private ArrayList<Prestamo> prestamos = new ArrayList<>();

	    public void mostrarCliente() {
	        System.out.println("Cliente:" + nombre + " " + apellido);
	    }

	    public Cliente(String cedula, String nombre, String apellido) {
	        this.cedula = cedula;
	        this.nombre = nombre;
	        this.apellido = apellido;
	    }

	    public String getCedula() {
	        return cedula;
	    }

	    public void setCedula(String cedula) {
	        this.cedula = cedula;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public ArrayList<Prestamo> getPrestamos() {
	        return prestamos;
	    }

	    public void setPrestamos(ArrayList<Prestamo> prestamos) {
	        this.prestamos = prestamos;
	    }

}
