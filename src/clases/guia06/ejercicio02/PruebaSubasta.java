package clases.guia06.ejercicio02;

import org.junit.Assert;
import org.junit.Test;

public class PruebaSubasta {

	private Subasta subasta;

	@Test
	public void pruebaBasicaDeSubasta() {
		/* condici�n inicial */
		subasta = new Subasta("Cuadro Viejo", 100);

		/* operaciones */
		subasta.ofertar(200);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(200, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaArticuloConEspacios() {
		/* condici�n inicial */
		subasta = new Subasta("     ", 100);

		/* operaciones */
		String nombreArticulo = subasta.obtenerArticulo();

		/* comprobacion */
		Assert.assertEquals("Caf� Cortado", nombreArticulo);
	}

	@Test
	public void pruebaBasicaDeSubastaPrecioBaseNegativo() {
		/* condici�n inicial */
		subasta = new Subasta("Jab�n Espacio-Temporal", -400);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(10, ofertaMaxima, 0);

	}

	@Test
	public void pruebaBasicaDeSubastaPrecioBase0() {
		/* condici�n inicial */
		subasta = new Subasta("PCAnalyzer2003Professional Trial", 0);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOfertaMenorAPrecioBase() {
		/* condici�n inicial */
		subasta = new Subasta("", 30);

		/* operaciones */
		subasta.ofertar(28);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(30, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOfertaNegativa() {
		/* condici�n inicial */
		subasta = new Subasta("", 10);

		/* operaciones */
		subasta.ofertar(-6);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOferta0() {
		/* condici�n inicial */
		subasta = new Subasta("", 10);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaAvanzadaDeSubasta() {
		/* condici�n inicial */
		subasta = new Subasta("Cadena de Oro", 10000);

		/* operaci�n */
		subasta.ofertar(100000);
		subasta.cerrar();
		subasta.ofertar(19000000);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(100000, ofertaMaxima, 0);
	}

	@Test
	public void pruebaAvanzadaDeSubastaMuchasOfertas() {
		/* condici�n inicial */
		subasta = new Subasta("Cadena de Oro", 10000);

		/* operaci�n */
		subasta.ofertar(100000);
		subasta.ofertar(19000000);
		subasta.ofertar(-5);
		subasta.ofertar(0);
		subasta.ofertar(99999999);
		subasta.ofertar(100000000);
		subasta.ofertar(1200000000);
		subasta.cerrar();
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobaci�n */
		Assert.assertEquals(1200000000, ofertaMaxima, 0);
	}

}
