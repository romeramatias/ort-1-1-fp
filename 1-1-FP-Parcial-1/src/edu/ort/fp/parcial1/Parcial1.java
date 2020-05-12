package edu.ort.fp.parcial1;

import java.util.Scanner;

public class Parcial1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String antiguedad;
		final String HIS = "H";
		final String NUE = "N";
		final String REG = "R";
		int contObj = 0;
		int contSedes = 1;
		int contSedesH = 0;
		int contSedesN = 0;
		int contSedesR = 0;
		int MAX_SOC = 3000;
		int MIN_SOC = 20;
		int numSedeMenor = 0;
		int sedeMenor = 3000;
		int sedes = 3;
		int votosSedeMenor = 0;
		int socios;
		int votos;

		final double OBJ_H = 35.00;
		double porc;
		double promH = 0;
		double promN = 0;
		double promR = 0;

		while (contSedes <= sedes) {
			System.out.println("Sede N°" + contSedes);
			socios = leerentero("Ingrese cantidad de socios:", MIN_SOC, MAX_SOC);
			votos = leerentero("Ingrese cantidad de votos obtenidos:", 0, socios);
			antiguedad = leerantiguedad();
			if (socios < sedeMenor) {
				sedeMenor = socios;
				numSedeMenor = contSedes;
				votosSedeMenor = votos;
			}
			porc = obtenerporcentaje(votos, socios);
			System.out.println("El porcentaje de votos de esta sede ha sido de %" + porc);
			switch (antiguedad) {
			case HIS:
				contSedesH = contSedesH + 1;
				promH = obtenerpromedio(contSedesH, porc, promH);
				System.out.println(promH);
				if (porc >= OBJ_H) {
					contObj = contObj + 1;
					// guardarEleccion()
				}
				break;
			case REG:
				contSedesR = contSedesR + 1;
				promR = obtenerpromedio(contSedesR, porc, promR);
				System.out.println(promR);
				break;
			case NUE:
				contSedesN = contSedesN + 1;
				promN = obtenerpromedio(contSedesN, porc, promN);
				System.out.println(promN);
				break;
			}
			contSedes = contSedes + 1;
		}
		if (contObj > 0) {
			System.out.println("La cantidad de sedes que cumplieron con el objetivo son " + contObj);
		} else {
			System.out.println("Ninguna sede historica cumplió con el objetivo");
		}
		System.out.println("La cantidad de votos obtenidos en la sede con menos socios fue en la sede N°" + numSedeMenor
				+ " con " + votosSedeMenor + " votos");
		System.out.println("El porcentaje promedio segun antiguedad es: HISTORICO: " + promH + " REGULAR: " + promR
				+ " NUEVA: " + promN);
	}

	public static int leerentero(String cartel, int min, int max) {
		int retorno;
		int valor;
		System.out.println(cartel);
		valor = scan.nextInt();
		while (valor < min || valor > max) {
			System.out.println("Error. " + cartel);
			valor = scan.nextInt();
		}
		retorno = valor;
		return retorno;
	}

	public static String leerantiguedad() {
		final String HIS = "H";
		final String NUE = "N";
		final String REG = "R";
		String valor;

		System.out.println("Ingrese antiguedad de la sede: [H]istoria, [R]egular o [N]ueva:");
		valor = scan.next();
		while (!(valor.contentEquals(HIS) || valor.contentEquals(NUE) || (valor.contentEquals(REG)))) {
			System.out.println("Error. Ingrese nuevamente H, R o N:");
			valor = scan.next();
		}
		System.out.println(valor);
		return valor;
	}

	public static double obtenerporcentaje(double votos, double socios) {
		double retorno;
		retorno = votos * 100 / socios;
		return retorno;
	}

	public static double obtenerpromedio(double contsedes, double porc, double promsede) {
		double retorno;
		System.out.println("CONT SEDES " + contsedes);
		System.out.println("PORC " + porc);
		System.out.println("PROM H " + promsede);
		retorno = (porc + promsede) / contsedes;
		System.out.println(retorno);
		return retorno;
	}

}
