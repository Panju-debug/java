package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador = new ArrayList<>();
	private ArrayList<Carta> naipeBarajado = new ArrayList<>();

	public Naipe getNaipe() {
		return naipe;
	}

	public Juego() {
		Naipe naipe = new Naipe();
		naipeBarajado = naipe.barajar();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public Juego(ArrayList<String> jugadores) {
		for (int i = 0; i < jugadores.size(); i++) {
			ArrayList<Carta> carta = new ArrayList<>();
			cartasJugador.add(carta);
		}
	}

	public ArrayList<ArrayList<Carta>> entregarCartas(int cartasPorJugador) {

		for (int i = 0; i < naipeBarajado.size(); i++) {
			for (int a = 0; a < cartasJugador.size(); a++) {
				cartasJugador.get(a).add(naipeBarajado.get(i));
			}
		}return cartasJugador;
	}
	public int devolverTotal(int id) {
		int number=0;
		for (int i = 0; i < cartasJugador.size(); i++) {
			number = cartasJugador.get(i).get(i).getNumero().getValor();
			number++;
		}return number;
	}
	public String determinarGanador() {
		String idGanador=nombre;
		int SumaGanador=total;
		for() {
			
		}
	}
}
