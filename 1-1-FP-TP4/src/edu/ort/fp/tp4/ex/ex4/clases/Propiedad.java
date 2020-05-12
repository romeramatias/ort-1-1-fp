package edu.ort.fp.tp4.ex.ex4.clases;

public class Propiedad {
	
	private String direccion, tipoProp;
	private double precio;
	//private Enum<TipoProp> tipoProp;
	
	public Propiedad(String direccion, double precio, String tipoProp) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.tipoProp = tipoProp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipoProp() {
		return tipoProp;
	}

	public void setTipoProp(String tipoProp) {
		this.tipoProp = tipoProp;
	}

	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", precio=" + precio + ", tipoProp=" + tipoProp + "]";
	}
	
	
}