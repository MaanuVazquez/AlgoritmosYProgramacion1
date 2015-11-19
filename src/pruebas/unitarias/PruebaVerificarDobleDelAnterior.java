package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio04.VerificarDobleDelAnterior;

public class PruebaVerificarDobleDelAnterior {
	VerificarDobleDelAnterior verificador = new VerificarDobleDelAnterior();

	@Test
	public void verificacionBasica() {
		/* condici�n inicial */
		int[] vector = new int[] { 1, 2, 4, 8, 16, 32, 64, 128 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobaci�n */
		Assert.assertEquals(-1, posicionInvalida);
	}

	@Test
	public void verificacionIncorrecta() {
		/* condici�n inicial */
		int[] vector = new int[] { 1, 2, 4, 8, 16, 32, 63, 128 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobaci�n */
		Assert.assertEquals(6, posicionInvalida);

	}

	@Test
	public void verificacionNeutral() {
		/* condici�n inicial */
		int[] vector = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobaci�n */
		Assert.assertEquals(-1, posicionInvalida);
	}

	@Test
	public void verificacionConUno() {
		/* condici�n inicial */
		int[] vector = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobaci�n */
		Assert.assertEquals(1, posicionInvalida);
	}
}
