package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.guia09.ejercicio07.Pasajero;
import clases.guia09.ejercicio07.Transporte;

public class PruebaTransporte {

	@Test
	public void subirEn() {
		Transporte taxi = new Transporte("JPY-234", 4);
		Assert.assertEquals("patente del taxi", "JPY-234", taxi.getPatente());
		Assert.assertEquals("capacidad del taxi", 4, taxi.getCapacidad());
		Assert.assertTrue("taxi sin pasajeros", taxi.getPasajero(1) == null);
		Transporte colectivo = new Transporte("DFW-895", 10);
		Pasajero juan = new Pasajero("Juan Diaz");
		Assert.assertEquals("nombre del pasajero", "Juan Diaz",
				juan.getNombre());
		Assert.assertTrue("juan no tiene transporte",
				juan.getTransporte() == null);
		// LINEA A
		juan.subirEn(taxi);
		Assert.assertTrue("juan subió al taxi", juan.getTransporte() == taxi);
		Assert.assertTrue("juan es el primer pasajero",
				taxi.getPasajero(1) == juan);
		Assert.assertTrue("juan es el único pasajero",
				taxi.getPasajero(2) == null);
		Pasajero laura = new Pasajero("Laura Garcia");
		laura.subirEn(colectivo);
		Pasajero marcos = new Pasajero("Marcos Perez");
		marcos.subirEn(colectivo);
		// LINEA B
		taxi.bajarA(juan);
		Assert.assertTrue("taxi sin pasajeros", taxi.getPasajero(1) == null);
		marcos.subir(taxi);
		// LINEA C

	}
}
