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
		/* condición inicial */
		cubo = new Cubo(-1);

		/* operaciones */
		this.longitudLado = cubo.medirLongitudLado();

		/* comprobación */
		Assert.assertEquals(10, this.longitudLado, 0);
	}

	@Test
	public void pruebaCambiarALongitudNegativa() {
		/* condición inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarLongitudLado(-10);
		this.longitudLado = cubo.medirLongitudLado();

		/* comprobación */
		Assert.assertEquals(10, this.longitudLado, 0);
	}

	@Test
	public void pruebaCalculoDeSuperficieCara() {
		/* condición inicial */
		cubo = new Cubo(10);

		/* operaciones */
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobación */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCara() {
		/* condición inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(25);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobación */
		Assert.assertEquals(25, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCaraNegativa() {
		/* condición inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(-5);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobación */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaCambiarSuperficieCara0() {
		/* condición inicial */
		cubo = new Cubo(10);

		/* operaciones */
		cubo.cambiarSuperficieCara(0);
		this.superficieCara = cubo.medirSuperficieCara();

		/* comprobación */
		Assert.assertEquals(100, this.superficieCara, 0);
	}

	@Test
	public void pruebaMedirVolumen() {
		/* condición inicial */
		cubo = new Cubo(20);

		/* operaciones */
		this.volumen = cubo.medirVolumen();

		/* comprobación */
		Assert.assertEquals(8000, this.volumen, 0);

	}

	@Test
	public void pruebaCambiarVolumen() {
		/* condición inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(125);
		this.volumen = cubo.medirVolumen();

		/* comprobación */
		Assert.assertEquals(125, this.volumen, 0);
	}

	@Test
	public void pruebaCambiarVolumenNegativo() {
		/* condición inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(-99);
		this.volumen = cubo.medirVolumen();

		/* comprobación */
		Assert.assertEquals(125000, this.volumen, 0);
	}

	@Test
	public void pruebaCambiarVolumenCero() {
		/* condición inicial */
		cubo = new Cubo(50);

		/* operaciones */
		cubo.cambiarVolumen(0);
		this.volumen = cubo.medirVolumen();

		/* comprobación */
		Assert.assertEquals(125000, this.volumen, 0);
	}

}
