package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	 private ArrayList<Prestamo> prestamos = new ArrayList<>();
	    private ArrayList<Cliente> clientes = new ArrayList<>();

	    public Cliente buscarCliente(String cedula) {
	        for (Cliente cliente : clientes) {
	            if (cliente != null) {
	                if (cliente.getCedula().equals(cedula)) {
	                    return cliente;
	                }
	            } else {
	                return null;
	            }
	        }
	        return null;
	    }

	    public void registrarCliente(Cliente cliente) {
	        Cliente clienteEncontrado = buscarCliente(cliente.getCedula());
	        if (clienteEncontrado != null) {
	            System.out.println("Cliente ya existe: " + cliente.getCedula());
	        } else {
	            System.out.println("Cliente registrado: " + cliente.getNombre() + " " + cliente.getApellido() + "[cedula="
	                    + cliente.getCedula() + ", nombre="
	                    + cliente.getNombre() + ", apellido=" + cliente.getApellido() + "]");
	            clientes.add(cliente);
	        }
	    }

	    public void asignarPrestamo(String cedula, Prestamo prestamo) {
	        Cliente clienteEncontrado = buscarCliente(cedula);
	        if (clienteEncontrado == null) {
	            System.out.println("No es cliente del banco");
	        }
	        ArrayList<Prestamo> prestamosCliente = clienteEncontrado.getPrestamos();
	        prestamosCliente.add(prestamo);
	        clienteEncontrado.setPrestamos(prestamosCliente);

	    }

	    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	        Cliente clienteEncontrado = buscarCliente(cedula);
	        if (clienteEncontrado == null) {
	            System.out.println("No es cliente del banco");
	        }
	        return clienteEncontrado.getPrestamos();
	    }

	    public ArrayList<Prestamo> getPrestamos() {
	        return prestamos;
	    }

	    public ArrayList<Cliente> getClientes() {
	        return clientes;
	    }

}
