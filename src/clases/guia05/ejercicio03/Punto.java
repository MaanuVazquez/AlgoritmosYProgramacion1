package clases.guia05.ejercicio03;

class Punto {

	private int coordenadaX;
	private int coordenadaY;

	/*
	 * post: Inicializa el punto con las coordenadas pasadas por parametro.
	 */

	public Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	/*
	 * post: Devuelve la coordenada en X del punto.
	 */

	public int obtenerCoordenadaX() {
		return this.coordenadaX;
	}

	/*
	 * post: Devuuelve la coordenada en Y del punto.
	 */

	public int obtenerCoordenadaY() {
		return this.coordenadaY;
	}

	/*
	 * post: Cambia el valor de la coordenada X del punto por el valor del
	 * parametro pasado.
	 */

	public void cambiarCoordenadaX(int nuevaCoordenada) {
		this.coordenadaX = nuevaCoordenada;
	}

	/*
	 * post: Cambia el valor de la coordenada Y del punto por el valor del
	 * parametro pasado.
	 */

	public void cambiarCoordenadaY(int nuevaCoordenada) {
		this.coordenadaY = nuevaCoordenada;
	}

	/*
	 * post: Devuelve true si el punto se encuentra sobre el eje de las X.
	 */

	public boolean puntoSobreEjeX() {
		boolean chequeoDeCoordenadaX = false;
		if (this.coordenadaX == 0) {
			chequeoDeCoordenadaX = true;
		}
		return chequeoDeCoordenadaX;
	}

	/*
	 * post: Devuelve true si el punuto se encuentra sobre el eje de las X.
	 */

	public boolean puntoSobreEjeY() {
		boolean chequeoDeCoordenadaY = false;

		if (this.coordenadaY == 0) {
			chequeoDeCoordenadaY = true;
		}
		return chequeoDeCoordenadaY;
	}

	/*
	 * post: Devuelve true si el punto se encuentra en el origen de las
	 * coordenadas.
	 */

	public boolean puntoSobreOrigenDeCoordenadas() {
		boolean chequeoDeOrigenDeCoordenadas = false;

		if ((this.coordenadaX == 0) && (this.coordenadaY == 0)) {
			chequeoDeOrigenDeCoordenadas = true;
		}

		return chequeoDeOrigenDeCoordenadas;

	}

}
