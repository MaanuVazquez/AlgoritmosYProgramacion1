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
		/* operaci�n */
		int divisores = calculadora.contarDivisores(1);

		/* comprobaci�n */
		Assert.assertEquals(2, divisores); // Se espera �1
	}

	@Test
	public void pruebaCalculadoraCon2() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(2);

		/* comprobaci�n */
		Assert.assertEquals(4, divisores); // Se espera �1 �2
	}

	@Test
	public void pruebaCalculadoraCon3() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(3);

		/* comprobaci�n */
		Assert.assertEquals(4, divisores); // Se espera �1 �3
	}

	@Test
	public void pruebaCalculadoraCon10() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(10);

		/* comprobaci�n */
		Assert.assertEquals(8, divisores); // Se espera �1 �2 �5 �10
	}

	@Test
	public void pruebaCalculadoraCon50() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(50);

		/* comprobaci�n */
		Assert.assertEquals(12, divisores); // Se espera �1 �2 �5 �10 �25 �50
	}

	@Test
	public void pruebaCalculadoraCon1Negativo() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(-1);

		/* comprobaci�n */
		Assert.assertEquals(2, divisores); // Se espera �1
	}

	@Test
	public void pruebaCalculadoraCon2Negativo() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(-2);

		/* comprobaci�n */
		Assert.assertEquals(4, divisores); // Se espera �1 �2
	}

	@Test
	public void pruebaCalculadoraCon3Negativo() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(-3);

		/* comprobaci�n */
		Assert.assertEquals(4, divisores); // Se espera �1 �3
	}

	@Test
	public void pruebaCalculadoraCon10Negativo() {
		/* operaci�n */
		int divisores = calculadora.contarDivisores(-10);

		/* comprobaci�n */
		Assert.assertEquals(8, divisores); // Se espera �1 �2 �5 �10
	}

	@Test(expected = Error.class)
	public void pruebaCalculadoraCon0() {

		/* operaci�n */
		/* int divisores = calculadora.contarDivisores(0); */
	}
}
