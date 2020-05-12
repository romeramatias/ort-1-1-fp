package edu.ort.fp.tp4.ex.ex4.clases;

import java.util.ArrayList;

public class Inmobiliaria {

	private String nombre;
	private ArrayList<Barrio> barrios;
	
	public void mostrarPropiedades(){
		for(Barrio b: this.barrios){
			System.out.println(b.getNombre());
			b.mostrarPropiedades();
		}
	}
	
	private boolean buscarBarrio(Barrio barrio) {
		int tope = this.barrios.size() - 1;
		int i = 0;
		boolean encontre = false;

		while (!encontre && i <= tope) {
			// Patron de busqueda casi por defecto, con tope para no recorrer
			// toda la lista
			// Comparamos ingresada con las de la lista
			if (barrios.get(i).getNombre().equals(barrio.getNombre())) {
				encontre = true;
			}
			i++;
		}
		return encontre;
	}
	
	public void agregarBarrio(Barrio barrio) {

		boolean encontre = buscarBarrio(barrio);

		if (!encontre) {
			this.barrios.add(barrio);
			System.out.println("Barrio agregado.");
		} else {
			System.out.println("Encontre el barrio buscado, no se puede agregar");
		}

	}
	
	public void quitarBarrio(Barrio barrio) {
		boolean encontre = buscarBarrio(barrio);

		if (encontre) {
			this.barrios.remove(barrio);
			System.out.println("Barrio quitado.");
		} else {
			System.out.println("No encontre el barrio buscado, no se puede quitar");
		}

	}
	
	public Barrio obtenerBarrioMaxPropiedades(){
		//ArrayList <Propiedad> maxPropiedades = new ArrayList<>(); Lo hicimos con un String
		Barrio barrioMax = null;
		int maxProp = 0;
			
		for(Barrio b: this.barrios){ //Foreach
			if(b.getPropiedades().size() > maxProp){
				maxProp = b.getPropiedades().size();
				barrioMax = b;
			}
		}
		return barrioMax;
		
	}
	public Inmobiliaria(String nombre) {
		super();
		this.nombre = nombre;
		this.barrios = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Barrio> getBarrios() {
		return barrios;
	}
	public void setBarrios(ArrayList<Barrio> barrios) {
		this.barrios = barrios;
	}
	@Override
	public String toString() {
		return "Inmobiliaria [nombre=" + nombre + ", barrios=" + barrios + "]";
	}

	
	
}
