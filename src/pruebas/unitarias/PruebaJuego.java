package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;
import clases.guia09.ejercicio05.Juego;
import clases.guia09.ejercicio05.Jugador;

public class PruebaJuego {

	@Test
	public void jugar() {
		Juego ajedrez = new Juego("Ajedrez", 2);
		Assert.assertEquals("juego", "Ajedrez", ajedrez.getNombre());
		Assert.assertEquals("jugadores máximos", 2,
				ajedrez.getCantidadDeJugadores());
		// LINEA A
		Jugador marcelo = new Jugador("Marcelo Gomez");
		Jugador santiago = new Jugador("Santiago Roca");
		marcelo.jugar(ajedrez);
		Assert.assertEquals("un jugador de ajedrez", 1,
				ajedrez.contarJugadores());
		santiago.jugar(ajedrez);
		Assert.assertEquals("dos jugadores de ajedrez", 2,
				ajedrez.contarJugadores());
		Assert.assertTrue("Marcelo juega Ajedrez",
				marcelo.getJuego() == ajedrez);
		Assert.assertTrue("Santiago juega Ajedrez",
				santiago.getJuego() == ajedrez);
		Assert.assertTrue("Jugador 1 es Marcelo",
				ajedrez.getJugador(1) == marcelo);
		Assert.assertTrue("Jugador 2 es Santiago",
				ajedrez.getJugador(2) == santiago);
		// LINEA B
		Juego solitario = new Juego("Solitario", 1);
		santiago.jugar(solitario);
		Assert.assertTrue("Santiago juega Solitario",
				santiago.getJuego() == solitario);
		Assert.assertEquals("queda uno jugando ajedrez", 1,
				ajedrez.contarJugadores());
		// LINEA C

	}
}
