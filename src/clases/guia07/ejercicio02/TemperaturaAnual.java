package clases.guia07.ejercicio02;

public class TemperaturaAnual {

	private double[] temperaturaAño = new double[365];
	private double[] humedadAño = new double[365];

	public TemperaturaAnual(double tempLunes, double tempMartes,
			double tempMiercoles, double humedadLunes, double humedadMartes,
			double humedadMiercoles) {

		for (int i = 0; i < this.temperaturaAño.length; i++) {
			this.temperaturaAño[i] = 0;
		}

		for (int i = 0; i < this.humedadAño.length; i++) {
			this.temperaturaAño[i] = 0;
		}

		this.temperaturaAño[0] = tempLunes;
		this.temperaturaAño[1] = tempMartes;
		this.temperaturaAño[2] = tempMiercoles;
		this.humedadAño[0] = humedadLunes;
		this.humedadAño[1] = humedadMartes;
		this.humedadAño[2] = humedadMiercoles;
	}

	public double registrarTemperaturaMinima() {
		double temperaturaMinima = this.temperaturaAño[0];

		for (int i = 0; i < this.temperaturaAño.length; i++) {
			if (this.temperaturaAño[i] < temperaturaMinima) {
				temperaturaMinima = this.temperaturaAño[i];
			}
		}
		return temperaturaMinima;

	}

	public double registrarTemperaturaMaxima() {
		double temperaturaMaxima = this.temperaturaAño[0];

		for (int i = 0; i < this.temperaturaAño.length; i++) {
			if (this.temperaturaAño[i] > temperaturaMaxima) {
				temperaturaMaxima = this.temperaturaAño[i];
			}
		}
		return temperaturaMaxima;

	}

	public double registrarHumedadMinima() {
		double humedadMinima = this.humedadAño[0];

		for (int i = 0; i < this.humedadAño.length; i++) {
			if (this.temperaturaAño[i] < humedadMinima) {
				humedadMinima = this.temperaturaAño[i];
			}
		}
		return humedadMinima;

	}

}
