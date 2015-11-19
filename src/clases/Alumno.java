package clases;

public class Alumno {

	private int legajo;
	private double primerNota;
	private double segundaNota;
	private boolean entregoTP;

	public Alumno(int legajo, double primerNota, double segundaNota,
			boolean entregoTP) {

		this.legajo = legajo;

		cambiarPrimerNota(primerNota);

		cambiarSegundaNota(segundaNota);

		contabilizarTrabajoPractico(entregoTP);

	}

	public int obtenerLegajo() {
		return this.legajo;
	}

	public double obtenerPrimerNota() {
		return this.primerNota;
	}

	public double obtenerSegundaNota() {
		return this.segundaNota;
	}

	public boolean obtenerEntregoTP() {
		return this.entregoTP;
	}

	public double obtenerNotaPromedio() {
		return (this.primerNota + this.segundaNota) / 2;
	}

	public void cambiarPrimerNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.primerNota = nota;
		} else {
			throw new Error(
					"La nota ingresada no se encuentra en el rango permitido [0-10]");
		}
	}

	public void cambiarSegundaNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.segundaNota = nota;
		} else {
			throw new Error(
					"La nota ingresada no se encuentra en el rango permitido [0-10]");
		}
	}

	public void contabilizarTrabajoPractico(boolean entregoTP) {
		this.entregoTP = entregoTP;
	}

}
