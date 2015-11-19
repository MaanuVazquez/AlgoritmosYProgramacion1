package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio03.VerificadorDeOrden;

public class PruebaVerificadorDeOrden {

	VerificadorDeOrden verificador = new VerificadorDeOrden();

	@Test
	public void pruebaBasica() {
		/* condici�n inicial */
		int[] arregloEnteros = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/* operaciones */
		boolean verificacion = this.verificador.verificar(arregloEnteros);

		/* comprobaci�n */
		Assert.assertEquals(true, verificacion);

	}

	@Test
	public void pruebaNumerosNegativos() {
		/* condici�n inicial */
		int[] arregloEnteros = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		/* operaciones */
		boolean verificacion = this.verificador.verificar(arregloEnteros);

		/* comprobaci�n */
		Assert.assertEquals(true, verificacion);
	}

	@Test(expected = Error.class)
	public void pruebaNumerosIntermitentes() {
		/* condici�n inicial */
		int[] arregloEnteros = new int[] { 10, 9, 8, 7, 6, 4, 3, 2, 1, 0, -1 };

		/* operaciones */
		boolean verificacion = this.verificador.verificar(arregloEnteros);

		/* comprobaci�n */
		Assert.assertEquals(true, verificacion);
	}

	@Test
	public void pruebaNumerosIguales() {
		/* condici�n inicial */
		int[] arregloEnteros = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		/* operaciones */
		boolean verificacion = this.verificador.verificar(arregloEnteros);

		/* comprobaci�n */
		Assert.assertEquals(true, verificacion);
	}

	@Test
	public void pruebaNumerosIgualesTricky() {
		/* condici�n inicial */
		int[] arregloEnteros = new int[] { 10, 9, 9, 9, 8, 7, 0, 0, 0, 0, 0 };

		/* operaciones */
		boolean verificacion = this.verificador.verificar(arregloEnteros);

		/* comprobaci�n */
		Assert.assertEquals(true, verificacion);
	}

}
