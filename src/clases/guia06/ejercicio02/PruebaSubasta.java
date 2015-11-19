package clases.guia06.ejercicio02;

import org.junit.Assert;
import org.junit.Test;

public class PruebaSubasta {

	private Subasta subasta;

	@Test
	public void pruebaBasicaDeSubasta() {
		/* condición inicial */
		subasta = new Subasta("Cuadro Viejo", 100);

		/* operaciones */
		subasta.ofertar(200);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(200, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaArticuloConEspacios() {
		/* condición inicial */
		subasta = new Subasta("     ", 100);

		/* operaciones */
		String nombreArticulo = subasta.obtenerArticulo();

		/* comprobacion */
		Assert.assertEquals("Café Cortado", nombreArticulo);
	}

	@Test
	public void pruebaBasicaDeSubastaPrecioBaseNegativo() {
		/* condición inicial */
		subasta = new Subasta("Jabón Espacio-Temporal", -400);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(10, ofertaMaxima, 0);

	}

	@Test
	public void pruebaBasicaDeSubastaPrecioBase0() {
		/* condición inicial */
		subasta = new Subasta("PCAnalyzer2003Professional Trial", 0);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOfertaMenorAPrecioBase() {
		/* condición inicial */
		subasta = new Subasta("", 30);

		/* operaciones */
		subasta.ofertar(28);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(30, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOfertaNegativa() {
		/* condición inicial */
		subasta = new Subasta("", 10);

		/* operaciones */
		subasta.ofertar(-6);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaBasicaDeSubastaOferta0() {
		/* condición inicial */
		subasta = new Subasta("", 10);

		/* operaciones */
		subasta.ofertar(0);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(10, ofertaMaxima, 0);
	}

	@Test
	public void pruebaAvanzadaDeSubasta() {
		/* condición inicial */
		subasta = new Subasta("Cadena de Oro", 10000);

		/* operación */
		subasta.ofertar(100000);
		subasta.cerrar();
		subasta.ofertar(19000000);
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(100000, ofertaMaxima, 0);
	}

	@Test
	public void pruebaAvanzadaDeSubastaMuchasOfertas() {
		/* condición inicial */
		subasta = new Subasta("Cadena de Oro", 10000);

		/* operación */
		subasta.ofertar(100000);
		subasta.ofertar(19000000);
		subasta.ofertar(-5);
		subasta.ofertar(0);
		subasta.ofertar(99999999);
		subasta.ofertar(100000000);
		subasta.ofertar(1200000000);
		subasta.cerrar();
		float ofertaMaxima = subasta.obtenerOfertaGanadora();

		/* comprobación */
		Assert.assertEquals(1200000000, ofertaMaxima, 0);
	}

}
