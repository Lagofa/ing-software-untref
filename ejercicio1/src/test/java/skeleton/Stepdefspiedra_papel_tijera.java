package skeleton;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefspiedra_papel_tijera {
	  
	private Juego juego;
	private Jugador jugador1 = new Jugador(1);
	private Jugador jugador2 = new Jugador(2);
    
	
	
    @Given("^jugador1 juega PIEDRA$")
    public void primer_jugador_juega_PIEDRA() throws Throwable {
            
    	this.jugador1.juegaPiedra();

    }
    
    @Given("^jugador1 juega PAPEL")
    public void primer_jugador_juega_PAPEL() throws Throwable {
            
    	this.jugador1.juegaPapel();

    }
    
    @Given("^jugador1 juega TIJERA")
    public void primer_jugador_juega_TIJERA() throws Throwable {
            
    	this.jugador1.juegaTijera();

    }

    
    @When("^jugador2 juega TIJERA$")
    public void segundo_jugador_juega_TIJERA() throws Throwable {
    	
    	this.jugador2.juegaTijera();   
    	
    }
    
    @When("^jugador2 juega PAPEL")
    public void segundo_jugador_juega_PAPEL() throws Throwable {
    	
    	this.jugador2.juegaPapel();   
    	
    }
    
    @When("^jugador2 juega PIEDRA")
    public void segundo_jugador_juega_PIEDRA() throws Throwable {
    	
    	this.jugador2.juegaPiedra();   
    	
    }
    
    @Then("^empate$")
    public void empate() throws Throwable {
    	
    	this.juego = new Juego (this.jugador1, this.jugador2);
        Assert.assertEquals( "empate", this.juego.jugar () );
    
    }

    @Then("^gana jugador(\\d+)$")
    public void gana_jugador(int numeroDeJugador) throws Throwable {
    	
    	String ganador = "gana jugador"+ String.valueOf(numeroDeJugador);
    	this.juego = new Juego (this.jugador1, this.jugador2);
        Assert.assertEquals( ganador, this.juego.jugar() );
    
    }

}