package clases.guia09.ejercicio02;

public class Musico {

	private String nombre;
	private Instrumento instrumento;

	public Musico(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setInstrumento(Instrumento instrumento) {
		if (instrumento != null) {

			this.instrumento = instrumento;
			this.instrumento.setMusico(this);
		}
	}

	public Instrumento getInstrumento() {
		return this.instrumento;
	}
}
