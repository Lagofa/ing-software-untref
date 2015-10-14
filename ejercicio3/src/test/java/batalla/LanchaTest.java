package batalla;

import org.junit.Assert;
import org.junit.Test;

public class LanchaTest {

	Barco[][] tablero = new Barco[10][10];

	@Test
	public void agragarLanchaFueraDelTablero() {
		inicializarTablero();
		Lancha lancha = new Lancha();
		Assert.assertEquals("Posicion invalida", lancha.agregarBarco(tablero, new Posicion(5, 10), new Vertical()));
	}

	private void inicializarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = null;
			}

		}
	}

}
