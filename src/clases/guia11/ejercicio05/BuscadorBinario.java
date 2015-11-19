package clases.guia11.ejercicio05;

/**
 * Buscador que utiliza el algoritmo de búsqueda binaria.
 */
public class BuscadorBinario {
	/**
	 * post: devuelve la posición de vector en la que se localizó la primera
	 * ocurrencia del elemento buscado. Si no lo encuentra devuelve -1.
	 */
	public int buscar(int[] vector, int buscado) {

		int principio = 0;
		int ultimo = vector.length - 1;
		int posicionEncontrada = -1;

		while (principio <= ultimo && posicionEncontrada == -1) {
			int centro = (principio + ultimo) / 2;

			if (vector[centro] == buscado) {
				posicionEncontrada = centro;
			} else if (buscado > vector[centro]) {
				principio = centro + 1;
			} else {
				ultimo = centro - 1;
			}
		}

		return posicionEncontrada;
	}
}