package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia09.ejercicio01.Empleado;
import clases.guia09.ejercicio01.Persona;

public class PruebaEmpleado {

	@Test
	public void crearEmpleadoConPersona() {
		Persona carlos = new Persona("Carlos", "Garcia");
		Empleado cadete = new Empleado(carlos, "Cadete");
		Assert.assertEquals("Carlos", cadete.getNombre());
		Assert.assertEquals("Garcia", cadete.getApellido());
		Assert.assertEquals("Cadete", cadete.getPuesto());
		// #uno
		carlos.setApellido("Garcia del Rio");
		Assert.assertEquals("Garcia del Rio", cadete.getApellido());
		// #dos
	}
}
