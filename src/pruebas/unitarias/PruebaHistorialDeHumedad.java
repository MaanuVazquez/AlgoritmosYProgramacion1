package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio07.HistorialDeHumedad;

public class PruebaHistorialDeHumedad {

	HistorialDeHumedad buenosAires;
	int[] humedad;

	public PruebaHistorialDeHumedad() {
		humedad = new int[] { 0, 20, 10, 30, 40, 50, 70, 90, 35, 11 };
	}

	@Test
	public void correctoFuncionamientoDelObjeto() {
		/* condici�n inicial */
		this.buenosAires = new HistorialDeHumedad(this.humedad);

		/* comprobaci�n */
		Assert.assertNotNull(buenosAires);

	}

	@Test(expected = Error.class)
	public void pruebaIndicandoValoresImposibles() {
		/* condici�n inicial */
		int[] malosAires = new int[] { 10, 20, 30, 40, 140, 50 };

		/* operaciones */
		this.buenosAires = new HistorialDeHumedad(malosAires);

	}

	@Test
	public void pruebaObtenerHumedadPromedio() {
		/* condici�n inicial */
		this.buenosAires = new HistorialDeHumedad(this.humedad);

		/* operaciones */
		int humedadPromedio = this.buenosAires.obtenerHumedadPromedio();

		Assert.assertEquals(35, humedadPromedio);
	}

	@Test
	public void pruebaObtenerHumedadMaxima() {
		/* condici�n inicial */
		this.buenosAires = new HistorialDeHumedad(this.humedad);

		/* operaciones */
		int humedadMaxima = this.buenosAires.obtenerHumedadMaxima();

		Assert.assertEquals(90, humedadMaxima);
	}

	@Test
	public void pruebaObtenerHumedadMinima() {
		/* condici�n inicial */
		this.buenosAires = new HistorialDeHumedad(this.humedad);

		/* operaciones */
		int humedadMinima = this.buenosAires.obtenerHumedadMinima();

		Assert.assertEquals(0, humedadMinima);
	}

}
