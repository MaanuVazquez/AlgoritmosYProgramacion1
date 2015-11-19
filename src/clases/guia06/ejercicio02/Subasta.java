package clases.guia06.ejercicio02;

public class Subasta {

	private String articulo;
	private float precioBase;
	private float ofertaMaximaActual;
	private boolean subastaTerminada;

	/**
	 * post: crea una Subasta para el artículo indicado y con el precioBase
	 * indicado.
	 */
	public Subasta(String articulo, float precioBase) {

		this.articulo = "Café Cortado";
		this.precioBase = 10;

		/* Validamos si el nombre del articulo no son solo espacios */
		if (articulo.trim().length() > 0) {
			this.articulo = articulo;
		}

		/* Validamos si el precioBase no es negativo ni 0 */
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		this.ofertaMaximaActual = this.precioBase;
		this.subastaTerminada = false;

	}

	/**
	 * post: devuelve el artículo que se subasta.
	 */
	public String obtenerArticulo() {

		return this.articulo;

	}

	/**
	 * post: realiza una oferta por el artículo. Si la oferta es mayor al
	 * precioBase y a la ofertaGanarador, esta pasa a ser la nueva
	 * ofertaGanadora.
	 */
	public void ofertar(float oferta) {

		/* Solo podemos ofertar si la subasta no está terminada */
		if (!this.subastaTerminada) {

			/*
			 * Si la oferta es mayor al precio base y a la ofertaMaximaActual,
			 * esta se vuelve la nueva ofertaMaximaActual
			 */
			if (oferta > this.precioBase && oferta > this.ofertaMaximaActual) {
				this.ofertaMaximaActual = oferta;
			}

		}

	}

	/**
	 * post: devuelve la máxima oferta realizada sobre la Subasta.
	 */
	public float obtenerOfertaGanadora() {

		return this.ofertaMaximaActual;

	}

	/**
	 * post: cierra la Subasta, cualquier oferta realizada con posterioridad es
	 * ignorada.
	 */
	public void cerrar() {
		this.subastaTerminada = true;
	}
}