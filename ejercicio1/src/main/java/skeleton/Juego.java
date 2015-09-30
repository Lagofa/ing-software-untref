package skeleton;

public class Juego {

	private Jugador jugador1;
	private Jugador jugador2;

	public String definirGanador(String SeleccionA, String seleccionB) {
		
		String resultado ;
		swwitch(seleccionA){
			case "PIEDRA":
				resultado = compararConPiedra(seleccionB);
				break;
			case "PAPEL":
				resultado = compararConPapel(seleccionB);
				break;
			case "TIJERA":
				resultado = compararConTijera(seleccionB);
				break;
		}
		return resultado;
	}
	
	private string compararConPiedra(String seleccion){
		
		String resultado="empate";
		
		if(seleccion.compareTo("TIJERA")==0)
			resultado = "gana jugador" + this.jugador1.getNumero();
			else
				if(seleccion.compareTo("PAPEL")==0)
		     		resultado = "gana jugador" + this.jugador2.getNumero();
	    return resultado;
	
	}
	
    private string compararConPapel(String seleccion){
		
		String resultado="empate";
		
		if(seleccion.compareTo("PIEDRA")==0)
			resultado = "gana jugador" + this.jugador1.getNumero();
			else
				if(seleccion.compareTo("TIJERA")==0)
		     		resultado = "gana jugador" + this.jugador2.getNumero();
	    return resultado;
	 
    }
	
    private string compararConTijera(String seleccion){
		
		String resultado="empate";
		
		if(seleccion.compareTo("PAPEL")==0)
			resultado = "gana jugador" + this.jugador1.getNumero();
			else
				if(seleccion.compareTo("PIEDRA")==0)
		     		resultado = "gana jugador" + this.jugador2.getNumero();
	    return resultado;
	
     }
    
    public SetJugadores(Jugador jugador1, Jugador jugador2) {
	
    	this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	
    }
}