package skeleton;

public class Jugador {
	
	private int numeroDeJugador;
	
	public String juegaPiedra() {
		
		return "PIEDRA";	
	
	}

	public String juegaTijera() { 
		
		return "TIJERA";
	
	}
	
	public String juegaPapel() {
		
		return "PAPEL";
	
	}

	public int getNumeroDeJugador (){
		
		return this.numeroDeJugador;
	
	}
	
	public setNumeroJugador(int numeroDeJugador) {
		
		this.numeroDeJugador = numeroDeJugador;
	
	}

	
}