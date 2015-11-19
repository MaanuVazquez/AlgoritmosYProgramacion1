package clases.guia07.ejercicio07;

public class HistorialDeHumedad {

	private int[] humedad;

	/*
	 * Pre: Se pasa por parametro un arreglo de humedades.
	 * 
	 * Post: hace un registro de las humedades ingresadas y las almacena
	 */

	public HistorialDeHumedad(int[] humedad) {
		this.humedad = new int[humedad.length];

		for (int i = 0; i < this.humedad.length; i++) {
			if (humedad[i] >= 0 && humedad[i] <= 100) {

				this.humedad[i] = humedad[i];

			} else {

				throw new Error(
						"La humedad ingresada no se encuentra dentro del rango [0-100]");

			}
		}
	}

	/*
	 * Post: devuelve la humedad total registrada
	 */

	private int obtenerHumedadTotal() {
		int humedadTotal = 0;

		for (int i = 0; i < this.humedad.length; i++) {
			humedadTotal += this.humedad[i];
		}

		return humedadTotal;
	}

	/*
	 * Post: devuelve la humedad promedio del registro
	 */

	public int obtenerHumedadPromedio() {

		return obtenerHumedadTotal() / this.humedad.length;
	}

	public int obtenerHumedadMaxima() {
		int humedadMaxima = this.humedad[0];

		for (int i = 1; i < this.humedad.length; i++) {
			if (humedadMaxima < this.humedad[i]) {
				humedadMaxima = this.humedad[i];
			}
		}

		return humedadMaxima;
	}

	public int obtenerHumedadMinima() {
		int humedadMinima = this.humedad[0];

		for (int i = 1; i < this.humedad.length; i++) {
			if (humedadMinima > this.humedad[i]) {
				humedadMinima = this.humedad[i];
			}
		}

		return humedadMinima;
	}

}
