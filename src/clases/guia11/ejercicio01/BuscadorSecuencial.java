package clases.guia11.ejercicio01;

/**
 * Buscador que utiliza el algoritmo de búsqueda secuencial.
 */
public class BuscadorSecuencial {

	/**
	 * post: devuelve la posición de vector en la que se localizó la primera
	 * ocurrencia del elemento buscado. Si no lo encuentra devuelve -1.
	 */
	public int buscar(int[] vector, int buscado) {

		int posicionEncontrada = 0;

		for (int i = 0; (i < vector.length) && (vector[i] != buscado); i++) {
			posicionEncontrada = i + 1;
		}

		if (posicionEncontrada == vector.length) {
			posicionEncontrada = -1;
		}

		return posicionEncontrada;
	}
}