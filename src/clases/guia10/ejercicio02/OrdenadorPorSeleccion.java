package clases.guia10.ejercicio02;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Selección.
 */
public class OrdenadorPorSeleccion {
	/**
	 * post: reorganiza los elementos de vector de acuerdo al orden lineal <
	 * definido para los números enteros.
	 */
	public void ordenar(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			int minimo = i;

			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[minimo]) {

					minimo = j;
				}
			}

			int auxiliar = vector[i];
			vector[i] = vector[minimo];
			vector[minimo] = auxiliar;

		}
	}
}
