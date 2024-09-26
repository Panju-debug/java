package servicios;

import java.util.ArrayList;

import entidades.Carta;


public class Jugadores {
	private ArrayList<String> jugadores = new ArrayList<>();
	private ArrayList<ArrayList<Carta>> cartas = new ArrayList<>();

	
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void setNombresJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void jugar(String nombre) {
		jugadores.add(nombre);
		Juego juego = new Juego(jugadores);
		this.cartas = juego.entregarCartas(5);
		for (int i = 0; i < jugadores.size(); i++) {
			int total=juego.devolverTotal(nombre);
			String id=juego.determinarGanador();
			
		}
	}

	
}
