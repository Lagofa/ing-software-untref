package batalla;

public class BatallaNaval {

	private Tablero tablero;

	public void crearTablero(int filas, int columnas) {
		this.tablero = new Tablero(filas, columnas);
	}

	public String agregarBarco(Barco barco, Posicion posicion, Orientacion orientacion) {
		return this.tablero.agregarBarco(barco, posicion, orientacion);

	}

	public String disparar(int fila, int columna) {
		return this.tablero.disparar(fila, columna);
	}

}
