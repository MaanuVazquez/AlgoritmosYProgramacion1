package clases;

import clases.guia05.ejercicio06.Circulo;

public class Cilindro {

	private Circulo circuloBase;
	private double altura;

	public Cilindro(double base, double altura) {

		this.circuloBase = new Circulo(base);
		this.altura = altura;

	}

	public double obtenerArea() {

		return 2 * 3.14 * this.circuloBase.consultarRadio() * this.altura;

	}

	public double obtenerSuperficie() {

		return 2 * 3.14 * Math.pow(this.circuloBase.consultarRadio(), 2)
				+ obtenerArea();

	}

	public double obtenerAltura() {

		return this.altura;

	}

	public double obtenerRadio() {

		return this.circuloBase.consultarRadio();

	}

	public double obtenerDiametro() {

		return this.circuloBase.consultarDiametro();

	}

	public void cambiarBase(double nuevaBase) {

		this.circuloBase.cambiarRadio(nuevaBase);

	}

	public void cambiarAltura(double altura) {

		if (altura > 0) {

			this.altura = 0;

		}

	}

}
