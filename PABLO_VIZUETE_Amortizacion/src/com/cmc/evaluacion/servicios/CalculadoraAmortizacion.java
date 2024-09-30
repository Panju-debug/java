package com.cmc.evaluacion.servicios;

import java.lang.Math;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interes = (prestamo.getInteres() / 100) / 12;
		double monto = prestamo.getMonto();
		int plazo = prestamo.getPlazo();
		double cuota = (monto * interes) / (1 - (Math.pow(interes + 1, -plazo)));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double monto = prestamo.getMonto();
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			double cuota = calcularCuota(prestamo);
			Cuota cuota1 = new Cuota(1);
			cuota1.setCuota(cuota);
			prestamo.getCuotas().add(cuota1);
		}

		prestamo.getCuotas().get(0).setInicio(monto);
		int indice = 0;
		for (Cuota cuota : prestamo.getCuotas()) {
			if(cuota!=prestamo.getCuotas().getLast()) {
				calcularValoresCuota(prestamo.getInteres(), cuota, prestamo.getCuotas().get(indice + 1));
				indice++;
			}else {
				calcularValoresCuota(prestamo.getInteres(), cuota, prestamo.getCuotas().get(indice));
			}
			
		}
		
		if (prestamo.getCuotas().getLast().getSaldo() != 0) {
			double montoFinal=prestamo.getCuotas().getLast().getInicio();
			double cuotaFinal=prestamo.getCuotas().getLast().getCuota();
			double inicio=prestamo.getCuotas().getLast().getAbonoCapital();
			prestamo.getCuotas().getLast().setCuota(montoFinal+cuotaFinal);
			prestamo.getCuotas().getLast().setInicio(inicio);
			prestamo.getCuotas().getLast().setSaldo(0);
		}

	}

	public static void calcularValoresCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
		double interesObtenido = cuota.getInicio()*((interes / 100) / 12);
		double abonoCapital = cuota.getCuota() - interesObtenido;
		double saldo = cuota.getInicio() - abonoCapital;
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldo);
		cuota.setInteres(interesObtenido);
		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		int indice=1;
		System.out.println("Numero | Cuota  | Inicio   | Interes| Abono | Saldo");
		for (Cuota cuota : prestamo.getCuotas()) {
			System.out.println(indice+ "      | " + cuota.getCuota() +    " |" + cuota.getInicio() + " |   "
					+ cuota.getInteres() + "| " + cuota.getAbonoCapital() + " | " + cuota.getSaldo());
			indice++;
		}
	}
}
