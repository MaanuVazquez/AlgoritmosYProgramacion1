package clases.guia05.ejercicio01;

public class Nota {

	private int nota;

	/*
	 * pre : valorInicial est� comprendido entre 0 y 10.
	 * 
	 * post: inicializa la Nota con el valor indicado.
	 */
	public Nota(int valorInicial) {

		this.nota = 7;

		if ((valorInicial >= 0) && (valorInicial <= 10)) {
			this.nota = valorInicial;
		}
	}

	/*
	 * post: devuelve el valor num�rico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {

		return this.nota;
	}

	/*
	 * post: indica si la Nota permite o no la aprobaci�n.
	 */
	public boolean aprobado() {

		return this.nota > 6;
	}

	/*
	 * post: indica si la Nota implica la desaprobaci�n.
	 */
	public boolean desaprobado() {

		return this.nota < 7;
	}

	/*
	 * pre : nuevoValor est� comprendido entre 0 y 10.
	 * 
	 * post: modifica el valor num�rico de la Nota, cambi�ndolo por nuevoValor,
	 * si nuevoValor es superior al valor num�rico actual de la Nota.
	 */
	public void recuperar(int nuevoValor) {

		if ((nuevoValor > this.nota) && (nuevoValor <= 10)) {
			this.nota = nuevoValor;
		}

	}

}