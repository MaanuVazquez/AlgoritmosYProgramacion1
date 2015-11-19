package clases.guia05.ejercicio12;

public class Tragamonedas {

	private Tambor primero;
	private Tambor segundo;
	private Tambor tercero;

	/*
	 * post: los 3 Tambores del Tragamonedas están en la posición 1.
	 */

	public Tragamonedas() {
		this.primero = new Tambor(1);
		this.segundo = new Tambor(1);
		this.tercero = new Tambor(1);
	}

	/*
	 * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
	 */

	public void activar() {
		this.primero.girar();
		this.segundo.girar();
		this.tercero.girar();
	}

	/*
	 * post: indica si el Tragamonedas entrega un premio a partir de la posición
	 * de sus 3 Tambores.
	 */

	public boolean entregaPremio() {
		boolean entregaPremio = false;

		if (primero.obtenerPosicion() == segundo.obtenerPosicion()
				&& primero.obtenerPosicion() == tercero.obtenerPosicion()) {
			entregaPremio = true;
		}
		return entregaPremio;
	}

	public void cheat() {
		while (!(primero.obtenerPosicion() == segundo.obtenerPosicion() && primero
				.obtenerPosicion() == tercero.obtenerPosicion())) {

			activar();

			System.out.println("Primer Tambor:"
					+ this.primero.obtenerPosicion() + "\n" + "Segundo Tambor:"
					+ this.segundo.obtenerPosicion() + "\n" + "Tercer Tambor:"
					+ this.tercero.obtenerPosicion());

		}
	}
}