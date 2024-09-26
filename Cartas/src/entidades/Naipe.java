package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles=new ArrayList<>();
	private ArrayList<Carta> cartas=new ArrayList<>();
	
	public Naipe() {
		Numero numero1=new Numero("A",11);
		Numero numero2=new Numero("2",2);
		Numero numero3=new Numero("3",3);
		Numero numero4=new Numero("4",4);
		Numero numero5=new Numero("5",5);
		Numero numero6=new Numero("6",6);
		Numero numero7=new Numero("7",7);
		Numero numero8=new Numero("8",8);
		Numero numero9=new Numero("9",9);
		Numero numero10=new Numero("10",10);
		Numero numero11=new Numero("J",10);
		Numero numero12=new Numero("Q",10);
		Numero numero13=new Numero("K",10);
		
		numerosPosibles.add(numero1);
		numerosPosibles.add(numero2);
		numerosPosibles.add(numero3);
		numerosPosibles.add(numero4);
		numerosPosibles.add(numero5);
		numerosPosibles.add(numero6);
		numerosPosibles.add(numero7);
		numerosPosibles.add(numero8);
		numerosPosibles.add(numero9);
		numerosPosibles.add(numero10);
		numerosPosibles.add(numero11);
		numerosPosibles.add(numero12);
		numerosPosibles.add(numero13);
		
		for (int i = 0; i < numerosPosibles.size();i++) {
            Numero posicion = numerosPosibles.get(i);
            Carta carta1 = new Carta(posicion, "CR");
            Carta carta2 = new Carta(posicion, "CN");
            Carta carta3 = new Carta(posicion, "DI");
            Carta carta4 = new Carta(posicion, "TR");
            if (carta1 != null && carta2 != null && carta3 != null && carta4 != null) {
                cartas.add(carta1);
                cartas.add(carta2);
                cartas.add(carta3);
                cartas.add(carta4);
            }
        
		}
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> cartasBarajadas=new ArrayList<>();
		
		for(Carta carta:cartas) {
			int numberRandom=Random.obtenerPosicion();
			carta=cartas.get(numberRandom);
			cartasBarajadas.add(carta);
			
		}return cartasBarajadas;
	}	
	public ArrayList<Carta> auxiliar(){
		ArrayList<Carta> auxiliar=new ArrayList<>();
		Carta carta;
		for(int i=0;i<=100;i++) {
			int posicion=Random.obtenerPosicion();
			carta=cartas.get(posicion);
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}if(auxiliar.size()<52) {
			Carta cartaNoAgregada;
			for(int i=0;i<cartas.size();i++) {
				cartaNoAgregada=cartas.get(i);
				if(cartaNoAgregada.getEstado().equals("N")) {
					auxiliar.add(cartaNoAgregada);
					cartaNoAgregada.setEstado("C");
				}
			}
		}
		
		return auxiliar;
	}
}
