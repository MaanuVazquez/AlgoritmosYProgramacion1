package clases.guia05.ejercicio13;

public class Alarma {

	private Sensor sensorDeMovimiento;
	private Sensor sensorDeContacto;
	private Sensor sensorDeSonido;
	private int codigoSeguridad;
	private boolean alarmaApagada;

	/*
	 * Post: Alarma apagada con el código de seguridad indicado.
	 */

	public Alarma(int codigoSeguridad) {

		this.codigoSeguridad = codigoSeguridad;
		this.alarmaApagada = true;
		this.sensorDeMovimiento = new Sensor();
		this.sensorDeContacto = new Sensor();
		this.sensorDeSonido = new Sensor();
	}

	/*
	 * Post: Enciende la alarma.
	 */

	public void encender() {
		this.alarmaApagada = false;
		this.sensorDeMovimiento.encender();
		this.sensorDeContacto.encender();
		this.sensorDeSonido.encender();
	}

	/*
	 * Post: Si codigoSeguridad es correcto, apaga la alarma.
	 */

	public void apagar(int codigoSeguridad) {
		if (this.codigoSeguridad == codigoSeguridad && !this.alarmaApagada) {
			this.alarmaApagada = true;
		}
	}

	/*
	 * Post: Devuelve si alguno de los sensores está activado.
	 */

	public boolean activada() {
		boolean estado = false;
		if (this.sensorDeMovimiento.activado()
				|| this.sensorDeContacto.activado()
				|| this.sensorDeSonido.activado()) {
			estado = true;
		}
		return estado;
	}

}