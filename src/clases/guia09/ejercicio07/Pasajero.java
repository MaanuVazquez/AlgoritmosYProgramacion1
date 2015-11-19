package clases.guia09.ejercicio07;

public class Pasajero {

	private String nombre;
	private Transporte transporte;

	public Pasajero(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Transporte getTransporte() {
		return this.transporte;
	}

	public void subirEn(Transporte transporte) {
		this.transporte = transporte;
		this.transporte.setPasajero(this);
	}

	public void subir(Transporte transporte) {
		this.transporte = transporte;
		this.transporte.setPasajero(this);
	}

}
