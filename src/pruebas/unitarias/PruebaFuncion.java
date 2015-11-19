package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.Funcion;

public class PruebaFuncion {

	private Funcion funcion;

	@Test
	public void pruebaCrearCorrectamenteElObjeto() {
		/* operaciones */
		this.funcion = new Funcion(10, 8, 40, 100);

		/* comprobacion */
		Assert.assertNotNull(funcion);
	}

	@Test(expected = Error.class)
	public void pruebaIncorrectaDelObjeto() {
		this.funcion = new Funcion(-1, -1, -1, -1);
	}

	@Test
	public void pruebaBasicaDeFuncion() {
		/* condición inicial */
		this.funcion = new Funcion(10, 8, 40, 100);

		/* operaciones */
		int asientosLibres = this.funcion.obtenerAsientosLibres();

		/* comprobación */
		Assert.assertEquals(10 * 8, asientosLibres);

	}

	@Test
	public void pruebaComprarAsientos() {
		/* condición inicial */
		this.funcion = new Funcion(10, 8, 40, 100);

		/* operaciones */
		this.funcion.venderAsiento(0, 1);
		this.funcion.venderAsiento(0, 2);
		this.funcion.venderAsiento(4, 7);
		this.funcion.venderAsiento(8, 7);
		double recaudado = this.funcion.obtenerRecaudacionTotal();

		/* comprobación */
		Assert.assertEquals(100 + 100 + 40 + 40, recaudado, 0);

	}

	@Test
	public void pruebaReservarAsientos() {
		/* condición inicial */
		this.funcion = new Funcion(10, 8, 40, 100);

		/* operaciones */
		this.funcion.reservarAsiento(0, 1);
		this.funcion.reservarAsiento(0, 2);
		this.funcion.reservarAsiento(0, 3);
		this.funcion.reservarAsiento(0, 4);
		this.funcion.reservarAsiento(0, 5);

		/* comprobación */
		Assert.assertEquals((10 * 8) - 5, this.funcion.obtenerAsientosLibres());

	}
}
