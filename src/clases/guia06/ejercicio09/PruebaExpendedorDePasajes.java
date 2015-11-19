package clases.guia06.ejercicio09;

import org.junit.*;
import clases.guia05.ejercicio11.ExpendedorDePasajes;

public class PruebaExpendedorDePasajes {

	ExpendedorDePasajes expendedor;

	@Test
	public void prubaDeInstanciaCorrecta() {

		/* condición inicial */
		expendedor = new ExpendedorDePasajes(10);

		/* comprobación */
		Assert.assertNotNull(expendedor);

	}
	
	@Test(expected = Error.class)
	public void pruebaKilometrosMenoresA1() {
		
		/* condición inicial */
		expendedor = new ExpendedorDePasajes(0);
	}
	
	@Test
	public void pruebaExpendedor() {
		/* condición inicial */
		expendedor = new ExpendedorDePasajes(20);
		
		/* operaciones */
		expendedor.venderPasaje(10);
		Assert.assertEquals(1, expendedor.pasajesVendidos());
		Assert.assertEquals(10, expendedor.distanciaMaxima(), 0);
		expendedor.venderPasajes(3, 20);
		Assert.assertEquals(4, expendedor.pasajesVendidos());
		Assert.assertEquals(20, expendedor.distanciaMaxima(), 0);
		Assert.assertEquals(30*20*4, expendedor.ventaTotal(), 0);
	}
	
	@Test(expected = Error.class)
	public void pruebaExpendedorFallido() {
		/* condición inicial */
		expendedor = new ExpendedorDePasajes(20);
		
		/* operaciones */
		expendedor.distanciaPromedio();
	}
}
