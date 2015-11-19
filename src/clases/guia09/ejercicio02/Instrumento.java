package clases.guia09.ejercicio02;

public class Instrumento {

	private String nombreInstrumento;
	private Musico musico;

	public Instrumento(String instrumento) {
		this.nombreInstrumento = instrumento;
	}

	public String getNombre() {
		return this.nombreInstrumento;
	}

	public void setNombre(String nombre) {
		this.nombreInstrumento = nombre;
	}

	public Musico getMusico() {
		return this.musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}
}
