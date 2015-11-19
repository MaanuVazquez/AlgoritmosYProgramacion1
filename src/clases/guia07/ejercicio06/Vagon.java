package clases.guia07.ejercicio06;

public class Vagon {

	private int numeroDeVagon;
	private int capacidadDeCarga;
	private int cargaActual;

	/**
	 * post inicializa el Vag�n con el n�mero y la capacidad de carga indicados.
	 * La carga inicial es 0.
	 */
	public Vagon(int numero, int capacidadDeCarga) {
		if (numero >= 0) {
			this.numeroDeVagon = numero;
		} else {
			throw new Error("El numero ingresado no est� permitido");
		}

		if (capacidadDeCarga > 0) {
			this.capacidadDeCarga = capacidadDeCarga;
		} else {
			throw new Error(
					"La capacidad de carga ingresada no est� permitida.");
		}

	}

	/**
	 * post devuelve el n�mero de Vag�n.
	 */
	public int obtenerNumero() {

		return this.numeroDeVagon;

	}

	/**
	 * post devuelve la carga actual del Vag�n.
	 */
	public int obtenerCarga() {
		return this.cargaActual;
	}

	/** post cambia la carga actual del Vag�n. */
	public void cambiarCarga(int carga) {
		if (carga >= 0 && carga <= this.capacidadDeCarga) {
			this.cargaActual = carga;
		} else {
			throw new Error("Carga ingresada no permitida.");
		}
	}

	/**
	 * post devuelve la carga m�xima del Vag�n.
	 */
	public int obtenerCapacidadDeCarga() {
		return this.capacidadDeCarga;
	}
}