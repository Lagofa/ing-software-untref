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
		Assert.assertEquals("Posicion invalida",
				acorazado.agregarBarco(this.tablero, new Posicion(0, 9), new Horizontal()));
	}

	@Test
	public void agregarVerticalAcorazadoFueraDelTablero() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Posicion invalida",
				acorazado.agregarBarco(this.tablero, new Posicion(9, 9), new Vertical()));
	}

	@Test
	public void agregarHorizontalAcorazadoEnPoscionOcupada() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		this.tablero[2][5] = acorazado;
		this.tablero[3][5] = acorazado;
		Assert.assertEquals("Posicion ocupada",
				acorazado.agregarBarco(this.tablero, new Posicion(3, 4), new Horizontal()));
	}

	@Test
	public void agregarVerticalAcorazadoEnPoscionOcupada() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		this.tablero[2][5] = acorazado;
		this.tablero[3][5] = acorazado;
		Assert.assertEquals("Posicion ocupada",
				acorazado.agregarBarco(this.tablero, new Posicion(3, 5), new Vertical()));
	}

	@Test
	public void agregarAcorazadoHorizontalConExito() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Barco agregado",
				acorazado.agregarBarco(this.tablero, new Posicion(1, 5), new Horizontal()));
	}

	@Test
	public void agregarAcorazadoVerticalConExito() {
		inicializarTablero();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Barco agregado", acorazado.agregarBarco(this.tablero, new Posicion(1, 5), new Vertical()));
	}

	@Test
	public void acorazadoTocado() {
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Tocado", acorazado.disparo());
	}

	@Test
	public void acorazadoHundido() {
		Acorazado acorazado = new Acorazado();
		acorazado.disparo();
		Assert.assertEquals("Hundido", acorazado.disparo());
	}

	private void inicializarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				this.tablero[i][j] = null;
			}

		}
	}

}
