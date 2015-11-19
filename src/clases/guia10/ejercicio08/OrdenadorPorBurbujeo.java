package clases.guia10.ejercicio08;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Burbujeo.
 */
public class OrdenadorPorBurbujeo {
	/**
	 * post: reorganiza los elementos de vector de acuerdo al orden lineal <
	 * definido para los números enteros.
	 */
	public void ordenar(int[] vector) {
		boolean huboCambios = true;

		while (huboCambios) {
			huboCambios = false;
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i + 1] < vector[i]) {
					int auxiliar = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = auxiliar;
					huboCambios = true;
				}
			}
		}
	}
}