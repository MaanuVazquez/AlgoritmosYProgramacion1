package clases;

public class Funcion {

	private Asiento[][] sala;
	private double recaudacionTotal;
	private int cantidadDeAsientos;

	public Funcion(int filas, int columnas, double precioBasico, double precioPremium) {

		if (precioBasico <= 0 || precioBasico >= precioPremium) {
			throw new Error("Precios mal insertados.");
		}

		verificarFilayColumna(filas, columnas);
		this.sala = new Asiento[filas][columnas];

		for (int i = 0; i < this.sala.length; i++) {
			for (int j = 0; j < this.sala[i].length; j++) {
				if (i == 0) {
					this.sala[i][j] = new Asiento(precioPremium);
				} else {
					this.sala[i][j] = new Asiento(precioBasico);
				}
				this.cantidadDeAsientos++;
			}
		}

		recaudacionTotal = 0;

	}

	public void venderAsiento(int fila, int columna) {

		verificarFilayColumna(fila, columna);

		if (this.sala[fila][columna].obtenerDisponibilidad() == Disponibilidad.LIBRE) {
			this.sala[fila][columna].vender();
			this.recaudacionTotal += this.sala[fila][columna].obtenerPrecio();
		} else {
			throw new Error("El asiento indicado no se encuentra libre.");
		}

	}

	public void reservarAsiento(int fila, int columna) {

		verificarFilayColumna(fila, columna);

		if (this.sala[fila][columna].obtenerDisponibilidad() == Disponibilidad.LIBRE) {
			this.sala[fila][columna].reservar();
		} else {
			throw new Error("El asiento indicado no se encuentra libre.");
		}
	}

	public int obtenerAsientosLibres() {

		int asientosLibres = 0;

		for (int i = 0; i < this.sala.length; i++) {
			for (int j = 0; j < this.sala[i].length; j++) {
				if (this.sala[i][j].obtenerDisponibilidad() == Disponibilidad.LIBRE) {
					asientosLibres++;
				}
			}
		}

		return asientosLibres;
	}

	public double obtenerPorcentajeOcupado() {
		return ((this.cantidadDeAsientos - obtenerAsientosLibres()) * 100) / this.cantidadDeAsientos;
	}

	public double obtenerRecaudacionTotal() {
		return this.recaudacionTotal;
	}

	public boolean buscarSiHayAsientosContiguos() {
		boolean hayAsientosContiguos = false;

		for (int i = 0; i < this.sala.length && !hayAsientosContiguos; i++) {
			int contarAsientosVaciosContiguos = 0;
			for (int j = 0; j < this.sala[i].length; j++) {
				if (this.sala[i][j].obtenerDisponibilidad() == Disponibilidad.LIBRE) {
					contarAsientosVaciosContiguos++;
				} else {
					contarAsientosVaciosContiguos = 0;
				}
				hayAsientosContiguos = (contarAsientosVaciosContiguos == 2);
			}
		}

		return hayAsientosContiguos;

	}

	public boolean buscarSiHayAsientosContiguos(int numeroDeAsientos) {
		boolean hayAsientosContiguos = false;

		for (int i = 0; i < this.sala.length && !hayAsientosContiguos; i++) {
			int contarAsientosVaciosContiguos = 0;
			for (int j = 0; j < this.sala[i].length; j++) {
				if (this.sala[i][j].obtenerDisponibilidad() == Disponibilidad.LIBRE) {
					contarAsientosVaciosContiguos++;
				} else {
					contarAsientosVaciosContiguos = 0;
				}
				hayAsientosContiguos = (contarAsientosVaciosContiguos == numeroDeAsientos);
			}
		}

		return hayAsientosContiguos;

	}

	private void verificarFilayColumna(int fila, int columna) {
		if (fila < 0 || columna < 0) {
			throw new Error("Numero de filas o columnas mal ingresado.");
		}
	}

}
