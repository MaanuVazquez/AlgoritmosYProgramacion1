package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.Ascensor;

public class PruebaAscensor {

	@Test
	public void pruebaAscensorConPisoNegativo() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(-50);

		/* operaci�n */
		int cantidadDePisos = ascensor.obtenerCantidadDePisos();

		/* comprobacion */
		Assert.assertEquals(5, cantidadDePisos);
	}

	@Test
	public void pruebaAscensorConPisoCero() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(0);

		/* operaci�n */
		int cantidadDePisos = ascensor.obtenerCantidadDePisos();

		/* comprobacion */
		Assert.assertEquals(5, cantidadDePisos);
	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarloDesdeElDecimoPiso() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		int pisosMovidos = ascensor.llamarDesde(10);

		/* comprobacion */
		Assert.assertEquals(10, pisosMovidos);

	}

	@Test
	public void pruebaAscensorDeDiezPisosUbicadoEnElUltimoPisoLlamarloDesdePlantaBaja() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);
		ascensor.llamarDesde(10);

		/* operaci�n */
		int pisosMovidos = ascensor.llamarDesde(0);

		/* comprobaci�n */
		Assert.assertEquals(10, pisosMovidos);
	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarloDesdeElPiso20() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		int pisosMovidos = ascensor.llamarDesde(20);

		/* comprobaci�n */
		Assert.assertEquals(0, pisosMovidos);

	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarDesdeElPiso20Negativo() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operacion */
		int pisosMovidos = ascensor.llamarDesde(-20);

		/* comprobaci�n */
		Assert.assertEquals(0, pisosMovidos);
	}

	@Test
	public void pruebaDeCantidadDeViajes() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobaci�n */
		Assert.assertEquals(5, ascensor.obtenerCantidadDeViajesRealizados());

	}

	@Test
	public void pruebaCantidadDeViajesConMasDificultad() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(-1);
		ascensor.llamarDesde(10);
		ascensor.llamarDesde(5);
		ascensor.llamarDesde(60);

		/* comprobaci�n */
		Assert.assertEquals(2, ascensor.obtenerCantidadDeViajesRealizados());
	}

	@Test
	public void pruebaCantidadDePisosMovidos() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobaci�n */
		Assert.assertEquals(10, ascensor.obtenerCantidadDePisosMovidos());
	}

	@Test
	public void pruebaCantidadDePisosMovidosConMasDificultad() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(-5);
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(20);
		ascensor.llamarDesde(100);

		/* comprobaci�n */
		Assert.assertEquals(6, ascensor.obtenerCantidadDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosBasica() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobaci�n */
		Assert.assertEquals(10 / 5, ascensor.promedioDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosAvanzada() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(-5);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(50);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(999);

		/* comprobaci�n */
		Assert.assertEquals(8 / 2, ascensor.promedioDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosGarca() {
		/* condici�n inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operaci�n */
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(0);

		/* comprobaci�n */
		Assert.assertEquals(0, ascensor.promedioDePisosMovidos());
	}
}
