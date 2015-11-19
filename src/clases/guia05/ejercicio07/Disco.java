package clases.guia05.ejercicio07;

import clases.guia05.ejercicio06.Circulo;

public class Disco {

	private Circulo circuloInterior;
	private Circulo circuloExterior;

	/*
	 * Constructores de la clase, si se ejecutan sin parametros le asigna
	 * valorers (5 y 10) respectivamente, si se ejecuta con valores, mientras
	 * que sean valores adecuados se le asignaran a cada Circulo en cuestión
	 */

	public Disco() {

		this.circuloInterior = new Circulo(5);
		this.circuloExterior = new Circulo(10);

	}

	public Disco(double radioInterior, double radioExterior) {

		if ((radioInterior > 0) && (radioInterior < radioExterior)) {
			this.circuloInterior = new Circulo(radioInterior);
			this.circuloExterior = new Circulo(radioExterior);
		} else {
			this.circuloInterior = new Circulo(5);
			this.circuloExterior = new Circulo(10);
		}
	}

	/*
	 * Post: Devuelve el radio interior del disco.
	 */

	public double consultarRadioInterior() {
		return this.circuloInterior.consultarRadio();
	}

	/*
	 * Post: Devuelve el radio exterior del disco.
	 */

	public double consultarRadioExterior() {
		return this.circuloExterior.consultarRadio();
	}

	/*
	 * Post: Devuelve el perimetro interior del disco.
	 */

	public double consultarPerimetroInterior() {
		return this.circuloInterior.consultarPerimetro();
	}

	/*
	 * Post: Devuelve el perimetro exterior del disco.
	 */

	public double consultarPerimetroExterior() {
		return this.circuloExterior.consultarPerimetro();
	}

	/*
	 * Post: Devuelve la superficie total del disco.
	 */

	public double consultarSuperficie() {
		return this.circuloExterior.consultarSuperficie()
				- this.circuloInterior.consultarSuperficie();
	}

	/*
	 * Pre: El radio exterior debe seguir siendo mayor.
	 * 
	 * Post: Cambia el radio del circulo interior.
	 */

	public void cambiarRadioInterior(double radio) {
		if (radio < this.circuloExterior.consultarRadio()) {
			this.circuloInterior.cambiarRadio(radio);
		}
	}

	/*
	 * Pre: El radio interior debe seguir siendo menor.
	 * 
	 * Post: Cambia el radio del circulo exterior.
	 */

	public void cambiarRadioExterior(double radio) {
		if (radio > this.circuloInterior.consultarRadio()) {
			this.circuloExterior.cambiarRadio(radio);
		}
	}

}
