package clases.guia05.ejercicio05;

public class TarjetaBaja {

	private double saldoTarjeta;
	private int viajesEnColectivo;
	private int viajes;

	/*
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {

		this.saldoTarjeta = 0;

		cargar(saldoInicial);

	}

	public double obtenerSaldo() {
		return this.saldoTarjeta;
	}

	/*
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {

		if (monto <= 0) {
			throw new Error("Monto ingresado invalido");
		}

		this.saldoTarjeta += monto;

	}

	/*
	 * pre : saldo suficiente. post: utiliza 1.25 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {

		if (this.saldoTarjeta < 1.25) {
			throw new Error("Saldo insuficiente para realizar el viaje.");
		}

		this.saldoTarjeta = this.saldoTarjeta - 1.25;
		this.viajesEnColectivo++;
		this.viajes++;
	}

	/*
	 * pre : saldo suficiente. post: utiliza 2.50 del saldo para un viaje en
	 * subte.
	 */
	public void pagarViajeEnSubte() {
		if (this.saldoTarjeta < 2.50) {
			throw new Error("Saldo insuficiente para realizar el viaje.");
		}

		this.saldoTarjeta = this.saldoTarjeta - 2.50;
		this.viajes++;
	}

	/*
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.viajes;
	}

	/*
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return this.viajesEnColectivo;
	}

	/*
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return (this.viajes - this.viajesEnColectivo);
	}
}