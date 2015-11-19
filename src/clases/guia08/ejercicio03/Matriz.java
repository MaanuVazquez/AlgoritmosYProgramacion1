package clases.guia08.ejercicio03;

public class Matriz {

	public void sumaDeMatrices(double[][] firstArray, double[][] secondArray) {

		arrayCheck(firstArray, secondArray);

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < firstArray[i].length; j++) {
				firstArray[i][j] = firstArray[i][j] + secondArray[i][j];
			}
		}

	}

	public void restaDeMatrices(double[][] firstArray, double[][] secondArray) {

		arrayCheck(firstArray, secondArray);

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < firstArray[i].length; j++) {
				firstArray[i][j] = firstArray[i][j] - secondArray[i][j];
			}
		}

	}

	public void multiplicarPorEscalar(double[][] array, double escalar) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] *= escalar;
			}
		}
	}

	public void arrayCheck(double[][] firstArray, double[][] secondArray) {

		if (firstArray.length != secondArray.length) {
			throw new Error("Las matrices deben tener la misma longitud");
		}

		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i].length != secondArray[i].length) {
				throw new Error("Las matrices deben tener la misma longitud");
			}
		}
	}

}
