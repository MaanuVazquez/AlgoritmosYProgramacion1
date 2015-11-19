package clases.guia09.ejercicio01;

public class Empleado {

	private Persona empleado;
	private String puesto;

	public Empleado(Persona persona, String puesto) {
		this.empleado = persona;
		this.puesto = puesto;
	}

	public String getNombre() {
		return this.empleado.getNombre();
	}

	public String getApellido() {
		return this.empleado.getApellido();
	}

	public String getPuesto() {
		return this.puesto;
	}
}
