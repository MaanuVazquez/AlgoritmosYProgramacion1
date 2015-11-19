package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia09.ejercicio02.Instrumento;
import clases.guia09.ejercicio02.Musico;

public class PruebaInstrumentosMusicales {

	@Test
	public void asignarInstrumento() {
		Instrumento guitarra = new Instrumento("Guitarra eléctrica");
		Assert.assertEquals("Guitarra eléctrica", guitarra.getNombre());
		Musico juan = new Musico("Juan P.");
		Assert.assertEquals("Juan P.", juan.getNombre());
		juan.setInstrumento(guitarra);
		Assert.assertEquals(guitarra, juan.getInstrumento());
		Assert.assertEquals(juan, guitarra.getMusico());
		guitarra.setNombre("Guitarra acústica");
		Assert.assertEquals("Guitarra acústica", juan.getInstrumento()
				.getNombre());
		// #uno
		Musico lucas = new Musico("Lucas I");
		Instrumento bateria = new Instrumento("Bateria");
		Instrumento bajo = new Instrumento("Bajo");
		lucas.setInstrumento(bateria);
		Assert.assertEquals(bateria, lucas.getInstrumento());
		lucas.setInstrumento(null);
		Assert.assertEquals(bateria, lucas.getInstrumento());
		// #dos
		lucas.setInstrumento(bajo);
		Assert.assertEquals(bajo, lucas.getInstrumento());
		// #tres
	}

}
