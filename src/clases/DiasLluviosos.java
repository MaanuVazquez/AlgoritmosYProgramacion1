package clases;

public class DiasLluviosos {

	private boolean[] diasDelAño = new boolean[365];
	private int[] lluviaPorCuatrimestre = new int[2];

	public DiasLluviosos() {

		for (int i = 0; i < diasDelAño.length; i++) {

			this.diasDelAño[i] = false;
		}
	}

	public void registrarDiaQueLlovio(int dia, boolean llovio) {

		if (dia >= 1 && dia <= 365) {
			this.diasDelAño[dia - 1] = llovio;
		} else {
			throw new Error("El día indicado es incorrecto. (1-365)");
		}
	}

	public boolean consultarSiLlovio(int dia) {

		return this.diasDelAño[dia - 1];
	}

	public int contarDiasLluviosos() {

		int cantidadDeDiasLluviosos = 0;

		for (int i = 0; i < diasDelAño.length; i++) {

			if (consultarSiLlovio(i + 1)) {

				if (i < 120) {
					this.lluviaPorCuatrimestre[0]++;
				} else if (i < 240) {
					this.lluviaPorCuatrimestre[1]++;
				} else {
					this.lluviaPorCuatrimestre[2]++;
				}

				cantidadDeDiasLluviosos++;
			}
		}
		return cantidadDeDiasLluviosos;
	}

	public int colsultarCuatrimestrMasLluvioso() {

		int cuatrimestreMasLluvioso = lluviaEnRangoDeDias(1, 120);

		if (cuatrimestreMasLluvioso < lluviaEnRangoDeDias(121, 240)) {
			cuatrimestreMasLluvioso = lluviaEnRangoDeDias(121, 240);
		} else if (cuatrimestreMasLluvioso < lluviaEnRangoDeDias(241, 365)) {
			cuatrimestreMasLluvioso = lluviaEnRangoDeDias(241, 365);
		}

		return cuatrimestreMasLluvioso;

	}

	private int lluviaEnRangoDeDias(int primerDia, int ultimoDia) {
		int lluviaEnElRango = 0;
		for (int i = primerDia - 1; i < ultimoDia; i++) {
			lluviaEnElRango++;
		}
		return lluviaEnElRango;
	}

	public int consultarPrimerDiaConLluvia() {
		int primerDiaLluvioso = 0;
		boolean primerDiaEncontrado = false;
		while (primerDiaLluvioso < this.diasDelAño.length
				&& !primerDiaEncontrado) {
			primerDiaEncontrado = this.diasDelAño[primerDiaLluvioso++];
		}
		return primerDiaLluvioso;
	}

}
