package clases.guia10.ejercicio05;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Inserción.
 */
public class OrdenadorPorInsercion {
	/**
	 * post: reorganiza los elementos de vector de acuerdo al orden lineal <
	 * definido para los números enteros.
	 */
	public void ordenar(int[] vector) {
		for (int i = 1; i < vector.length; i++) {
			int auxiliar = vector[i];
			int j;

			for (j = i - 1; j >= 0 && vector[j] > auxiliar; j--) {
				vector[j + 1] = vector[j];
			}

			vector[j + 1] = auxiliar;
		}
	}
}