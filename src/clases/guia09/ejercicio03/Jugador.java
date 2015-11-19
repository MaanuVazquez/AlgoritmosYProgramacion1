package clases.guia09.ejercicio03;

public class Jugador {

	private Juego juego;

	public Jugador(String nombreDeJugador) {
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public String getNombreJuego() {
		return this.juego.getNombre();
	}
}
