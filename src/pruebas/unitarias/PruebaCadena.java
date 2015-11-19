package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio05.Cadena;
import clases.guia07.ejercicio05.Eslabon;

public class PruebaCadena {
	Cadena cadena;

	@Test
	public void cadenaContarEslabones() {
		/* condici�n inicial */
		double[] longitudes = new double[] { 3, 4, 5, 7, 10, 40, 2.5, 5, 3.14,
				210 };
		cadena = new Cadena(longitudes);

		/* operaciones */
		int cantidadEslabones = cadena.contarCantidadDeEslabones();

		/* comprobaci�n */
		Assert.assertEquals(10, cantidadEslabones);

	}

	@Test
	public void contarLongitudTotalDeEslabones() {
		/* condici�n inicial */
		double[] longitudes = new double[] { 3, 4, 5, 7, 10, 40, 2.5, 5, 3.14,
				210 };
		cadena = new Cadena(longitudes);

		/* operaciones */
		double longitudTotalDeEslabones = cadena.obtenerLongitud();

		/* comprobaci�n */
		Assert.assertEquals(289.64, longitudTotalDeEslabones, 0.1);
	}

	@Test
	public void contarEslabonesConLongitudSuperiorA() {
		/* condici�n inicial */
		double[] longitudes = new double[] { 3, 4, 5, 7, 10, 40, 2.5, 5, 3.14,
				210 };
		cadena = new Cadena(longitudes);

		/* operaciones */
		int eslabonesConLongitudMayorA = cadena
				.contarEslabonesConLongitudSuperiorA(5.0);

		/* comprobaci�n */
		Assert.assertEquals(4, eslabonesConLongitudMayorA);
	}

	@Test
	public void obtenerEslabon() {
		/* condici�n inicial */
		double[] longitudes = new double[] { 3, 4, 5, 7, 10, 40, 2.5, 5, 3.14,
				210 };
		cadena = new Cadena(longitudes);

		/* operaciones */
		Eslabon eslabon = cadena.obtenerEslabon(3);

		/* comprobaci�n */
		Assert.assertEquals(5, eslabon.obtenerLongitud(), 0.1);
	}
}
