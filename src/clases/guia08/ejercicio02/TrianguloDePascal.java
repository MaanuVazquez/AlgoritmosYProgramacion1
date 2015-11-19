package clases.guia08.ejercicio02;

public class TrianguloDePascal {

	private int[][] triangulo;

	public TrianguloDePascal(int numeroDeFilas) {
		triangulo = new int[numeroDeFilas][];

		for (int i = 0; i < triangulo.length; i++) {
			triangulo[i] = new int[i + 1];
		}

		for (int i = 0; i < triangulo.length; i++) {
			triangulo[i][0] = 1;
			triangulo[i][triangulo[i].length - 1] = 1;
		}

		for (int i = 1; i < triangulo.length - 1; i++) {
			for (int j = 0; j < triangulo[i].length - 1; j++) {
				triangulo[i + 1][j + 1] = triangulo[i][j] + triangulo[i][j + 1];
			}
		}

	}
	
	public int getAltura() {
		return triangulo.length;
	}
	
	public int getCoeficiente(int fila, int columna) {
		return triangulo[fila-1][columna-1];
	}
}
