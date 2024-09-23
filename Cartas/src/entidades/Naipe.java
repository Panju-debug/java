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
		for(Numero numero:numerosPosibles) {
			cartas.add(numero);
		}
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	
}
