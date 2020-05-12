package edu.ort.fp.tp4.ex.ex4.clases;

import java.util.ArrayList;

public class Barrio {

	private String nombre;
	private ArrayList<Propiedad> propiedades;

	private boolean buscarPropiedad(Propiedad propiedad) {
		int tope = this.propiedades.size() - 1;
		int i = 0;
		boolean encontre = false;

		while (!encontre && i <= tope) {
			// Patron de busqueda casi por defecto, con tope para no recorrer
			// toda la lista
			// Comparamos ingresada con las de la lista
			if (propiedades.get(i).getDireccion().equals(propiedad.getDireccion())) {
				encontre = true;
			}
			i++;
		}
		return encontre;
	}

	public void agregarPropiedad(Propiedad propiedad) {

		boolean encontre = buscarPropiedad(propiedad);

		if (!encontre) {
			this.propiedades.add(propiedad);
			System.out.println("Proiedad agregada.");
		} else {
			System.out.println("Encontre la propiedad buscada, no se puede agregar");
		}

	}

	public void quitarPropiedad(Propiedad propiedad) {
		boolean encontre = buscarPropiedad(propiedad);

		if (encontre) {
			this.propiedades.remove(propiedad);
			System.out.println("Propiedad quitada.");
		} else {
			System.out.println("No encontre la propiedad buscada, no se puede quitar");
		}

	}

	public void mostrarPropiedades() {
		for (Propiedad p : this.propiedades) {
				System.out.println("Direccion: " + p.getDireccion());
				System.out.println("Precio: " + p.getPrecio());
				System.out.println("Tipo de propiedad: " + p.getTipoProp());
				
		}
	}
	
	public void mostrarPropiedadesPorTipo(String tipo) {

		// Propiedad = Tipo de dato / p = Variable creada / propiedades = Atributo (Lista) de la clase
		for (Propiedad p : this.propiedades) { // Foreach. (p) es una variable
												// creada en el for
			if (p.getTipoProp().equals(tipo)){
			System.out.println("Direccion: " + p.getDireccion() + " / Precio: " + p.getPrecio());
			}
		}
	}

	public Barrio(String nombre) {
		super();
		this.nombre = nombre;
		this.propiedades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

	@Override
	public String toString() {
		return "Barrio [nombre=" + nombre + ", propiedades=" + propiedades + "]";
	}

}
