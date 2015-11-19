package clases;

public class Curso {

	private Alumno[] cursada;

	public Curso() {
		this.cursada = new Alumno[20];

		for (int i = 0; i < this.cursada.length; i++) {
			this.cursada[i] = new Alumno(i + 1, 0, 0, false);
		}

	}

	public Curso(int[] legajos) {
		this.cursada = new Alumno[legajos.length];

		for (int i = 0; i < this.cursada.length; i++) {
			this.cursada[i] = new Alumno(legajos[i], 0, 0, false);
		}
	}

	public void calificarAlumno(int legajo, double primerNota,
			double segundaNota, boolean TP) {
		this.cursada[obtenerNumeroAlumno(legajo)].cambiarPrimerNota(primerNota);
		this.cursada[obtenerNumeroAlumno(legajo)]
				.cambiarSegundaNota(segundaNota);
		this.cursada[obtenerNumeroAlumno(legajo)]
				.contabilizarTrabajoPractico(TP);
	}

	public double obtenerNotaMasAlta() {
		double notaMasAlta = this.cursada[0].obtenerNotaPromedio();

		for (int i = 1; i < this.cursada.length; i++) {
			if (this.cursada[i].obtenerNotaPromedio() > notaMasAlta) {
				notaMasAlta = this.cursada[i].obtenerNotaPromedio();
			}
		}

		return notaMasAlta;
	}

	public double obtenerNotaMasBaja() {
		double notaMasBaja = this.cursada[0].obtenerNotaPromedio();

		for (int i = 1; i < this.cursada.length; i++) {
			if (this.cursada[i].obtenerPrimerNota() < notaMasBaja) {
				notaMasBaja = this.cursada[i].obtenerPrimerNota();
			}
		}

		return notaMasBaja;
	}

	public int obtenerNumeroAlumno(int legajo) {
		int numeroAlumno = 0;
		boolean alumnoEncontrado = false;

		for (int i = 0; i < this.cursada.length; i++) {
			if (this.cursada[i].obtenerLegajo() == legajo) {
				numeroAlumno = i;
				alumnoEncontrado = true;
			}
		}

		if (!alumnoEncontrado) {
			throw new Error("Legajo erroneo, alumno no encontrado.");
		}

		return numeroAlumno;
	}

}
