package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import cucumber.api.java.en.Then;

public class StepdefsEjercicio1 {
	  
	private String seleccionA;
	private String seleccionB;
	private Juego juego = new Juego();
	private Jugador jugador1 = new Jugador();
	private Jugador jugador2 =  new Jugador();
	
	
    @Given("^jugador(\\d+) juega PIEDRA$")
    public void primer_jugador_juega_PIEDRA(int numeroDeJugador) throws Throwable {
    	
    	    this.jugador1.setNumeroJugador(numeroDeJugador);  
        	this.seleccionA = this.jugador1.juegaPiedra()
    }
    
    @Given("^jugador(\\d+) juega PAPEL$")
    public void primer_jugador_juega_PAPEL(int numeroDeJugador) throws Throwable {
    	
    	this.jugador1.setNumeroJugador(numeroDeJugador);  
    	this.seleccionA = this.jugador1.juegaPapael()
    
    }
    
    @Given("^jugador(\\d+) juega TIJERA$")
    public void primer_jugador_juega_TIJERA(int numeroDeJugador) throws Throwable {
    
    	this.jugador1.setNumeroJugador(numeroDeJugador);  
    	this.seleccionA = this.jugador1.juegaTijera()
    
    }

    @When("^jugador(\\d+) juega TIJERA$")
    public void segundo_jugador_juega_TIJERA(int numeroDeJugador) throws Throwable {
    	
    		this.jugador2.setNumeroJugador(numeroDeJugador);
    		this.seleccionB = this.jugador2.juegaTijera();   
    	
    }
    
    @When("^jugador(\\d+) juega PIEDRA")
    public void segundo_jugador_juega_PIEDRA(int numeroDeJugador) throws Throwable {
    	
    	this.jugador2.setNumeroJugador(numeroDeJugador);
		this.seleccionB = this.jugador2.juegPiedra();
		
    }
    
    @When("^jugador(\\d+) juega PAPEL")
    public void segundo_jugador_juega_PAPEL(int numeroDeJugador) throws Throwable {
    	
    	this.jugador2.setNumeroJugador(numeroDeJugador);
		this.seleccionB = this.jugador2.juegPapel();
		
    }
    
    @Then("^empate$")
    public void empate() throws Throwable {
    	this.ganador = "empate";
    	this.juego.setJugadores(this.jugador1, this.jugador2);
        Assert.assertEquals( this.ganador, this.juego.definirGanador (seleccionA, seleccionB) );
    }

    @Then("^gana jugador(\\d+)$")
    public void gana_jugador(int numeroDeJugador) throws Throwable {
    	this.ganador = "gana jugador"+ String.valueOf(numeroDeJugador);
    	this.juego.setJugadores(this.jugador1, this.jugador2);
        Assert.assertEquals( this.ganador, this.juego.definirGanador (seleccionA, seleccionB) );
    }
}