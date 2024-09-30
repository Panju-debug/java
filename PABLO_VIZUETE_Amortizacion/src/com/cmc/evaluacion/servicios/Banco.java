package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Prestamo> prestamos = new ArrayList<>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		Cliente cliente1 = buscarCliente(cliente.getCedula());
		if (cliente1 != null) {
			System.out.println("Cliente ya existe=" + cliente1.getCedula());
		} else {
			clientes.add(cliente);
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {

		Cliente cliente = buscarCliente(cedula);
		if (cliente == null) {
			System.out.println("Cliente no es del banco");
		} else {
			for (Cliente cliente1 : clientes) {
				cliente1.getPrestamo().add(prestamo);
			}

		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		int i = 0;
		for (Cliente cliente : clientes) {
			if (cedula.equals(cliente.getCedula())) {
				if (cliente.getPrestamo().get(i) != null) {
					prestamos.add(cliente.getPrestamo().get(i));
				} else {
					return null;
				}

			}
		}
		return prestamos;

	}

	public void mostrarPrestamo() {
		int i = 0;
	
		
		for (Cliente cliente : clientes) {
			System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
			System.out.println("[Monto=" + cliente.getPrestamo().get(i).getMonto() + ", Interes="
					+ cliente.getPrestamo().get(i).getInteres()+", Plazo="+cliente.getPrestamo().get(i).getPlazo());
			i++;
		}

	}
}
