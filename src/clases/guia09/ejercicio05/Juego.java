package clases.guia09.ejercicio05;

public class Juego {

	private String nombreDeJuego;
	private Jugador[] numeroDeJugadores;

	public Juego(String nombreDeJuego, int numeroDeJugadores) {
		this.nombreDeJuego = nombreDeJuego;
		this.numeroDeJugadores = new Jugador[numeroDeJugadores];
	}

	public String getNombre() {
		return this.nombreDeJuego;
	}

	public int getCantidadDeJugadores() {
		return this.numeroDeJugadores.length;
	}

	public int contarJugadores() {
		int jugadoresJugando = 0;

		for (int i = 0; i < this.numeroDeJugadores.length; i++) {
			if (this.numeroDeJugadores[i] != null) {
				if (this.numeroDeJugadores[i].getJuego() == this) {
					jugadoresJugando++;
				}
			}
		}

		return jugadoresJugando;
	}

	public Jugador getJugador(int numeroDeJugador) {
		return this.numeroDeJugadores[numeroDeJugador - 1];
	}

	public void contabilizarJugador(Jugador jugador) {

		boolean asignado = false;

		for (int i = 0; i < this.numeroDeJugadores.length && !asignado; i++) {
			if (this.numeroDeJugadores[i] == null) {
				this.numeroDeJugadores[i] = jugador;
				asignado = true;
			}
		}
	}
}
