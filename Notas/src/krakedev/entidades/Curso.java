package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				return "Estudiante encontrado";
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		String estudianteEncontrado = buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		Estudiante elementoEstudiante;
		double notas = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			notas = elementoEstudiante.calcularPromedioNotasEstudiante();
			notas++;
		}
		return notas / estudiantes.size();
	}

	public void mostrar() {

		for (Estudiante estudiante : estudiantes) {
			System.out.println("Estudiante [atributo1=" + estudiante.getNombre() + ", atributo2="
					+ estudiante.getApellido() + ", atributo3=" + estudiante.getCedula() + ", atributo4="
					+ estudiante.getClass() + ", atributo5=" + estudiante.getNotas());
		}
	}
}
