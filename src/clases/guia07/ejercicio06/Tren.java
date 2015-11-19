package clases.guia07.ejercicio06;

public class Tren {
	private String codigo;
	private Vagon[] vagones;

	/**
	 * post crea el Tren con el código indicado, inicializando los Vagones con
	 * número correlativo y la capacidad de carga indicada en
	 * capacidadesDeCarga.
	 */
	public Tren(String codigo, int[] capacidadesDeCarga) {
		// Se verifica que el codigo no contenga espacios.
		if (codigo.trim().length() > 0) {
			this.codigo = codigo;
		} else {
			this.codigo = "1234";
		}

		vagones = new Vagon[capacidadesDeCarga.length];

		for (int i = 0; i < vagones.length; i++) {
			vagones[i] = new Vagon(i, capacidadesDeCarga[i]);
		}

	}

	public String obtenerCodigo() {
		return this.codigo;
	}

	/**
	 * pre número es un valor comprendido en entre 1 y la cantidad de vagones
	 * que tiene el Tren. post devuelve el Vagón con el número indicado.
	 */
	public Vagon obtenerVagon(int numero) {
		return vagones[numero - 1];
	}

	/**
	 * post devuelve la carga total del Tren, siendo esta la suma de cargas de
	 * sus vagones.
	 */
	public int obtenerCargaTotal() {

		int cargaTotal = 0;

		for (int i = 0; i < vagones.length; i++) {
			cargaTotal += vagones[i].obtenerCarga();
		}

		return cargaTotal;

	}

	/**
	 * post devuelve la cantidad de Vagones cuya carga es superior al promedio
	 * de carga de los Vagones del Tren.
	 */
	public int contarVagonesConCargaSuperiorAlPromedio() {

		int promedioDeCarga = obtenerCargaTotal() / vagones.length;
		int vagonesConCargaSuperiorAlPromedio = 0;

		for (int i = 0; i < vagones.length; i++) {
			if (vagones[i].obtenerCarga() > promedioDeCarga) {
				vagonesConCargaSuperiorAlPromedio++;
			}
		}

		return vagonesConCargaSuperiorAlPromedio;

	}
}