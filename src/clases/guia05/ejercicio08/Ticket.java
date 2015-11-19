package clases.guia05.ejercicio08;

public class Ticket {

	private double importe;
	private int productos;
	private boolean ticketCerrado;
	private boolean descuentoAplicado;

	/*
	 * post: el Ticket se inicializa con importe 0.
	 */

	public Ticket() {
		this.productos = 0;
		this.importe = 0;
		this.ticketCerrado = false;
		this.descuentoAplicado = false;
	}

	/*
	 * pre : cantidad y precio son mayores a cero. El ticket está abierto.
	 * 
	 * post: suma al Ticket un item a partir de la cantidad de de productos y su
	 * precio unitario.
	 */
	public void agregarItem(int cantidad, double precioUnitario) {
		if (!this.ticketCerrado && cantidad > 0 && precioUnitario > 0) {
			this.importe = this.importe + (cantidad * precioUnitario);
			this.productos = this.productos + cantidad;
		}
	}

	/*
	 * pre : el Ticket está abierto y no se ha aplicado un descuento
	 * previamente. post: aplica un descuento sobre el total del importe.
	 */
	public void aplicarDescuento(double porcentaje) {
		if (!this.ticketCerrado && !this.descuentoAplicado && porcentaje > 0) {
			this.importe = (porcentaje * this.importe) / 100;
			this.descuentoAplicado = true;
		}
	}

	/*
	 * post: devuelve el importe acumulado hasta el momento sin cerrar el
	 * Ticket.
	 */
	public double calcularSubTotal() {
		return this.importe;
	}

	/*
	 * post: cierra el Ticket y devuelve el importe total.
	 */
	public double calcularTotal() {
		this.ticketCerrado = true;
		return this.importe;
	}

	/*
	 * post: devuelve la cantidad total de productos.
	 */
	public int contarProductos() {
		return this.productos;
	}
}