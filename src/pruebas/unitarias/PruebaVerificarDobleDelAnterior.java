package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio04.VerificarDobleDelAnterior;

public class PruebaVerificarDobleDelAnterior {
	VerificarDobleDelAnterior verificador = new VerificarDobleDelAnterior();

	@Test
	public void verificacionBasica() {
		/* condición inicial */
		int[] vector = new int[] { 1, 2, 4, 8, 16, 32, 64, 128 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobación */
		Assert.assertEquals(-1, posicionInvalida);
	}

	@Test
	public void verificacionIncorrecta() {
		/* condición inicial */
		int[] vector = new int[] { 1, 2, 4, 8, 16, 32, 63, 128 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobación */
		Assert.assertEquals(6, posicionInvalida);

	}

	@Test
	public void verificacionNeutral() {
		/* condición inicial */
		int[] vector = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobación */
		Assert.assertEquals(-1, posicionInvalida);
	}

	@Test
	public void verificacionConUno() {
		/* condición inicial */
		int[] vector = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };

		/* operaciones */
		int posicionInvalida = this.verificador.verificacion(vector);

		/* comprobación */
		Assert.assertEquals(1, posicionInvalida);
	}
}
