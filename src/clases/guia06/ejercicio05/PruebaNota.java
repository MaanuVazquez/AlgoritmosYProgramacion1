package clases.guia06.ejercicio05;

import org.junit.Assert;
import org.junit.Test;

import clases.guia05.ejercicio01.Nota;

public class PruebaNota {
	private Nota nota;
	private int obtenerNota;

	@Test
	public void pruebaInicialNota() {
		/* condición inicial */
		this.nota = new Nota(5);

		/* operaciones */
		this.obtenerNota = nota.obtenerValor();

		/* comprobacion */
		Assert.assertEquals(5, obtenerNota);

	}

	@Test
	public void pruebaNotaNegativa() {
		/* condición inicial */
		this.nota = new Nota(-8);

		/* operaciones */
		this.obtenerNota = nota.obtenerValor();

		/* comprobacion */
		Assert.assertEquals(7, obtenerNota); // 7 Es la nota por defecto.
	}

	@Test
	public void pruebaNotaMayorA10() {
		/* condición inicial */
		this.nota = new Nota(11);

		/* operaciones */
		this.obtenerNota = nota.obtenerValor();

		/* comprobacion */
		Assert.assertEquals(7, obtenerNota); // 7 Es la nota por defecto.
	}

	@Test
	public void pruebaNotaAprobocon6() {
		/* condición inicial */
		this.nota = new Nota(6);

		/* operaciones */
		boolean aprobo = nota.aprobado();

		/* comprobacion */
		Assert.assertEquals(false, aprobo);
	}

	@Test
	public void pruebaNotaAprobocon7() {
		/* condición inicial */
		this.nota = new Nota(7);

		/* operaciones */
		boolean aprobo = nota.aprobado();

		/* comprobacion */
		Assert.assertEquals(true, aprobo);
	}

	@Test
	public void pruebaNotaDesaproboCon6() {
		/* condición inicial */
		this.nota = new Nota(6);

		/* operaciones */
		boolean desaprobo = nota.desaprobado();

		/* comprobacion */
		Assert.assertEquals(true, desaprobo);
	}

	@Test
	public void pruebaNotaDesaproboCon7() {
		/* condición inicial */
		this.nota = new Nota(7);

		/* operaciones */
		boolean desaprobo = nota.desaprobado();

		/* comprobacion */
		Assert.assertEquals(false, desaprobo);
	}

	@Test
	public void pruebaNotaRecuperatorioMenorQueNotaActual() {
		/* condición inicial */
		this.nota = new Nota(5);

		/* operaciones */
		nota.recuperar(4);
		this.obtenerNota = nota.obtenerValor();

		/* comprobación */
		Assert.assertEquals(5, this.obtenerNota);
	}

	@Test
	public void pruebaNotaRecuperatorioMayorQue10() {
		/* condición inicial */
		this.nota = new Nota(5);

		/* operaciones */
		nota.recuperar(12);
		this.obtenerNota = nota.obtenerValor();

		/* comprobación */
		Assert.assertEquals(5, this.obtenerNota);
	}

}
