package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<>();

	public Estudiante(String cedula, String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota;
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
					System.out.println("Se repite");
					return;
				}
			}
			notas.add(nuevaNota);
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota;
		if (nuevaNota >= 0 && nuevaNota <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (codigo.equals(elementoNota.getMateria().getCodigo())) {
					elementoNota.setCalificacion(nuevaNota);
				} else {
					System.out.println("No se encontro el codigo");
				}
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		Nota notasEstudiante;
		double calificacion = 0;
		double promedio;
		System.out.println(notas.size());
		for (int i = 0; i < notas.size(); i++) {
			
			notasEstudiante = notas.get(i);
			calificacion = notasEstudiante.getCalificacion();
			calificacion++;
		}
		promedio = calificacion / notas.size();
		return promedio;
	}

	public void mostrar() {
		  for (Nota nota : notas) {
	            System.out.println("Estudiante [atributo1=" + getNombre() + ", atributo2=" + getApellido()
	                    + ", atributo3=" + nota.getCalificacion()+"]");
	        }
	}
	
	
}
