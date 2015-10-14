package batalla;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DispararStepdefs {

	BatallaNaval batalla = new BatallaNaval();
	String resultado;

	@Given("^tengo un tablero de (\\d+) x (\\d+) And un acorazado en la posicion (\\d+) (\\d+) VERTICALMENTE$")
	public void tengo_un_tablero_de_x_And_un_acorazado_en_la_posicion_VERTICALMENTE(int filas, int columnas, int fila,
			int columna) throws Throwable {
		this.batalla.crearTablero(filas, columnas);
		this.batalla.agregarBarco(new Acorazado(), new Posicion(fila, columna), new Vertical());
	}

	@When("^disparo a la posicion (\\d+) (\\d+)$")
	public void disparo_a_la_posicion(int fila, int columna) throws Throwable {
		resultado = this.batalla.disparar(fila, columna);
	}

	@Then("^el resultado de disparar fue \"(.*?)\"$")
	public void el_resultado_de_disparar_fue(String respuesta) throws Throwable {
		Assert.assertEquals(resultado, respuesta);
	}

}
