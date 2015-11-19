package clases.guia07.ejercicio03;

public class VerificadorDeOrden {

	public boolean verificar(int[] numerosEnteros) {
		int numerosOrdenados = 0;
		boolean verificacionDeOrden = false;

		for (int i = 1; i < numerosEnteros.length; i++) {
			/* Orden Ascendente */
			if (numerosEnteros[i] - 1 == numerosEnteros[i - 1]) {
				numerosOrdenados++;
				/* Orden Descendente */
			} else if (numerosEnteros[i] + 1 == numerosEnteros[i - 1]) {
				numerosOrdenados++;
			} else if (numerosEnteros[i] == numerosEnteros[i - 1]) {
				numerosOrdenados++;
			}

		}

		if (numerosOrdenados == numerosEnteros.length - 1) {
			verificacionDeOrden = true;
		}

		return verificacionDeOrden;
	}

}
