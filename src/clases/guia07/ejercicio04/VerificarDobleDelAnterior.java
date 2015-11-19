package clases.guia07.ejercicio04;

public class VerificarDobleDelAnterior {

	public int verificacion(int[] arregloEntero) {

		int posicionInvalida = -1;

		for (int i = 1; i < arregloEntero.length && posicionInvalida == -1; i++) {
			boolean esElDoble = arregloEntero[i] == arregloEntero[i - 1] * 2;
			if (!esElDoble) {
				posicionInvalida = i;
			}
		}
		return posicionInvalida;
	}

}
