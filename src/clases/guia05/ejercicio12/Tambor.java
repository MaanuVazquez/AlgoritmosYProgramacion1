package clases.guia05.ejercicio12;

public class Tambor {

	private int posicionTambor;

	/*
	 * Pre: posicion > 0 && < 9
	 * 
	 * Post: inicializa la variable con la posición seleccionada o 1.
	 */

	public Tambor(int posicion) {

		if (posicion > 0 && posicion < 9) {
			this.posicionTambor = posicion;
		} else {
			this.posicionTambor = 1;
		}

	}

	/*
	 * post: devuelve el número de posición en la que se encuentra el Tambor. Es
	 * un valor comprendido entre 1 y 8.
	 */

	public int obtenerPosicion() {

		return this.posicionTambor;

	}

	/*
	 * post: hace girar el tambor y luego se detiene en una posición comprendida
	 * entre 1 y 8.
	 */

	public void girar() {

		this.posicionTambor = (int) Math.round(Math.random() * 7 + 1);

	}
}