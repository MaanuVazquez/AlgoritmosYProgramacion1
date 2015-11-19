package clases.guia09.ejercicio06;

public class Contacto {

	private String nombre;
	private Direccion direccion;

	public Contacto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Direccion direccion) {

		this.direccion = new Direccion(direccion.getCalle(),
				direccion.getNumero());
	}

}
