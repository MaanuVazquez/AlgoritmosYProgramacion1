package clases.guia11.ejercicio01;

/**
 * Buscador que utiliza el algoritmo de b�squeda secuencial.
 */
public class BuscadorSecuencial {

	/**
	 * post: devuelve la posici�n de vector en la que se localiz� la primera
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