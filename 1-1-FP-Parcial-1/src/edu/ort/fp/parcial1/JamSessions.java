package edu.ort.fp.parcial1;

import java.util.Scanner;

public class JamSessions {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		final int MIN_EDAD = 18;
		final int MAX_EDAD = 70;
		final int MIN_HOR = 1;
		final int MAX_HOR = 5;

		String VALOR_CORTE = "";
		String nombreMusicos, instrumentos, nombreMusicoMayor = null;
		int edadMusicos, cantMusicos, musicoMayor, horasDePerm, horasTotal;
		double costEntr, recaudacion, promedioPerm;
		recaudacion = 0;
		musicoMayor = 0;
		cantMusicos = 0;
		horasTotal = 0;

		nombreMusicos = leerMusicos("Ingrese nombre del musico:");
		while (!(nombreMusicos.equals(VALOR_CORTE))) {
			cantMusicos++;
			edadMusicos = leerEnteroEntre("Ingrese edad del musico:", MIN_EDAD, MAX_EDAD);
			if (edadMusicos > musicoMayor) {
				musicoMayor = edadMusicos;
				nombreMusicoMayor = nombreMusicos;
			}
			horasDePerm = leerEnteroEntre("Ingrese horas de permanencia:", MIN_HOR, MAX_HOR);
			horasTotal = horasTotal + horasDePerm;
			instrumentos = leerInstrumentos("Ingrese inicial del instrumento:");
			costEntr = obtenerCostoEntrada(edadMusicos, horasDePerm, instrumentos);
			System.out.println("El costo de entrada de " + nombreMusicos + " sera de $" + costEntr);
			recaudacion = recaudacion + costEntr;
			nombreMusicos = leerMusicos("Ingrese nombre del siguiente musico:");
		}
		
		if (cantMusicos>0){
			promedioPerm=horasTotal/cantMusicos;
			System.out.println("La recaudacion total de la Jam Session fue de $" + recaudacion);
			System.out.println("El musico mas longevo es " + nombreMusicoMayor + " con " + musicoMayor + " años");
			System.out.println("El promedio de horario de los musicos fue de " + promedioPerm + " horas");
		}
			
	}

	public static String leerMusicos(String cartel) {
		String nombre;
		System.out.println(cartel);
		nombre = scan.next();
		return nombre;
	}

	public static int leerEnteroEntre(String cartel, int MIN, int MAX) {
		int valor;
		System.out.println(cartel);
		valor = scan.nextInt();
		while (valor < MIN || valor > MAX) {
			System.out.println("Error. " + cartel);
			valor = scan.nextInt();
		}
		return valor;
	}

	public static String leerInstrumentos(String cartel) {
		String instrumento;
		System.out.println(cartel);
		instrumento = scan.next();
		while (!(esTipoValido(instrumento))) {
			System.out.println("Error. " + cartel);
			instrumento = scan.next();
		}
		return instrumento;
	}

	public static boolean esTipoValido(String inst) {
		boolean valido;
		final String GUI = "G";
		final String BAT = "D";
		final String BAJ = "B";
		final String TEC = "K";
		if (inst.equals(GUI) || inst.equals(BAT) || inst.equals(BAJ) || inst.equals(TEC)) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	public static double obtenerCostoEntrada(int edad, int horas, String inst) {
		double costo = 0, descuento, extra;
		int horasExtra;
		final double COSTO_ENTRADA = 100;
		final double DESC_TEC = 0.20;
		final double DESC_BAJ = 0.10;
		final double EXTRA_BAT = 20;
		final int HOR_MIN_BAT = 2;
		final int EDAD_BAJ = 30;
		
		switch (inst) {
		case ("G"):
			costo = COSTO_ENTRADA * horas;
			break;
		case ("K"):
			costo = COSTO_ENTRADA * horas;
			descuento = costo * DESC_TEC;
			costo = costo - descuento;
		case ("D"):
			if (horas > HOR_MIN_BAT) {
				horasExtra = horas - HOR_MIN_BAT;
				extra = horasExtra * EXTRA_BAT;
				costo = (COSTO_ENTRADA * horas) + extra;
			} else {
				costo = COSTO_ENTRADA * horas;
			}
		case ("B"):
			if (edad < EDAD_BAJ){
				costo = COSTO_ENTRADA * horas;
				descuento = costo * DESC_BAJ;
				costo = costo - descuento;
			}
		}

		return costo;
	}
}
