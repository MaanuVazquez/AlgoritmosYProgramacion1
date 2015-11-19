package clases.guia05.ejercicio13;

public class Sensor {

	private boolean sensorEncendido;
	private boolean sensorActivado;

	/*
	 * Post: Sensor apagado.
	 */

	public Sensor() {
		this.sensorEncendido = false;
		this.sensorActivado = false;
	}

	/*
	 * Post: Enciende el sensor.
	 */

	public void encender() {
		if (!this.sensorEncendido) {
			this.sensorEncendido = true;
		}
	}

	/*
	 * Post: Devuelve si el sensor ha sido activado a causa de algun evento.
	 */

	public boolean activado() {
		return this.sensorActivado;
	}

	/*
	 * Post: Activa el sensor.
	 */

	public void activar() {
		if (!this.sensorActivado) {
			this.sensorActivado = true;
		}
	}

}