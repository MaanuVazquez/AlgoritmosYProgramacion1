package clases.guia08.ejercicio02;

import org.junit.*;

public class TrianguloDePascalTest {
	@Test
	public void getCoeficiente() {
		TrianguloDePascal triangulo = new TrianguloDePascal(5);
		Assert.assertEquals("cantidad de filas", 5, triangulo.getAltura());
		Assert.assertEquals("2º coeficiente de la fila 4", 3,
				triangulo.getCoeficiente(4, 2));
		Assert.assertEquals("4º coeficiente de la fila 5", 4,
				triangulo.getCoeficiente(5, 4));
	}
}