package clases.guia07.ejercicio01;

public class TemperaturaFinDeSemana {

	private double temperaturaSabado;
	private double temperaturaDomingo;
	private double humedadSabado;
	private double humedadDomingo;

	public TemperaturaFinDeSemana(double temperaturaSabado,
			double humedadSabado, double temperaturaDomingo,
			double humedadDomingo) {

		this.temperaturaSabado = temperaturaSabado;
		this.temperaturaDomingo = temperaturaDomingo;
		this.humedadSabado = 50;
		this.humedadDomingo = 70;

		if (humedadSabado >= 0 && humedadSabado <= 100) {
			this.humedadSabado = humedadSabado;
		}

		if (humedadDomingo >= 0 && humedadDomingo <= 100) {
			this.humedadDomingo = humedadDomingo;
		}

	}

	public double calcularTemperaturaMaxima() {

		double temperaturaMaxima = 0;
		if (this.temperaturaSabado > this.temperaturaDomingo) {

			temperaturaMaxima = this.temperaturaSabado;
		} else {
			temperaturaMaxima = this.temperaturaDomingo;
		}
		return temperaturaMaxima;
	}

	public double calcularTemperaturaMinima() {

		double temperaturaMinima = 0;
		if (this.temperaturaSabado < this.temperaturaDomingo) {

			temperaturaMinima = this.temperaturaSabado;
		} else {
			temperaturaMinima = this.temperaturaDomingo;
		}
		return temperaturaMinima;
	}

	public double calcularTemperaturaPromedio() {
		return (this.temperaturaSabado + this.temperaturaDomingo) / 2;
	}

	public double calcularHumedadMaxima() {
		double humedadMaxima = 0;

		if (this.humedadSabado > this.humedadDomingo) {
			humedadMaxima = this.humedadSabado;
		} else {
			humedadMaxima = this.humedadDomingo;
		}
		return humedadMaxima;
	}

	public double calcularHumedadMinima() {
		double humedadMinima = 0;

		if (this.humedadSabado < this.humedadDomingo) {
			humedadMinima = this.humedadSabado;
		} else {
			humedadMinima = this.humedadDomingo;
		}
		return humedadMinima;
	}

	public double calcularHumedadPromedio() {
		return (this.humedadSabado + this.humedadDomingo) / 2;
	}

}
