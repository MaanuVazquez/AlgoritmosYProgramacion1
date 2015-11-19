package clases.guia07.ejercicio05;

public class Eslabon {

	private int numero;
	private double longitud;

	/**
	 * post inicializa el Eslab�n con el n�mero y la longitud indicados.
	 */
	public Eslabon(int numero, double longitud) {

		this.numero = numero;
		cambiarLongitud(longitud);
	}

	/**
	 * post devuelve el n�mero de Eslab�n.
	 */
	public int obtenerN�mero() {
		return this.numero;
	}

	/**
	 * post devuelve la longitud del Eslab�n.
	 */
	public double obtenerLongitud() {
		return this.longitud;
	}

	/**
	 * post cambia la longitud del Eslab�n.
	 */
	public void cambiarLongitud(double longitud) {
		if (longitud > 0) {
			this.longitud = longitud;
		} else {
			throw new Error("Longitud debe ser mayor a 0.");
		}
	}
}
