package servicios;

import java.util.ArrayList;



public class Jugadores {
	private ArrayList<String> jugadores = new ArrayList<>();
	

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void setNombresJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void jugar() {
		jugadores = new ArrayList<>();
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println("Jugador " + (i + 1) + juego.devolverTotal(i));
		}
		String ganador = juego.determinarGanador();
		System.out.println(ganador);
	}
}
