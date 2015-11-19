package clases.guia07.ejercicio05;

public class Eslabon {

	private int numero;
	private double longitud;

	/**
	 * post inicializa el Eslabón con el número y la longitud indicados.
	 */
	public Eslabon(int numero, double longitud) {

		this.numero = numero;
		cambiarLongitud(longitud);
	}

	/**
	 * post devuelve el número de Eslabón.
	 */
	public int obtenerNúmero() {
		return this.numero;
	}

	/**
	 * post devuelve la longitud del Eslabón.
	 */
	public double obtenerLongitud() {
		return this.longitud;
	}

	/**
	 * post cambia la longitud del Eslabón.
	 */
	public void cambiarLongitud(double longitud) {
		if (longitud > 0) {
			this.longitud = longitud;
		} else {
			throw new Error("Longitud debe ser mayor a 0.");
		}
	}
}
