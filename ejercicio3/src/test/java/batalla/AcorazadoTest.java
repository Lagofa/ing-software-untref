package batalla;

import org.junit.Assert;
import org.junit.Test;

import batalla.Acorazado;
import batalla.Barco;
import batalla.Horizontal;
import batalla.Posicion;
import batalla.Vertical;

public class AcorazadoTest {

	Barco[][] tablero = new Barco[10][10];

	@Test
	public void agregarHorizontalAcorazadoFueraDelTablero() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Posicion invalida", acorazado.agregarBarco(tablero, new Posicion(0, 9), new Horizontal()));
	}

	@Test
	public void agregarVerticalAcorazadoFueraDelTablero() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Posicion invalida", acorazado.agregarBarco(tablero, new Posicion(9, 9), new Vertical()));
	}
	
	@Test
	public void agregarHorizontalAcorazadoEnPoscionOcupada() {
		inicializarTablero();
		Acorazado acorazado1 = new Acorazado();
		this.tablero[2][5]=acorazado1;
		this.tablero[3][5]=acorazado1;
		Acorazado acorazado2 = new Acorazado();
		Assert.assertEquals("Posicion ocupada",
				acorazado2.agregarBarco(tablero, new Posicion(3, 4), new Horizontal()));
	}

	@Test
	public void agregarVerticalAcorazadoEnPoscionOcupada() {
		inicializarTablero();
		Acorazado acorazado1 = new Acorazado();
		this.tablero[2][5]=acorazado1;
		this.tablero[3][5]=acorazado1;
		Acorazado acorazado2 = new Acorazado();
		Assert.assertEquals("Posicion ocupada", acorazado2.agregarBarco(tablero, new Posicion(3, 5), new Vertical()));
	}


	private void inicializarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				this.tablero[i][j] = null;
			}

		}
	}

}
