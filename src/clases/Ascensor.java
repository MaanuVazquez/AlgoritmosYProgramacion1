package clases;

public class Ascensor {

	private int cantidadDePisos;
	private int pisoActual;
	private int cantidadDePisosMovidos;
	private int cantidadDeViajesRealizados;

	/**
	 * Pre: Se le indica una cantidad de pisos que debe ser mayor a 0, en caso
	 * de no serlo la cantidad de pisos será de 5
	 * 
	 * Post: Se inicializa el ascensor en la planta baja.
	 * 
	 * @param cantidadDePisos
	 *            indica la cantidad de pisos que va a tener el ascensor.
	 */

	public Ascensor(int cantidadDePisos) {

		this.cantidadDePisos = 5;

		if (cantidadDePisos > 0) {
			this.cantidadDePisos = cantidadDePisos;
		}

		this.pisoActual = 0;
		this.cantidadDePisosMovidos = 0;
		this.cantidadDeViajesRealizados = 0;

	}

	/**
	 * 
	 * @return devuelve la cantidad de pisos que tiene el ascensor
	 */

	public int obtenerCantidadDePisos() {
		return this.cantidadDePisos;
	}

	/**
	 * 
	 * @return devuelve el piso actual
	 */

	public int obtenerPisoActual() {
		return this.pisoActual;
	}

	/**
	 * 
	 * @return devuelve la cantidad de pisos que el ascensor se movio.
	 */

	public int obtenerCantidadDePisosMovidos() {
		return this.cantidadDePisosMovidos;
	}

	/**
	 * 
	 * @return devuelve la cantidad de viajes realizados
	 */

	public int obtenerCantidadDeViajesRealizados() {
		return this.cantidadDeViajesRealizados;
	}

	/**
	 * 
	 * Post: Mueve el ascensor hasta el piso donde se llamo.
	 * 
	 * @param piso
	 *            desde el cual se llama al ascensor
	 * @return cantidad de pisos que se movio el ascensor.
	 */

	public int llamarDesde(int piso) {

		int pisosMovidos = 0;

		if (piso >= 0 && piso <= this.cantidadDePisos) {
			if (piso > this.pisoActual) {
				pisosMovidos = piso - this.pisoActual;
			} else {
				pisosMovidos = this.pisoActual - piso;
			}
			if (pisosMovidos > 0) {

				this.cantidadDeViajesRealizados++;
				this.pisoActual = piso;
				this.cantidadDePisosMovidos += pisosMovidos;
			}
		}

		return pisosMovidos;

	}

	public int promedioDePisosMovidos() {

		int promedio = 0;

		if (!(this.cantidadDeViajesRealizados == 0)) {
			promedio = this.cantidadDePisosMovidos
					/ this.cantidadDeViajesRealizados;
		}

		return promedio;

	}

}
