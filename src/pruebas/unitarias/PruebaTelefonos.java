package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia09.ejercicio04.Persona;
import clases.guia09.ejercicio04.Telefono;

public class PruebaTelefonos {

	@Test
	public void asignarTelefonosAPersonas() {
		Persona carlos = new Persona("Carlos", "Garcia");
		Persona juan = new Persona("Juan", "Perez");
		Telefono telefonoUno = new Telefono("15.5555.5555");
		Telefono telefonoDos = new Telefono("15.6666.6666");
		carlos.setTelefono(telefonoUno);
		juan.setTelefono(telefonoDos);
		// LINEA A
		telefonoUno = telefonoDos;
		telefonoUno.setNumero("15.4444.4444");
		// LINEA B
		Assert.assertEquals("15.4444.4444", juan.getTelefono().getNumero());
		Assert.assertEquals("15.5555.5555", carlos.getTelefono().getNumero());
	}
}
