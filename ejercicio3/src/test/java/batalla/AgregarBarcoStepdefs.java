package batalla;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class AgregarBarcoStepdefs {

	BatallaNaval batalla = new BatallaNaval();
	String resultado;

	@Given("^tengo un tablero de (\\d+) x (\\d+)$")
	public void tengo_un_tablero_de_x(int filas, int columnas) throws Throwable {
		this.batalla.crearTablero(filas, columnas);
	}

	@When("^se agrega un acorazado en posicion (\\d+) (\\d+) de forma HORIZONTAL$")
	public void se_agrega_un_acorazado_en_posicion_de_forma_HORIZONTAL(int fila, int columna) throws Throwable {
		resultado = this.batalla.agregarBarco(new Acorazado(), new Posicion(fila, columna), new Horizontal());
	}

	@Then("^se obtiene \"(.*?)\"$")
	public void se_obtiene(String respuesta) throws Throwable {
		Assert.assertEquals(resultado, respuesta);
	}

	@Given("^tengo un tablero de (\\d+) x (\\d+) And se tiene una lancha en la posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void tengo_un_tablero_de_x_And_se_tiene_una_lancha_en_la_posicion_HORIZONTALMENTE(int filas, int columnas,
			int fila, int columna) throws Throwable {
		this.batalla.crearTablero(filas, columnas);
		this.batalla.agregarBarco(new Lancha(), new Posicion(fila, columna), new Horizontal());
	}

	@When("^se agrega un destructor en posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void se_agrega_un_destructor_en_posicion_HORIZONTALMENTE(int fila, int columna) throws Throwable {
		resultado = this.batalla.agregarBarco(new Destructor(), new Posicion(fila, columna), new Horizontal());
	}

}