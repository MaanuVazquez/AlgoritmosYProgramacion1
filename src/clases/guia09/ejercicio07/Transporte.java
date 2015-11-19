package clases.guia09.ejercicio07;

public class Transporte {

	private String patente;
	private Pasajero[] pasajeros;

	public Transporte(String patente, int capacidad) {
		this.patente = patente;
		this.pasajeros = new Pasajero[capacidad];
	}

	public String getPatente() {
		return this.patente;
	}

	public int getCapacidad() {
		return this.pasajeros.length;
	}

	public Pasajero getPasajero(int numero) {
		return this.pasajeros[numero - 1];
	}

	public void bajarA(Pasajero pasajero) {
		for (int i = 0; i < this.pasajeros.length; i++) {
			if (this.pasajeros[i] == pasajero) {
				this.pasajeros[i] = null;
			}
		}
	}

	public void setPasajero(Pasajero pasajero) {
		boolean yaSubio = false;
		for (int i = 0; i < this.pasajeros.length && !yaSubio; i++) {
			if (this.pasajeros[i] == null) {
				this.pasajeros[i] = pasajero;
				yaSubio = true;
			}
		}
	}

}
