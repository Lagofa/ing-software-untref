package truco;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsEnvido {
	
	private Truco truco = new Truco();
	private Carta cartaUno;
	private Carta cartaDos;
	private Carta cartaTres;
	private int envido;
	
	@Given("^el jugador tiene (\\d+) de copa, (\\d+) de espada y (\\d+) de oro$")
	public void el_jugador_tiene_de_copa_de_espada_y_de_oro(int arg1, int arg2, int arg3) throws Throwable {
	    cartaUno = new Carta(arg1, Palo.COPA);
	    cartaDos = new Carta(arg2, Palo.ESPADA);
	    cartaTres = new Carta(arg3, Palo.ORO);
	}

	@When("^se calcula el envido$")
	public void se_calcula_el_envido() throws Throwable {
	 envido = truco.obtenerEnvidoDe(cartaUno, cartaDos, cartaTres); 
	}

	@Then("^el envido es (\\d+)$")
	public void el_envido_es(int arg1) throws Throwable {
	   Assert.assertEquals(arg1, envido);
	}

	@Given("^el jugador tiene  (\\d+) de oro, (\\d+) de oro y (\\d+) de copa$")
	public void el_jugador_tiene_de_oro_de_oro_y_de_copa(int arg1, int arg2, int arg3) throws Throwable {
		cartaUno = new Carta(arg1, Palo.ORO);
	    cartaDos = new Carta(arg2, Palo.ORO);
	    cartaTres = new Carta(arg3, Palo.COPA);	
	    }

	@Given("^el jugador tiene (\\d+) de oro, (\\d+) de oro y (\\d+) de oro$")
	public void el_jugador_tiene_de_oro_de_oro_y_de_oro(int arg1, int arg2, int arg3) throws Throwable {
		cartaUno = new Carta(arg1, Palo.ORO);
	    cartaDos = new Carta(arg2, Palo.ORO);
	    cartaTres = new Carta(arg3, Palo.ORO);
	}

	@Given("^el jugador tiene (\\d+) de oro, (\\d+) de oro y (\\d+) de espada$")
	public void el_jugador_tiene_de_oro_de_oro_y_de_espada(int arg1, int arg2, int arg3) throws Throwable {
		cartaUno = new Carta(arg1, Palo.ORO);
	    cartaDos = new Carta(arg2, Palo.ORO);
	    cartaTres = new Carta(arg3, Palo.ESPADA);
	}
	
	@Given("^el jugador tiene (\\d+) de copa, (\\d+) de oro y (\\d+) de oro$")
	public void el_jugador_tiene_de_copa_de_oro_y_de_oro(int arg1, int arg2, int arg3) throws Throwable {
		cartaUno = new Carta(arg1, Palo.COPA);
	    cartaDos = new Carta(arg2, Palo.ORO);
	    cartaTres = new Carta(arg3, Palo.ORO);
	}

}