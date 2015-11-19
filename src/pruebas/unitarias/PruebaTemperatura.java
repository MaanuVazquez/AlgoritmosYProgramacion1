package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio01.TemperaturaFinDeSemana;

public class PruebaTemperatura {

	@Test
	public void probandoTemperaturaMaximaDomingo() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(20, 35, 28, 98);

		// operaciones
		double pruebaTn = TN.calcularTemperaturaMaxima();

		// comprobacion
		Assert.assertEquals(28, pruebaTn, 0.1);

	}

	@Test
	public void probandoTemperaturaMaximaSabado() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(28, 35, 20, 98);

		// operaciones
		double pruebaTn = TN.calcularTemperaturaMaxima();

		// comprobacion
		Assert.assertEquals(28, pruebaTn, 0.1);

	}

	@Test
	public void probandoHumedadMaximaSabado() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(28, 98, 20, 70);

		// operaciones
		double pruebaTn = TN.calcularHumedadMaxima();

		// comprobacion
		Assert.assertEquals(98, pruebaTn, 0.1);

	}

	@Test
	public void probandoHumedadMaximaDomingo() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(28, 20, 20, 70);

		// operaciones
		double pruebaTn = TN.calcularHumedadMaxima();

		// comprobacion
		Assert.assertEquals(70, pruebaTn, 0.1);

	}

	@Test
	public void probandoPromedioHumedad() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(28, 20, 20, 20);

		// operaciones
		double pruebaTn = TN.calcularHumedadPromedio();

		// comprobacion
		Assert.assertEquals(20, pruebaTn, 0.1);

	}

	@Test
	public void probandoPromedioTemperatura() {

		// inicial
		TemperaturaFinDeSemana TN = new TemperaturaFinDeSemana(20, 98, 20, 70);

		// operaciones
		double pruebaTn = TN.calcularTemperaturaPromedio();

		// comprobacion
		Assert.assertEquals(20, pruebaTn, 0.1);
	}

}
