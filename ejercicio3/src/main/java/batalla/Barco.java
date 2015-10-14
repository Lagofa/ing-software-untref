package batalla;

public abstract class Barco {

	protected int largo;
	protected int disparosRestantes;

	public Barco(int largo, int disparosRestantes) {
		this.largo = largo;
		this.disparosRestantes = disparosRestantes;
	}

	public String agregarBarco(Barco[][] tablero, Posicion posicion, Orientacion orientacion) {
		String resultado = null;
		if (this.barcoFueraDelTablero(tablero, posicion, orientacion)) {
			resultado = "Posicion invalida";
		} else if (this.espaciolibreParaBarco(tablero, posicion, orientacion)) {
			resultado = "Posicion ocupada";
		} else {
			resultado = "Barco agregado";
			this.agregarATablero(tablero, posicion, orientacion);
		}
		return resultado;
	}

	protected Boolean posicionEnTablero(Barco[][] tablero, Posicion posicion) {
		int filas = tablero.length - 1;
		int columnas = tablero[0].length - 1;
		return posicion.getPosicionX() > filas || posicion.getPosicionY() > columnas;
	}

	protected Boolean posicionOcupada(Barco[][] tablero, Posicion posicion) {
		return tablero[posicion.getPosicionX()][posicion.getPosicionY()] != null;
	}

	private Boolean espaciolibreParaBarco(Barco[][] tablero, Posicion posicion, Orientacion orientacion) {
		Boolean ocupado = false;
		int contador = 0;
		while (!ocupado && contador < this.largo) {
			if (posicionOcupada(tablero, posicion)) {
				ocupado = true;
			}
			contador++;
			posicion = orientacion.contiguo(posicion);
		}
		return ocupado;
	}

	private void agregarATablero(Barco[][] tablero, Posicion posicion, Orientacion orientacion) {
		int contador = 0;
		while (contador < this.largo) {
			tablero[posicion.getPosicionX()][posicion.getPosicionY()] = this;
			contador++;
			posicion = orientacion.contiguo(posicion);
		}
	}

	private Boolean barcoFueraDelTablero(Barco[][] tablero, Posicion posicion, Orientacion orientacion) {
		boolean fuera = false;
		int contador = 0;
		while (!fuera && contador < this.largo) {
			fuera = posicionEnTablero(tablero, posicion);
			contador++;
			posicion = orientacion.contiguo(posicion);
		}
		return fuera;
	}

	public String disparo() {
		String resultado = null;
		this.disparosRestantes--;
		if (this.disparosRestantes == 0) {
			resultado = "Hundido";
		} else {
			resultado = "Tocado";
		}
		return resultado;
	}

}
