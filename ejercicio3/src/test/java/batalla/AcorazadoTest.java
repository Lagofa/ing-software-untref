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
	
	private void inicializarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = null;
			}

		}
	}

}

