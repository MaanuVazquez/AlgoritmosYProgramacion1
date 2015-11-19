package clases.guia05.ejercicio04;

import clases.Cuadrado;

public class Cubo {

	private Cuadrado cuadradoBase;

	/*
	 * post: inicializa el cubo a partir de la medida de lado dada
	 */
	public Cubo(double lado) {
		cuadradoBase = new Cuadrado(lado);
	}

	/*
	 * post: devuelve la longitud de todos los lados del cubo
	 */

	public double medirLongitudLado() {
		return this.cuadradoBase.calcularLado();
	}

	/*
	 * pre: lado es un valor mayor a 0. post: cambia la longitud de todos los
	 * lados del cubo
	 */
	public void cambiarLongitudLado(double lado) {
		this.cuadradoBase.cambiarLado(lado);
	}

	/*
	 * post: devuelve la superficie ocupada por las caras del cubo
	 */
	public double medirSuperficieCara() {
		return this.cuadradoBase.calcularArea();
	}

	/*
	 * pre: superficieCara es un valor mayor a 0. post: cambia la superficie de
	 * las caras del cubo
	 */
	public void cambiarSuperficieCara(double superficieCara) {
		this.cuadradoBase.cambiarArea(superficieCara);
	}

	/*
	 * post: devuelve el volumen que encierra el cubo
	 */
	public double medirVolumen() {
		return Math.pow(this.medirLongitudLado(), 3);
	}

	/*
	 * pre: volumen es un valor mayor a 0. post: cambia el volumen del cubo
	 */
	public void cambiarVolumen(double volumen) {

		this.cuadradoBase.cambiarLado(Math.cbrt(volumen));

	}
}