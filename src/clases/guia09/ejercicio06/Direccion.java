package clases.guia09.ejercicio06;

public class Direccion {

	private String calle;
	private int numero;

	public Direccion(String direccion, int numero) {
		this.calle = direccion;
		this.numero = numero;
	}

	public String getCalle() {
		return this.calle;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

}
