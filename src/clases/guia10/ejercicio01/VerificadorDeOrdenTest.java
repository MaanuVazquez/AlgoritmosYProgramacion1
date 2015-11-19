package clases.guia10.ejercicio01;

import org.junit.*;

public class VerificadorDeOrdenTest {

	VerificadorDeOrden vdo = new VerificadorDeOrden();

	@Test
	public void prueba1() {
		int[] vector = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] vector2 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] vector3 = new int[] { 1, 3, 2, 4, 5, 6, 7, 8 };

		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector));
		Assert.assertEquals(false, vdo.estaOrdenadoAscendentemente(vector2));
		Assert.assertEquals(false, vdo.estaOrdenadoAscendentemente(vector3));
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector));
		Assert.assertEquals(true, vdo.estaOrdenadoDescendentemente(vector2));
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector3));
	}

	@Test
	public void pruebaImpuesta() {
		int[] vector1 = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int[] vector2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] vector3 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] vector4 = new int[] {};

		/* Ascendentemente */
		Assert.assertEquals(false, vdo.estaOrdenadoAscendentemente(vector1));
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector2));
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector3));
		Assert.assertEquals(false, vdo.estaOrdenadoAscendentemente(vector4));

		/* Descendentemente */
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector1));
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector2));
		Assert.assertEquals(true, vdo.estaOrdenadoDescendentemente(vector3));
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector4));
	}

}
