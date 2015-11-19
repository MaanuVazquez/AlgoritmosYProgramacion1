package clases.guia05.ejercicio11;

public class ExpendedorDePasajes {

	private double precioPorKilometro;
	private int cantPasajesVendidos = 0;
	private double distanciaMaxima = 0;
	private double distanciaTotal = 0;

	/*
	 * Pre: El precio pasado por parametro debe ser mayor a 0
	 * 
	 * Post: Asigna el precio por kilometro de cada pasaje con el valor pasado
	 * por parametro,
	 */

	public ExpendedorDePasajes(double precioPorKm) {

		if (precioPorKm <= 0) {
			throw new Error("Precio por kilometro invalido");
		}

		this.precioPorKilometro = precioPorKm;

	}

	/*
	 * Post: Vende un pasaje y devuelve el precio en base a la distancia
	 * recorrida y el precio por kilometro.
	 */

	public double venderPasaje(double distanciaEnKm) {
		this.cantPasajesVendidos++;
		this.distanciaTotal += distanciaEnKm;
		if (distanciaEnKm > this.distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
		}
		return distanciaEnKm * this.precioPorKilometro;
	}

	/*
	 * Post: Vende X pasajes y devuelve el precio de ambos, en base a la
	 * distancia recorrida y el precio por kilometro.
	 */

	public double venderPasajes(int cantidad, double distanciaEnKm) {
		this.cantPasajesVendidos += cantidad;
		this.distanciaTotal += distanciaEnKm;
		if (distanciaEnKm > this.distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
		}
		return (distanciaEnKm * this.precioPorKilometro) * cantidad;
	}

	/*
	 * Post: Devuelve la cantidad de pasajes vendidos.
	 */

	public int pasajesVendidos() {
		return this.cantPasajesVendidos;
	}

	/*
	 * Post: Devuelve la distancia maxima de pasaje comprado.
	 */

	public double distanciaMaxima() {
		return this.distanciaMaxima;
	}

	/*
	 * Post: Devuelve una distancia promedio de la cantidad de pasajes vendidos.
	 */

	public double distanciaPromedio() {

		if (this.cantPasajesVendidos == 0) {
			throw new Error("No se ha realizado ninguna venta");
		}

		return this.distanciaTotal / this.cantPasajesVendidos;
	}

	/*
	 * Post: Devuelve la ganancia total.
	 */
	public double ventaTotal() {
		return this.distanciaTotal * this.precioPorKilometro
				* this.cantPasajesVendidos;
	}
}