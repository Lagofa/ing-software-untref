package batalla;

import org.junit.Assert;
import org.junit.Test;

import batalla.Barco;
import batalla.Posicion;
import batalla.Vertical;

public class LanchaTest {

	Barco[][] tablero = new Barco[10][10];

	@Test
	public void agregarLanchaFueraDelTablero() {
		inicializarTablero();
		Lancha lancha = new Lancha();
		Assert.assertEquals("Posicion invalida", lancha.agregarBarco(this.tablero, new Posicion(5, 10), new Vertical()));
	}
	
	@Test
	public void agregarLanchaEnPoscionOcupada() {
		inicializarTablero();
		Lancha lancha = new Lancha();
		this.tablero[1][5]=lancha;
		Assert.assertEquals("Posicion ocupada", lancha.agregarBarco(this.tablero,new Posicion(1, 5), new Vertical()));
	}
	
	@Test
	public void agregarLanchaConExito() {
		inicializarTablero();
		Lancha lancha = new Lancha();
		Assert.assertEquals("Barco agregado", lancha.agregarBarco(this.tablero, new Posicion(1, 5), new Vertical()));
	}
	
	@Test
	public void lanchaHundida() {
		Lancha lancha = new Lancha();
		Assert.assertEquals("Hundido", lancha.disparo());
	}
	
	private void inicializarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				this.tablero[i][j] = null;
			}

		}
	}

}
