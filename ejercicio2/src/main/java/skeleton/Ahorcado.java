package skeleton;

import java.util.Arrays;

public class Ahorcado {
	
	private Jugador jugador;
	private Palabra palabra;
	
	public Ahorcado(String palabra){
		this.jugador = new Jugador();
		this.palabra = new Palabra(palabra);
		this.jugador.setVidas(7);
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
	
	public void SetVidasJugador(int vidas){
		this.jugador.setVidas(vidas);
	}
	
	public void setEstadoPalabra(String estadoPalabra){
		this.palabra.setEstadoPalabra(estadoPalabra);
	}
	
	public String getResultadoJuego(){
		String resultadoJuego = null ;
		if(this.getVidasJugador() > 0 && Arrays.equals(this.palabra.getPalabra(),this.palabra.getEstadoPalabra())){
			resultadoJuego = "Ganaste";
		}else if(this.getVidasJugador() == 0 && !Arrays.equals(this.palabra.getPalabra(),this.palabra.getEstadoPalabra())){
		              resultadoJuego = "Perdiste";
		}
		return resultadoJuego;		
	}
	
}
