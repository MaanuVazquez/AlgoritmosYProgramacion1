package clases.guia06.ejercicio08;

import org.junit.*;
import clases.guia05.ejercicio10.Cerradura;

public class PruebaCerradura {

	Cerradura cerradura;

	@Test
	public void pruebaCreacionDeInstancia() {

		/* condición inicial */
		cerradura = new Cerradura(1234, 1);

		/* comprobación */
		Assert.assertNotNull(cerradura);
	}

	@Test(expected = Error.class)
	public void pruebaCodigoDeSeguridadInvalido() {

		/* condición inicial */
		cerradura = new Cerradura(-3, 3);
	}

	@Test(expected = Error.class)
	public void pruebaNumeroDeFallosPosiblesInvalido() {

		/* condición inicial */
		cerradura = new Cerradura(1234, 0);
	}

	@Test
	public void pruebaBloquearCerradura() {
		/* condición inicial */
		cerradura = new Cerradura(1234, 1);

		/* operaciones */
		cerradura.abrir(1324);

		/* comprobacion */
		Assert.assertEquals(true, cerradura.estaCerrada());
		Assert.assertEquals(false, cerradura.estaAbierta());
		Assert.assertEquals(true, cerradura.fueBloqueada());
	}

	@Test
	public void pruebaAbriryCerrarCerradura() {
		/* condición inicial */
		cerradura = new Cerradura(1234, 3);

		/* operaciones */
		cerradura.abrir(1234);
		Assert.assertEquals(true, cerradura.estaAbierta());
		Assert.assertEquals(false, cerradura.estaCerrada());
		cerradura.cerrar();
		Assert.assertEquals(false, cerradura.estaAbierta());
		Assert.assertEquals(true, cerradura.estaCerrada());
	}

	@Test
	public void pruebaContarAberturasFallidasoExitosas() {
		/* condición inicial */
		cerradura = new Cerradura(1234, 5);

		/* operaciones */
		cerradura.abrir(1234);
		Assert.assertEquals(1, cerradura.contarAperturasExitosas());
		cerradura.abrir(1234);
		Assert.assertEquals(1, cerradura.contarAperturasExitosas());
		cerradura.cerrar();
		cerradura.abrir(1234);
		Assert.assertEquals(2, cerradura.contarAperturasExitosas());
		cerradura.abrir(1045);
		Assert.assertEquals(0, cerradura.contarAperturasFallidas());
		Assert.assertEquals(2, cerradura.contarAperturasExitosas());
		cerradura.cerrar();
		cerradura.abrir(1045);
		cerradura.abrir(1065);
		cerradura.abrir(1324);
		Assert.assertEquals(3, cerradura.contarAperturasFallidas());
		Assert.assertEquals(true, cerradura.estaCerrada());
		Assert.assertEquals(false, cerradura.estaAbierta());
		Assert.assertEquals(false, cerradura.fueBloqueada());

	}

}
