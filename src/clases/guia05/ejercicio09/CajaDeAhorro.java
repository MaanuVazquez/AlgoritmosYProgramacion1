package clases.guia05.ejercicio09;

public class CajaDeAhorro {

	private String titular;
	private double saldo;

	/*
	 * post: la instancia queda asignada al titular indicado y con saldo igual a
	 * 0.
	 */
	public CajaDeAhorro(String titularDeLaCuenta) {
		this.titular = titularDeLaCuenta;
		this.saldo = 0;
	}

	/*
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	public String obtenerTitular() {
		return this.titular;
	}

	/*
	 * post: devuelve el saldo de la Caja de Ahorro.
	 */
	public double consultarSaldo() {
		return this.saldo;
	}

	/*
	 * pre : monto es un valor mayor a 0.
	 * 
	 * post: aumenta el saldo de la Caja de Ahorro seg�n el monto depositado.
	 */
	public void depositar(double monto) {
		if (monto > 0) {
			this.saldo = this.saldo + monto;
		}
	}

	/*
	 * pre : monto es un valor mayor a 0 y menor o igual que el saldo de la Caja
	 * de Ahorro.
	 * 
	 * post: disminuye el saldo de la Caja de Ahorro seg�n el monto extraido.
	 */
	public void extraer(double monto) {

		if (monto > 0 && monto <= this.saldo) {
			this.saldo = this.saldo - monto;
		}

	}
}