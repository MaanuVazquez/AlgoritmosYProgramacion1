package clases.guia11.ejercicio01;

import org.junit.*;

public class BuscadorSecuencialTest {

	private BuscadorSecuencial buscador = new BuscadorSecuencial();

	@Test
	public void pruebaVector1() {
		/* condición inicial */
		int[] vector = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int buscado = 65;

		/* operaciones */
		int encontrado = this.buscador.buscar(vector, buscado);

		/* comprobación */
		Assert.assertEquals(4, encontrado);

	}

	@Test
	public void pruebaVector2() {
		/* condición inicial */
		int[] vector = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int buscado = 9;

		/* operaciones */
		int encontrado = this.buscador.buscar(vector, buscado);

		/* comprobación */
		Assert.assertEquals(8, encontrado);

	}

	@Test
	public void pruebaVector3() {
		/* condición inicial */
		int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
		int buscado = 10;

		/* operaciones */
		int encontrado = this.buscador.buscar(vector, buscado);

		/* comprobación */
		Assert.assertEquals(0, encontrado);

	}

	@Test
	public void pruebaVector4() {
		/* condición inicial */
		int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
		int buscado = 8;

		/* operaciones */
		int encontrado = this.buscador.buscar(vector, buscado);

		/* comprobación */
		Assert.assertEquals(-1, encontrado);

	}

}
