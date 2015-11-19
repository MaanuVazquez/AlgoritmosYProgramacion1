package clases.guia05.ejercicio06;

public class Circulo {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public void cambiarRadio(double radio) {
		if (radio > 0) {
			this.radio = radio;
		}
	}

	public double consultarRadio() {
		return this.radio;
	}

	public void cambiarSuperficie(double superficie) {
		cambiarRadio(Math.sqrt((superficie / 3.14)));
	}

	public double consultarSuperficie() {
		return (Math.pow(this.radio, 2) * 3.14);
	}

	public void cambiarDiametro(double diametro) {
		cambiarRadio(this.radio / 2);
	}

	public double consultarDiametro() {
		return (this.radio * 2);
	}

	public void cambiarPerimetro(double perimetro) {
		cambiarRadio(perimetro / (2 * 3.14));
	}

	public double consultarPerimetro() {
		return (this.radio * 2 * 3.14);
	}

}