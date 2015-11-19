package clases;

public class Asiento {

	private double precio;

	private Disponibilidad disponibilidad;

	/**
	 * pre : precio es positivo. post: el asiento queda libre y con el precio
	 * indicado.
	 */

	public Asiento(double precio) {

		this.cambiarPrecio(precio);
		this.disponibilidad = Disponibilidad.LIBRE;
	}

	/**
	 * post: devuelve el precio del asiento
	 */

	public double obtenerPrecio() {
		return this.precio;
	}

	/**
	 * pre : precio debe ser mayor a 0. post: cambia el precio del asiento.
	 */

	public void cambiarPrecio(double precio) {

		if (precio <= 0) {

			throw new Error("Precio debe ser mayor a cero");
		}
		this.precio = precio;
	}

	public void reservar() {

		if (this.disponibilidad != Disponibilidad.LIBRE) {

			throw new Error("Asiento no LIBRE");
		}
		this.disponibilidad = Disponibilidad.RESERVADO;
	}

	public void vender() {

		if (this.disponibilidad == Disponibilidad.VENDIDO) {

			throw new Error("Asiento ya VENDIDO");
		}
		this.disponibilidad = Disponibilidad.VENDIDO;
	}

	public void cancelarReserva() {

		if (this.disponibilidad != Disponibilidad.RESERVADO) {

			throw new Error("Asiendo no RESERVADO");
		}

		this.disponibilidad = Disponibilidad.LIBRE;
	}

	public Disponibilidad obtenerDisponibilidad() {

		return this.disponibilidad;
	}
}
