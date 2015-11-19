package clases.guia09.ejercicio05;

public class Jugador {

	private Juego juego;

	public Jugador(String nombreDeJugador) {
		this.juego = new Juego("Tetris", 8);
	}

	public void jugar(Juego juego) {
		this.juego = juego;
		this.juego.contabilizarJugador(this);
	}

	public Juego getJuego() {
		return this.juego;
	}
}
