package skeleton;

import java.util.Arrays;

public class Ahorcado {
	
	private Jugador jugador;
	private Palabra palabra;
	
	public Ahorcado(String palabra){
		this.jugador = new Jugador(7);
		this.palabra = new Palabra(palabra);
	}

	public char[] getPalabra(){
		return this.palabra.getPalabra();
	}
	
	public char[] getEstadoPalabra(){
		return this.palabra.getEstadoPalabra();
	}
	
	public int getVidasJugador(){
		return this.jugador.getVidas();
	}
	
	public void arrriesgarLetra(String letra){
		if(!this.palabra.verificarLetra(letra)){
			this.jugador.decrementarVida();
		}else{
			this.palabra.completarEstadoConLetra(letra);
		}
	}
	
	public String getEstadoJuego(){
		String estado = "Jugando";
		if(!Arrays.equals(this.palabra.getEstadoPalabra(), this.palabra.getPalabra()) && this.jugador.getVidas() == 0){
			estado = "Juego Perdido";
		}else if(Arrays.equals(this.palabra.getEstadoPalabra(), this.palabra.getPalabra()) && this.jugador.getVidas() > 0){
			estado = "Juego Ganado";
	    }
		return estado;
	}
	
}
