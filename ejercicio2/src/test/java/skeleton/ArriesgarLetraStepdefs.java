package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class ArriesgarLetraStepdefs {	
	
	Ahorcado ahorcado;
	
	
	@Given("^la palabra secreta es \"(.*?)\"$")
	public void la_palabra_secreta_es(String palabra) throws Throwable {
	    ahorcado = new Ahorcado(palabra);
	}
	
	@Given("^la palabra secreta es \"(.*?)\" And el estado de la palabra es \"(.*?)\" And tengo (\\d+) vidas$")
	public void la_palabra_secreta_es_And_el_estado_de_la_palabra_es_And_tengo_vidas(String palabra, String estado, int vidas) throws Throwable {
	    ahorcado = new Ahorcado(palabra);
	    ahorcado.setEstadoPalabra(estado);
	    ahorcado.SetVidasJugador(vidas);
	}
	
	@When("^arriesgo una \"(.*?)\"$")
	public void arriesgo_una(String letra) throws Throwable {
		ahorcado.arrriesgarLetra(letra);
	}

	@Then("^el estado de la palabra es \"(.*?)\" And me quedan (\\d+) vidas$")
	public void el_estado_de_la_palabra_es_And_me_quedan_vidas(String estado, int vidasJugador) throws Throwable {
	    Assert.assertArrayEquals(ahorcado.getEstadoPalabra(), estado.toCharArray());
	    Assert.assertEquals(ahorcado.getVidasJugador(), vidasJugador);
	}  
	
}