package clases;

public class Cuadrado {

	private double lado;

	public Cuadrado(double lado) {
		this.lado = 10;
		if (lado > 0) {

			this.lado = lado;
		}

	}

	public double calcularLado() {

		return this.lado;
	}

	public void cambiarLado(double lado) {

		if (lado > 0) {

			this.lado = lado;
		}

	}

	public double calcularArea() {

		return (this.lado * this.lado);

	}

	public void cambiarArea(double area) {
		cambiarLado(Math.sqrt(area));
	}

	public double calcularPerimetro() {

		return 4 * this.lado;
	}

	public void cambiarPerimetro(double perimetro) {
		cambiarLado(perimetro / 4);
	}

	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(this.lado, 2) + Math.pow(this.lado, 2));
	}

	public void cambiarDiagonal(double diagonal) {
		cambiarLado(Math.sqrt(Math.pow(diagonal, 2) / 2));
	}
}