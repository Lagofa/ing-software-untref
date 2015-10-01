package skeleton;

public class Juego {

	private Jugador jugador1;
	private Jugador jugador2;
	
	
	public Juego(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public String jugar() {
		
		String resultado = null; 
		switch(this.jugador1.getOpcionElegida()){
        	case PIEDRA:
        		resultado = this.compararConPiedra();
        	break;
        	case PAPEL:
        		resultado = this.compararConPapel();
			break;
        	case TIJERA:
        		resultado = this.compararConTijera();
			break;
        	default:
			break;
        	
        }

		return resultado;
	}
	
	private String compararConPiedra(){
		
		String resultado = "empate";
		if(this.jugador2.getOpcionElegida()==Opcion.PAPEL)
			resultado = "gana jugador" + this.jugador2.getNumeroDeJugador();
		else if(this.jugador2.getOpcionElegida()==Opcion.TIJERA)
			resultado = "gana jugador" + this.jugador1.getNumeroDeJugador();
		return resultado;
		
	}
	
    private String compararConPapel(){
		
		String resultado = "empate";
		if(this.jugador2.getOpcionElegida()==Opcion.PIEDRA)
			resultado = "gana jugador" + this.jugador1.getNumeroDeJugador();
		else if(this.jugador2.getOpcionElegida()==Opcion.TIJERA)
			resultado = "gana jugador" + this.jugador2.getNumeroDeJugador();
		return resultado;
		
	}
    
 private String compararConTijera(){
		
		String resultado = "empate";
		if(this.jugador2.getOpcionElegida()==Opcion.PIEDRA)
			resultado = "gana jugador" + this.jugador2.getNumeroDeJugador();
		else if(this.jugador2.getOpcionElegida()==Opcion.PAPEL)
			resultado = "gana jugador" + this.jugador1.getNumeroDeJugador();
		return resultado;
		
	}
}