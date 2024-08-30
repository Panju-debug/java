package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoProducto;
		double resultadoDivision;
		double resultadoPromedio;
		
		
		
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(5, 3);
		System.out.println("RESULTADO:"+ " "+resultadoSuma);
		System.out.println("RESULTADO:"+" "+resultadoResta);	
		
		resultadoProducto=calcu.multiplicar(8.5,7.2);
		resultadoDivision=calcu.dividir(11, 5.5);
		resultadoPromedio=calcu.promediar(7.5,9.5,10);
		System.out.println("RESULTADO:"+ " "+resultadoProducto);
		System.out.println("RESULTADO:"+ " "+resultadoDivision);
		System.out.println("RESULTADO:"+ " "+resultadoPromedio);
		calcu.mostrarResultado();
	}

}
