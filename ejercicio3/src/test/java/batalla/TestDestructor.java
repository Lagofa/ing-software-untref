package batalla;

import org.junit.Assert;
import org.junit.Test;

import batalla.Barco;
import batalla.Destructor;
import batalla.Horizontal;
import batalla.Posicion;
import batalla.Vertical;

public class TestDestructor {

	Barco[][] tablero = new Barco[10][10];

	@Test
	public void agregarHorizontalDestructorFueraDelTablero() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Posicion invalida",
				destructor.agregarBarco(tablero, new Posicion(0, 8), new Horizontal()));
	}

	@Test
	public void agregarVerticalDestructorFueraDelTablero() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Posicion invalida", destructor.agregarBarco(tablero, new Posicion(8, 9), new Vertical()));
	}

	private void inicializarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = null;
			}
		}
	}

}
