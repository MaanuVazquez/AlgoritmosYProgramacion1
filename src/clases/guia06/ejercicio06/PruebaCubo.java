package clases.guia06.ejercicio06;

import org.junit.Assert;
import org.junit.Test;

import clases.guia05.ejercicio04.Cubo;

public class PruebaCubo {

	private Cubo cubo;
	private double longitudLado;
	private double superficieCara;
	private double volumen;

	@Test
	public void pruebaCrearCuboNegativo() {
		/* condici�n inicial */
		cubo = new Cubo(-1);

		/* operaciones */
		this.longitudLado = cubo.medirLongitudLado();

		/* comprobaci�n */
		Assert.assertEquals(10, this.longitudLado, 0);
	}

	@Test
	public void pruebaCambiarALongitudNegativa() {
		/* condici�n inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarLongitudLado(-10);
		this.longitudLado = cubo.medirLongitudLado();

		/* comprobaci�n */
		Assert.assertEquals(10, this.longitudLado, 0);
	}

	@Test
	public void pruebaCalculoDeSuperficieCara() {
		/* condici�n inicial */
		cubo = new Cubo(10);

		/* operaciones */
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobaci�n */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCara() {
		/* condici�n inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(25);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobaci�n */
		Assert.assertEquals(25, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCaraNegativa() {
		/* condici�n inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(-5);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobaci�n */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCara0() {
		/* condici�n inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(0);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobaci�n */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaMedirVolumen() {
		/* condici�n inicial */
		cubo = new Cubo(20);

		/* operaciones */
		this.volumen = cubo.medirVolumen();

		/* comprobaci�n */
		Assert.assertEquals(8000, this.volumen, 0);

	}

	@Test
	public void pruebaCambiarVolumen() {
		/* condici�n inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(125);
		this.volumen = cubo.medirVolumen();

		/* comprobaci�n */
		Assert.assertEquals(125, this.volumen, 0);
	}

	@Test
	public void pruebaCambiarVolumenNegativo() {
		/* condici�n inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(-99);
		this.volumen = cubo.medirVolumen();

		/* comprobaci�n */
		Assert.assertEquals(125000, this.volumen, 0);
	}

	@Test
	public void pruebaCambiarVolumenCero() {
		/* condici�n inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(0);
		this.volumen = cubo.medirVolumen();

		/* comprobaci�n */
		Assert.assertEquals(125000, this.volumen, 0);
	}

}
