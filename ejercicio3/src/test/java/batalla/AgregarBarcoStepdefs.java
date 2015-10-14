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

}