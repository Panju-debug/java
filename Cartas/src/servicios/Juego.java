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

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public Juego() {
		ArrayList<Carta> barajas = new Naipe().barajar();
		this.naipeBarajado = barajas;
	}

	public Juego(ArrayList<String> jugadores) {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		cartasJugador = new ArrayList<>();
		for (int i = 0; i < jugadores.size(); i++) {
			ArrayList<Carta> carta = new ArrayList<>();
			cartasJugador.add(carta);
		}
	}

	public ArrayList<ArrayList<Carta>> entregarCartas(int cartasPorJugador) {
		int carta = 0;

		for (int i = 0; i < cartasPorJugador; i++) {

			for (int a = 0; a < cartasJugador.size(); a++) {

				if (carta < naipeBarajado.size()) {

					cartasJugador.get(a).add(naipeBarajado.get(carta));
					carta++;
				}
			}
		}
		return cartasJugador;
	}

	public int devolverTotal(int idJugador) {
		int valor = 0;
		ArrayList<Carta> cartasDelJugador = cartasJugador.get(idJugador);
		for (Carta carta : cartasDelJugador) {
			valor += carta.getNumero().getValor();
		}
		return valor;
	}

	public String determinarGanador() {
	    int sumaGanador = -1;
	    String idGanador = "";
	    for (int i = 0; i < cartasJugador.size(); i++) {
	        int sumaCartas = devolverTotal(i);  
	        if (sumaCartas > sumaGanador) {
	            sumaGanador = sumaCartas;
	            idGanador = "jugador " + (i + 1);  
	        }
	    }
	    
	    return idGanador;
	}
}
