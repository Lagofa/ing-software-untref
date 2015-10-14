package batalla;

import org.junit.Assert;
import org.junit.Test;

import batalla.Acorazado;
import batalla.Destructor;
import batalla.Horizontal;
import batalla.Lancha;
import batalla.Posicion;
import batalla.Tablero;

public class TableroTest {
	Tablero tablero;

	@Test
	public void agregarLanchaATablero() {
		tablero = new Tablero(10, 10);
		Lancha lancha = new Lancha();
		Assert.assertEquals("Barco agregado", this.tablero.agregarBarco(lancha, new Posicion(3, 9), new Horizontal()));
	}

	@Test
	public void agregarLanchaYAcorazadoATablero() {
		tablero = new Tablero(10, 10);
		Lancha lancha = new Lancha();
		Acorazado acorazado = new Acorazado();
		Assert.assertEquals("Barco agregado",
				this.tablero.agregarBarco(acorazado, new Posicion(3, 6), new Horizontal()));
		Assert.assertEquals("Posicion invalida",
				this.tablero.agregarBarco(lancha, new Posicion(3, 10), new Horizontal()));
	}

	@Test
	public void agregarLanchaAcorazadoYDestructorATablero() {
		tablero = new Tablero(10, 10);
		Lancha lancha = new Lancha();
		Acorazado acorazado = new Acorazado();
		Destructor destructor = new Destructor();
		Assert.assertEquals("Barco agregado",
				this.tablero.agregarBarco(acorazado, new Posicion(3, 6), new Horizontal()));
		Assert.assertEquals("Posicion invalida",
				this.tablero.agregarBarco(lancha, new Posicion(3, 10), new Horizontal()));
		Assert.assertEquals("Posicion ocupada",
				this.tablero.agregarBarco(destructor, new Posicion(3, 4), new Horizontal()));
	}

}
