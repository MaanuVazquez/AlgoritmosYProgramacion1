package clases.guia10.ejercicio01;

public class VerificadorDeOrden {
	/**
	 * post: indica si los elemento del vector están o no ordenados de manera
	 * ascendente.
	 */
	public boolean estaOrdenadoAscendentemente(int[] vector) {

		int elementosOrdenadosAscendentemente = 0;

		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < vector[i + 1] || vector[i] == vector[i+1]) {
				elementosOrdenadosAscendentemente++;
			}
		}

		return elementosOrdenadosAscendentemente == vector.length - 1;
	}

	/**
	 * post: indica si los elemento del vector están o no ordenados de manera
	 * descendente.
	 */
	public boolean estaOrdenadoDescendentemente(int[] vector) {

		int elementosOrdenadosDescendentemente = 0;

		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] > vector[i + 1] || vector[i] == vector[i+1]) {
				elementosOrdenadosDescendentemente++;
			}
		}

		return elementosOrdenadosDescendentemente == vector.length - 1;
	}
}
