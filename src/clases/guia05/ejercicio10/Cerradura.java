package clases.guia05.ejercicio10;

public class Cerradura {

	private int claveDeApertura;
	private int cantidadDeFallosQueLaBloquean;
	private int intentosFallidos;
	private int aperturasExitosas;
	private boolean cerraduraBloqueada;
	private boolean cerraduraAbierta;

	/*
	 * Post: Se asigna la clave de apertura de la cerradura y la cantidad de
	 * fallos para que se bloquee
	 */

	public Cerradura(int claveDeApertura,
			int cantidadDeFallosConsecutivosQueLaBloquean) {

		if (claveDeApertura <= 0) {
			throw new Error("Clave de apertura mal ingresada");
		}

		if (cantidadDeFallosConsecutivosQueLaBloquean <= 0) {
			throw new Error(
					"La cantidad de fallos para bloquear debe ser mayor a 0");
		}

		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.intentosFallidos = 0;
		this.aperturasExitosas = 0;
		this.cerraduraBloqueada = false;
		this.cerraduraAbierta = false;
	}

	/*
	 * Pre: La cerradura no está bloqueada, la cerradura no está abierta.
	 * 
	 * Post: Intenta abrir la cerradura con la clave pasada por parametro
	 * comparandola con la clave de la cerradura, si esta no es igual se le suma
	 * un intento fallido, si estos son iguales a la cantidad de fallos que la
	 * bloquean, la cerradura se bloquea
	 */

	public boolean abrir(int clave) {
		if (!this.cerraduraBloqueada) {

			if (!this.cerraduraAbierta) {

				if (clave == this.claveDeApertura) {
					this.cerraduraAbierta = true;
					this.aperturasExitosas++;
				} else {
					this.intentosFallidos++;
					if (this.cantidadDeFallosQueLaBloquean == this.intentosFallidos) {
						this.cerraduraBloqueada = true;
					}
				}

			}
		}
		return this.cerraduraAbierta;
	}

	/*
	 * Pre: La cerradura debe estar abierta.
	 * 
	 * Post: Cierra la cerradura.
	 */

	public void cerrar() {
		if (this.cerraduraAbierta) {
			this.cerraduraAbierta = false;
		}
	}

	/*
	 * Post: Devuelve verdadero si la cerradura está abierta, falso si está
	 * cerrada.
	 */

	public boolean estaAbierta() {

		return this.cerraduraAbierta;
	}

	/*
	 * Post: Devuelve verdadero si la cerradura está cerrada, falso si está
	 * abierta.
	 */

	public boolean estaCerrada() {

		return !this.cerraduraAbierta;

	}

	/*
	 * Post: Devuelve verdadero si la cerradura está bloqueada, falso si está
	 * desbloquueada y aún puede abrirse.
	 */

	public boolean fueBloqueada() {

		return this.cerraduraBloqueada;

	}

	/*
	 * Post: Devuelve la cantidad de aperturas de la cerradura con éxito.
	 */

	public int contarAperturasExitosas() {
		return this.aperturasExitosas;
	}

	/*
	 * Post: Devuelve la cantidad de aperturas de cerradura fallidas.
	 */

	public int contarAperturasFallidas() {
		return this.intentosFallidos;
	}
}