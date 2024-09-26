package entidades;

public class Random {
	
	public static int obtenerPosicion() {
		int numeroAleatorio = (int) (Math.random()*51+1);
	   return numeroAleatorio;
	}
}
