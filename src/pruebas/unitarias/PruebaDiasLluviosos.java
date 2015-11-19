package pruebas.unitarias;

import org.junit.Assert;
import org.junit.Test;

import clases.DiasLluviosos;

public class PruebaDiasLluviosos {

	private DiasLluviosos lluviosos = new DiasLluviosos();

	@Test
	public void seCreaCorrectamenteElObjeto() {
		Assert.assertNotNull(this.lluviosos);
	}

	@Test
	public void seAñadenDiasLluviosos() {
		/* operaciones */

		this.lluviosos.registrarDiaQueLlovio(1, true);
		this.lluviosos.registrarDiaQueLlovio(2, true);
		this.lluviosos.registrarDiaQueLlovio(3, true);

		/* comprobación */
		Assert.assertEquals(3, this.lluviosos.contarDiasLluviosos());
	}

	@Test(expected = Error.class)
	public void seRegistranDiasIncorrectos() {
		/* operaciones */

		this.lluviosos.registrarDiaQueLlovio(-5, true);
		this.lluviosos.registrarDiaQueLlovio(369, true);
	}

	@Test
	public void probarPrimerDiaQueLlovioFueEl5DeEnero() {

		/* operaciones */

		this.lluviosos.registrarDiaQueLlovio(1, true);
		this.lluviosos.registrarDiaQueLlovio(2, false);
		this.lluviosos.registrarDiaQueLlovio(3, false);
		this.lluviosos.registrarDiaQueLlovio(4, false);
		this.lluviosos.registrarDiaQueLlovio(5, true);

		/* comprobación */
		Assert.assertEquals(1, this.lluviosos.consultarPrimerDiaConLluvia());
	}

	@Test
	public void verSiLlovio() {
		this.lluviosos.registrarDiaQueLlovio(50, true);

		Assert.assertEquals(true, this.lluviosos.consultarSiLlovio(50));
	}

}
