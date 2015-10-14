package batalla;

public class Tablero {

	private Barco[][] tablero;

	public Tablero(int filas, int columnas) {
		tablero = new Barco[filas][columnas];
		inicializarTablero(filas, columnas);
	}

	public String agregarBarco(Barco barco, Posicion posicion, Orientacion orientacion) {
		return barco.agregarBarco(this.tablero, posicion, orientacion);

	}

	public String disparar(int fila, int columna) {
		String resultado = null;
		if (tablero[fila][columna] != null) {
			resultado = this.tablero[fila][columna].disparo();
		} else {
			resultado = "Agua";
		}
		return resultado;
	}

	private void inicializarTablero(int filas, int columnas) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				this.tablero[i][j] = null;
			}
		}
	}

}
