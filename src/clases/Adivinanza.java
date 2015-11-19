package clases;

public class Adivinanza {

	private int intentosDisponibles;
	private int numeroAleatorio = 5;

	/*
	 * Pre: intentosDisponibles indica la cantidad de oportunidades que tiene el
	 * jugador de arriestarse.
	 * 
	 * Post: Se inicializa el juego generando un numero aleatorio comprendido de
	 * [1, 100]
	 */

	public Adivinanza(int intentosDisponibles) {

		if (intentosDisponibles > 0) {
			this.intentosDisponibles = intentosDisponibles;
		}

		numeroAleatorio = (int) (Math.random() * 100) + 1;

	}

	/*
	 * Post: Devuelve la cantidad de intentos restantes
	 */
	public int intentosRestantes() {
		return this.intentosDisponibles;
	}

	/*
	 * Pre: Al jugador le quedan intentos disponibles.
	 * 
	 * Post: Devuelve al jugador si su intento fue acertado, en caso de no serlo
	 * se le resta 1 (UN) intento.
	 */

	public boolean intentar(int intento) {

		boolean tenemosUnGanador = false;

		if (this.intentosDisponibles > 0) {

			tenemosUnGanador = (intento == this.numeroAleatorio);

			if (!tenemosUnGanador) {
				this.intentosDisponibles--;

			}

		}
		return tenemosUnGanador;

	}
}