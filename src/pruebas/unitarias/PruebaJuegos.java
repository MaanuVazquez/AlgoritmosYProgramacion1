package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;
import clases.guia09.ejercicio03.Juego;
import clases.guia09.ejercicio03.Jugador;

public class PruebaJuegos {

	@Test
	public void jugar() {
		Juego primerJuego = new Juego("Vurako");
		Jugador unJugador = new Jugador("Valentina");
		Jugador otroJugador = new Jugador("Gonzalo");
		Assert.assertEquals("nombre", "Vurako", primerJuego.getNombre());
		unJugador.setJuego(primerJuego);
		otroJugador.setJuego(primerJuego);
		Assert.assertEquals("juego", "Vurako", unJugador.getNombreJuego());
		primerJuego.setNombre("Burako");
		Assert.assertEquals("juego", "Burako", otroJugador.getNombreJuego());
		// LINEA A
		Juego segundoJuego = new Juego("Enredados");
		Assert.assertEquals("juego", "Enredados", segundoJuego.getNombre());
		segundoJuego = primerJuego;
		otroJugador.setJuego(segundoJuego);
		Assert.assertEquals("juego", "Burako", otroJugador.getNombreJuego());
		// LINEA B
	}

}
