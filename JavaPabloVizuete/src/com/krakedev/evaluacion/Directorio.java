package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion;
	private ArrayList<Contacto>correctos=new ArrayList<>();
	private ArrayList<Contacto>incorrectos=new ArrayList<>();

	public Directorio() {
		this.contactos = new ArrayList<>();
        this.correctos = new ArrayList<>();
        this.incorrectos = new ArrayList<>();
        this.fechaModificacion = new Date();
	}
	
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		for (Contacto contacto1 : contactos) {
			Contacto contactoEncontrado = buscarPorCedula(contacto.getCedula());
			if (contacto1.getCedula() != null) {
				if (contactoEncontrado != null) {
					if (contacto1.getCedula().equals(contactoEncontrado.getCedula())) {
						return false;
					}
				}

			} else {
				return false;
			}

		}
		contactos.add(contacto);
		return true;
	}

	public Contacto buscarPorCedula(String cedula) {
		for (Contacto contacto : contactos) {
			if (cedula.equals(contacto.getCedula())) {
				return contacto;
			}
		}
		return null;
	}
	public String consultarUltimaModificacion() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return format.format(fechaModificacion);
    }
	public int contarPerdidos() {
		int perdidos=0;
		for(Contacto contacto:contactos) {
			if(contacto.getDireccion()==null) {
				 perdidos++;
			}
		}return perdidos;
		
	}
	public int contarFijos() {
		int fijos=0;
		for(Contacto contacto: contactos) {
			if(contacto.getTelefonos().getFirst().getTipo().equals("Convencional") && contacto.getTelefonos().getFirst().getEstado().equalsIgnoreCase("C")) {
				fijos++;
			}
		}return fijos;
	}
	public void depurar() {
		for(Contacto contacto:contactos) {
			if(contacto.getDireccion()!=null) {
				correctos.add(contacto);
			}else {
				incorrectos.add(contacto);
			}
		}
		contactos.clear();
	}
}

