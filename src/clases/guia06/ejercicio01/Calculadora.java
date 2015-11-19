package clases.guia06.ejercicio01;

public class Calculadora {

	/**
	 * post devuelve la cantidad de divisores que tiene n�mero.
	 */
	public int contarDivisores(int numero) {

		int divisores = 0;

		// Si el n�mero es negativo, lo hacemos positivo.
		if (numero < 0) {
			numero *= -1;
		}

		/*
		 * Si el n�mero no es 0, se le calculan los divisores, si este es 0
		 * devuelve el valor maximo de un entero, ya qu�, 0 tiene infinitos
		 * divisores
		 */
		if (numero != 0) {
			for (int i = -numero; i <= numero; i++) {
				if (i != 0) {
					if (numero % i == 0) {
						divisores++;
					}
				}
			}
		} else {
			Error dividirPorCero = new Error("No se puede dividir por cero");
			throw dividirPorCero;
		}

		return divisores;
	}
}