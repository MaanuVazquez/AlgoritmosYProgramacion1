package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia09.ejercicio06.Contacto;
import clases.guia09.ejercicio06.Direccion;

public class PruebaDirecciones {

	@Test
	public void cambiarDirecciones() {
		Direccion unaDireccion = new Direccion("Larrea", 587);
		Contacto unContacto = new Contacto("Alberto");
		Assert.assertEquals("Alberto", unContacto.getNombre());
		Assert.assertNull(unContacto.getDireccion());
		unContacto.setDireccion(unaDireccion);
		Assert.assertNotNull(unContacto.getDireccion());
		Assert.assertEquals("Larrea", unContacto.getDireccion().getCalle());
		Assert.assertEquals(587, unContacto.getDireccion().getNumero());
		unaDireccion.setCalle("Las Heras");
		Assert.assertEquals("Las Heras", unaDireccion.getCalle());
		Assert.assertEquals("Larrea", unContacto.getDireccion().getCalle());
	}
}
