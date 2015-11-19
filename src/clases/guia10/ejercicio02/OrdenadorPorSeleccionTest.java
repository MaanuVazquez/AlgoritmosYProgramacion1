package clases.guia10.ejercicio02;

import clases.guia10.ejercicio01.VerificadorDeOrden;
import org.junit.*;

public class OrdenadorPorSeleccionTest {

	OrdenadorPorSeleccion ops = new OrdenadorPorSeleccion();
	VerificadorDeOrden vdo = new VerificadorDeOrden();

	@Test
	public void prueba1() {
		int[] vector1 = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int[] vector2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] vector3 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		Assert.assertEquals(false, vdo.estaOrdenadoAscendentemente(vector1));
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector2));
		Assert.assertEquals(true, vdo.estaOrdenadoDescendentemente(vector3));
		
		ops.ordenar(vector1);
		ops.ordenar(vector3);
		
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector1));
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector2));
		Assert.assertEquals(false, vdo.estaOrdenadoDescendentemente(vector3));
		Assert.assertEquals(true, vdo.estaOrdenadoAscendentemente(vector3));
		
	}

}
