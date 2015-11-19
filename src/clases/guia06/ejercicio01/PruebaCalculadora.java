package clases.guia06.ejercicio01;

import org.junit.Assert;
import org.junit.Test;

public class PruebaCalculadora {

	private Calculadora calculadora;

	public PruebaCalculadora() {
		calculadora = new Calculadora();
	}

	@Test
	public void pruebaCalculadoraCon1() {
		/* operación */
		int divisores = calculadora.contarDivisores(1);

		/* comprobación */
		Assert.assertEquals(2, divisores); // Se espera ±1
	}

	@Test
	public void pruebaCalculadoraCon2() {
		/* operación */
		int divisores = calculadora.contarDivisores(2);

		/* comprobación */
		Assert.assertEquals(4, divisores); // Se espera ±1 ±2
	}

	@Test
	public void pruebaCalculadoraCon3() {
		/* operación */
		int divisores = calculadora.contarDivisores(3);

		/* comprobación */
		Assert.assertEquals(4, divisores); // Se espera ±1 ±3
	}

	@Test
	public void pruebaCalculadoraCon10() {
		/* operación */
		int divisores = calculadora.contarDivisores(10);

		/* comprobación */
		Assert.assertEquals(8, divisores); // Se espera ±1 ±2 ±5 ±10
	}

	@Test
	public void pruebaCalculadoraCon50() {
		/* operación */
		int divisores = calculadora.contarDivisores(50);

		/* comprobación */
		Assert.assertEquals(12, divisores); // Se espera ±1 ±2 ±5 ±10 ±25 ±50
	}

	@Test
	public void pruebaCalculadoraCon1Negativo() {
		/* operación */
		int divisores = calculadora.contarDivisores(-1);

		/* comprobación */
		Assert.assertEquals(2, divisores); // Se espera ±1
	}

	@Test
	public void pruebaCalculadoraCon2Negativo() {
		/* operación */
		int divisores = calculadora.contarDivisores(-2);

		/* comprobación */
		Assert.assertEquals(4, divisores); // Se espera ±1 ±2
	}

	@Test
	public void pruebaCalculadoraCon3Negativo() {
		/* operación */
		int divisores = calculadora.contarDivisores(-3);

		/* comprobación */
		Assert.assertEquals(4, divisores); // Se espera ±1 ±3
	}

	@Test
	public void pruebaCalculadoraCon10Negativo() {
		/* operación */
		int divisores = calculadora.contarDivisores(-10);

		/* comprobación */
		Assert.assertEquals(8, divisores); // Se espera ±1 ±2 ±5 ±10
	}

	@Test(expected = Error.class)
	public void pruebaCalculadoraCon0() {

		/* operación */
		/* int divisores = calculadora.contarDivisores(0); */
	}
}
