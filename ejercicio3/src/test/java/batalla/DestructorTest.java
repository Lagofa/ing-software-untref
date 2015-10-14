package batalla;

import org.junit.Assert;
import org.junit.Test;

import batalla.Barco;
import batalla.Destructor;
import batalla.Horizontal;
import batalla.Posicion;
import batalla.Vertical;

public class DestructorTest {

	Barco[][] tablero = new Barco[10][10];

	@Test
	public void agregarHorizontalDestructorFueraDelTablero() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Posicion invalida",
				destructor.agregarBarco(this.tablero, new Posicion(0, 8), new Horizontal()));
	}

	@Test
	public void agregarVerticalDestructorFueraDelTablero() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Posicion invalida",
				destructor.agregarBarco(this.tablero, new Posicion(8, 9), new Vertical()));
	}

	@Test
	public void agregarDestructorBarcoEnPoscionOcupada() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		this.tablero[2][5] = destructor;
		this.tablero[3][5] = destructor;
		this.tablero[4][5] = destructor;
		Assert.assertEquals("Posicion ocupada",
				destructor.agregarBarco(this.tablero, new Posicion(4, 4), new Horizontal()));
	}

	@Test
	public void agregarVerticalDestructorEnPoscionOcupada() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		this.tablero[2][5] = destructor;
		this.tablero[3][5] = destructor;
		this.tablero[4][5] = destructor;
		Assert.assertEquals("Posicion ocupada",
				destructor.agregarBarco(this.tablero, new Posicion(4, 5), new Vertical()));
	}

	@Test
	public void agregarDestructorHorizontalConExito() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Barco agregado",
				destructor.agregarBarco(this.tablero, new Posicion(1, 7), new Horizontal()));
	}

	@Test
	public void agregarDestructorVerticalConExito() {
		inicializarTablero();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Barco agregado",
				destructor.agregarBarco(this.tablero, new Posicion(7, 5), new Vertical()));
	}

	private void inicializarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				this.tablero[i][j] = null;
			}
		}
	}

}
