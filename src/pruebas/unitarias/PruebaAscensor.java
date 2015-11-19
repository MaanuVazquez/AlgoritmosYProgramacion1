package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.Ascensor;

public class PruebaAscensor {

	@Test
	public void pruebaAscensorConPisoNegativo() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(-50);

		/* operación */
		int cantidadDePisos = ascensor.obtenerCantidadDePisos();

		/* comprobacion */
		Assert.assertEquals(5, cantidadDePisos);
	}

	@Test
	public void pruebaAscensorConPisoCero() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(0);

		/* operación */
		int cantidadDePisos = ascensor.obtenerCantidadDePisos();

		/* comprobacion */
		Assert.assertEquals(5, cantidadDePisos);
	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarloDesdeElDecimoPiso() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		int pisosMovidos = ascensor.llamarDesde(10);

		/* comprobacion */
		Assert.assertEquals(10, pisosMovidos);

	}

	@Test
	public void pruebaAscensorDeDiezPisosUbicadoEnElUltimoPisoLlamarloDesdePlantaBaja() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);
		ascensor.llamarDesde(10);

		/* operación */
		int pisosMovidos = ascensor.llamarDesde(0);

		/* comprobación */
		Assert.assertEquals(10, pisosMovidos);
	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarloDesdeElPiso20() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		int pisosMovidos = ascensor.llamarDesde(20);

		/* comprobación */
		Assert.assertEquals(0, pisosMovidos);

	}

	@Test
	public void pruebaAscensorDeDiezPisosLlamarDesdeElPiso20Negativo() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operacion */
		int pisosMovidos = ascensor.llamarDesde(-20);

		/* comprobación */
		Assert.assertEquals(0, pisosMovidos);
	}

	@Test
	public void pruebaDeCantidadDeViajes() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobación */
		Assert.assertEquals(5, ascensor.obtenerCantidadDeViajesRealizados());

	}

	@Test
	public void pruebaCantidadDeViajesConMasDificultad() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(-1);
		ascensor.llamarDesde(10);
		ascensor.llamarDesde(5);
		ascensor.llamarDesde(60);

		/* comprobación */
		Assert.assertEquals(2, ascensor.obtenerCantidadDeViajesRealizados());
	}

	@Test
	public void pruebaCantidadDePisosMovidos() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobación */
		Assert.assertEquals(10, ascensor.obtenerCantidadDePisosMovidos());
	}

	@Test
	public void pruebaCantidadDePisosMovidosConMasDificultad() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(-5);
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(20);
		ascensor.llamarDesde(100);

		/* comprobación */
		Assert.assertEquals(6, ascensor.obtenerCantidadDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosBasica() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(2);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(6);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(10);

		/* comprobación */
		Assert.assertEquals(10 / 5, ascensor.promedioDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosAvanzada() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(-5);
		ascensor.llamarDesde(4);
		ascensor.llamarDesde(50);
		ascensor.llamarDesde(8);
		ascensor.llamarDesde(999);

		/* comprobación */
		Assert.assertEquals(8 / 2, ascensor.promedioDePisosMovidos());
	}

	@Test
	public void pruebaPromedioDePisosMovidosGarca() {
		/* condición inicial */
		Ascensor ascensor = new Ascensor(10);

		/* operación */
		ascensor.llamarDesde(0);
		ascensor.llamarDesde(0);

		/* comprobación */
		Assert.assertEquals(0, ascensor.promedioDePisosMovidos());
	}
}
