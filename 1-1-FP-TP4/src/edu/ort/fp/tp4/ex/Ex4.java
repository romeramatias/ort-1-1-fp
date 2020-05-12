package edu.ort.fp.tp4.ex;

import edu.ort.fp.tp4.ex.ex4.clases.Barrio;
import edu.ort.fp.tp4.ex.ex4.clases.Inmobiliaria;
import edu.ort.fp.tp4.ex.ex4.clases.Propiedad;

public class Ex4 {

	public static void main(String[] args) {
		
		Inmobiliaria miInmobiliaria = new Inmobiliaria("Propiedades ORT");

		Barrio almagro = new Barrio("Almagro");
		Barrio flores = new Barrio("Flores");
		Barrio villaCrespo = new Barrio("Villa Crespo");
		
		miInmobiliaria.agregarBarrio(almagro);
		miInmobiliaria.agregarBarrio(flores);
		miInmobiliaria.agregarBarrio(villaCrespo);
		
		Propiedad p1 = new Propiedad("Yatay 240", 50000, "Casa");
		Propiedad p2 = new Propiedad("Diaz Velez 3225", 100000, "PH");
		Propiedad p3 = new Propiedad("Rivadavia 555", 50000, "Depto");
		Propiedad p4 = new Propiedad("Av La Plata 36", 50000, "Casa");
		Propiedad p5 = new Propiedad("Condarco 25", 50000, "PH");
		Propiedad p6 = new Propiedad("Pergamino 80", 50000, "Depto");
		Propiedad p7 = new Propiedad("Varela 150", 50000, "Casa");
		Propiedad p8 = new Propiedad("Ramon Falcon 2366", 50000, "PH");
		Propiedad p9 = new Propiedad("San Pedtriyo 81", 50000, "Depto");
		Propiedad p10 = new Propiedad("Nazca 6", 50000, "Casa");
		Propiedad p11 = new Propiedad("Pedernera 360", 50000, "PH");
		Propiedad p12 = new Propiedad("Directorio 2760", 50000, "Depto");
		Propiedad p13 = new Propiedad("Azul 405", 50000, "Casa");
		Propiedad p14 = new Propiedad("Jose Marti 234", 50000, "PH");
		Propiedad p15 = new Propiedad("Rio de Janeiro 644", 50000, "Depto");
		
		almagro.agregarPropiedad(p1);
		almagro.agregarPropiedad(p2);
		almagro.agregarPropiedad(p3);
		almagro.agregarPropiedad(p4);	
		almagro.agregarPropiedad(p15);
		
		flores.agregarPropiedad(p5);
		flores.agregarPropiedad(p6);
		flores.agregarPropiedad(p7);
		flores.agregarPropiedad(p8);
		flores.agregarPropiedad(p9);
		flores.agregarPropiedad(p10);
		flores.agregarPropiedad(p11);
		flores.agregarPropiedad(p12);
		flores.agregarPropiedad(p13);
		flores.agregarPropiedad(p14);

		System.out.println(miInmobiliaria);
		almagro.mostrarPropiedadesPorTipo("Casa");
		//almagro.mostrarPropiedades();
	
	
	}

}
