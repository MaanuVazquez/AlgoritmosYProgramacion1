package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia07.ejercicio06.Tren;
import clases.guia07.ejercicio06.Vagon;

public class PruebaTren {

	private Tren chuchu;

	@Test
	public void pruebaDeTrenCorrectamenteCreado() {
		/* condici�n inicial */
		int[] cargas = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		/* operaciones */
		chuchu = new Tren("1324", cargas);

		/* comprobaci�n */
		Assert.assertNotNull(chuchu);
	}

	@Test
	public void pruebaCodigoDelTren() {
		/* condici�n inicial */
		int[] cargas = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		chuchu = new Tren("1324", cargas);

		/* operaciones */
		String codigo = chuchu.obtenerCodigo();

		/* comprobaci�n */
		Assert.assertEquals("1324", codigo);
	}

	@Test
	public void pruebaObtenerVagon() {
		/* condici�n inicial */
		int[] cargas = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		chuchu = new Tren("1324", cargas);

		/* operaciones */
		Vagon vagoncito = chuchu.obtenerVagon(5);

		/* comprobaci�n */
		Assert.assertEquals(50, vagoncito.obtenerCapacidadDeCarga());
	}

	@Test
	public void pruebaObtenerCarga() {
		/* condici�n inicial */
		int[] cargas = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		chuchu = new Tren("1324", cargas);

		/* operaciones */
		for (int i = 0; i < cargas.length; i++) {
			chuchu.obtenerVagon(i + 1).cambiarCarga(10);
		}

		/* comprobaci�n */
		Assert.assertEquals(100, chuchu.obtenerCargaTotal());
	}

	@Test
	public void pruebaCargaSuperiorAlPromedio() {
		/* condici�n inicial */
		int[] cargas = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		chuchu = new Tren("1324", cargas);

		/* operaciones */
		for (int i = 0; i < cargas.length; i++) {
			chuchu.obtenerVagon(i + 1).cambiarCarga(cargas[i]);
		}

		/* comprobaci�n */
		Assert.assertEquals(5, chuchu.contarVagonesConCargaSuperiorAlPromedio());
	}

}
