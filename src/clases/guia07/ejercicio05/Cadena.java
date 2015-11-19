package clases.guia07.ejercicio05;

/**
 * Una Candena est� conformada por una secuencia de Eslabones. Cada uno de los
 * Eslabones que forman parte de una Cadena pueden tener diferente longitud.
 */
public class Cadena {

	private Eslabon[] eslabones;

	/**
	 * post crea la Cadena inicializando los Eslabones con n�mero correlativo y
	 * con la longitud indicada en longitudesDeEslabones.
	 */
	public Cadena(double[] longitudesDeEslabones) {
		eslabones = new Eslabon[longitudesDeEslabones.length];
		for (int i = 0; i < longitudesDeEslabones.length; i++) {
			eslabones[i] = new Eslabon(i, longitudesDeEslabones[i]);
		}

	}

	/**
	 * post devuelve la cantida de Eslabones que tiene la Cadena.
	 */
	public int contarCantidadDeEslabones() {

		return eslabones.length;

	}

	/**
	 * pre n�mero es un valor comprendido en entre 1 y la cantidad de Eslabones
	 * que tiene la Cadena. post devuelve el Eslab�n con el n�mero indicado.
	 */
	public Eslabon obtenerEslabon(int numero) {
		return eslabones[numero - 1];
	}

	/**
	 * post devuelve la longitud total de la Cadena, siendo esta la suma de la
	 * longitudes de sus Eslabones.
	 */
	public double obtenerLongitud() {
		double longitudTotal = 0;

		for (int i = 0; i < eslabones.length; i++) {
			longitudTotal += eslabones[i].obtenerLongitud();
		}

		return longitudTotal;
	}

	/**
	 * post devuelve la cantidad de Eslabones cuya longitud es superior a
	 * longitudMinima.
	 */
	public int contarEslabonesConLongitudSuperiorA(double longitudMinima) {
		int cantidadDeEslabones = 0;

		for (int i = 0; i < eslabones.length; i++) {
			if (eslabones[i].obtenerLongitud() > longitudMinima) {
				cantidadDeEslabones++;
			}
		}

		return cantidadDeEslabones;
	}
}