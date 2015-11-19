package pruebas.unitarias;

import org.junit.*;
import clases.guia08.ejercicio03.Matriz;

public class PruebaMatriz {

	private Matriz calculadora;

	public PruebaMatriz() {
		calculadora = new Matriz();
	}

	@Test
	public void pruebaSuma() {

		double[][] array1 = new double[2][2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 1 + j;
			}
		}

		double[][] array2 = new double[2][2];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = 1 + j;
			}
		}

		double[][] array3 = new double[2][2];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = 1 + j + 1 + j;
			}
		}

		calculadora.sumaDeMatrices(array1, array2);

		Assert.assertArrayEquals(array3, array1);

	}

	@Test(expected = Error.class)
	public void pruebaSumaIncorrecta() {
		double[][] array1 = new double[2][3];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 0;
			}
		}

		double[][] array2 = new double[2][2];

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = 0;
			}
		}

		calculadora.sumaDeMatrices(array1, array2);
	}

	@Test
	public void pruebaRestaDeMatrices() {
		double[][] array1 = new double[2][2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 4 + j;
			}
		}

		double[][] array2 = new double[2][2];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = 1 + j;
			}
		}

		double[][] array3 = new double[2][2];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = (4 + j) - (1 + j);
			}
		}
		
		calculadora.restaDeMatrices(array1, array2);

		Assert.assertArrayEquals(array3, array1);
	}
	
	@Test
	public void pruebaMultiplicacionPorEscalar() {
		double[][] array1 = new double[2][2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 1 + j;
			}
		}
		
		double[][] array2 = new double[2][2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array2[i][j] = (1 + j) * 3;
			}
		}
		
		calculadora.multiplicarPorEscalar(array1, 3);
		Assert.assertArrayEquals(array2, array1);
	}

}
