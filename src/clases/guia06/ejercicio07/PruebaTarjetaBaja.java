package clases.guia06.ejercicio07;

import org.junit.Assert;
import org.junit.Test;

import clases.guia05.ejercicio05.TarjetaBaja;

public class PruebaTarjetaBaja {

	TarjetaBaja baja;

	@Test(expected = Error.class)
	public void pruebaTarjetaInicial() {

		/* condici�n inicial */
		baja = new TarjetaBaja(-59);
	}

	@Test
	public void pruebaNull() {

		/* condici�n inicial */
		baja = new TarjetaBaja(10);

		/* comprobaci�n */
		Assert.assertNotNull(baja);
	}

	@Test(expected = Error.class)
	public void pruebaBasicaDeTarjeta() {
		/* condici�n inicial */
		baja = new TarjetaBaja(50);

		/* operaciones */
		baja.cargar(-999);

	}

	@Test
	public void pruebaBasicaDeCarga() {
		/* condici�n inicial */
		baja = new TarjetaBaja(10);

		/* operaciones */
		baja.cargar(40);

		/* comprobaci�n */
		Assert.assertEquals(50, baja.obtenerSaldo(), 0);
	}

	@Test
	public void pruebaDeViaje() {

		/* condici�n inicial */
		baja = new TarjetaBaja(1000);

		/* operaciones */
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();

		/* comprobaci�n */
		Assert.assertEquals(9, baja.contarViajes());
		Assert.assertEquals(9, baja.contarViajesEnColectivo());
		Assert.assertEquals(1000 - (1.25 * 9), baja.obtenerSaldo(), 0);
	}

	@Test
	public void pruebaDeViajesDistintos() {

		/* condici�n inicial */
		baja = new TarjetaBaja(100);

		/* operaciones */
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnSubte();
		baja.pagarViajeEnSubte();
		baja.pagarViajeEnSubte();
		baja.pagarViajeEnSubte();
		baja.pagarViajeEnSubte();

		/* comprobaci�n */
		Assert.assertEquals(3, baja.contarViajesEnColectivo());
		Assert.assertEquals(5, baja.contarViajesEnSubte());
		Assert.assertEquals(3 + 5, baja.contarViajes());

	}

	@Test(expected = Error.class)
	public void pruebaSaldoInsuficienteColectivo() {

		/* condici�n inicial */
		baja = new TarjetaBaja(2);

		/* operaciones */
		baja.pagarViajeEnColectivo();
		baja.pagarViajeEnColectivo();

	}

	@Test(expected = Error.class)
	public void pruebaSaldoInsuficienteSubte() {

		/* condici�n inicial */
		baja = new TarjetaBaja(2);

		/* operaciones */
		baja.pagarViajeEnSubte();
	}
}
