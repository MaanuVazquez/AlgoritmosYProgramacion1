package clases.guia07.ejercicio02;

public class TemperaturaAnual {

	private double[] temperaturaA�o = new double[365];
	private double[] humedadA�o = new double[365];

	public TemperaturaAnual(double tempLunes, double tempMartes,
			double tempMiercoles, double humedadLunes, double humedadMartes,
			double humedadMiercoles) {

		for (int i = 0; i < this.temperaturaA�o.length; i++) {
			this.temperaturaA�o[i] = 0;
		}

		for (int i = 0; i < this.humedadA�o.length; i++) {
			this.temperaturaA�o[i] = 0;
		}

		this.temperaturaA�o[0] = tempLunes;
		this.temperaturaA�o[1] = tempMartes;
		this.temperaturaA�o[2] = tempMiercoles;
		this.humedadA�o[0] = humedadLunes;
		this.humedadA�o[1] = humedadMartes;
		this.humedadA�o[2] = humedadMiercoles;
	}

	public double registrarTemperaturaMinima() {
		double temperaturaMinima = this.temperaturaA�o[0];

		for (int i = 0; i < this.temperaturaA�o.length; i++) {
			if (this.temperaturaA�o[i] < temperaturaMinima) {
				temperaturaMinima = this.temperaturaA�o[i];
			}
		}
		return temperaturaMinima;

	}

	public double registrarTemperaturaMaxima() {
		double temperaturaMaxima = this.temperaturaA�o[0];

		for (int i = 0; i < this.temperaturaA�o.length; i++) {
			if (this.temperaturaA�o[i] > temperaturaMaxima) {
				temperaturaMaxima = this.temperaturaA�o[i];
			}
		}
		return temperaturaMaxima;

	}

	public double registrarHumedadMinima() {
		double humedadMinima = this.humedadA�o[0];

		for (int i = 0; i < this.humedadA�o.length; i++) {
			if (this.temperaturaA�o[i] < humedadMinima) {
				humedadMinima = this.temperaturaA�o[i];
			}
		}
		return humedadMinima;

	}

}
