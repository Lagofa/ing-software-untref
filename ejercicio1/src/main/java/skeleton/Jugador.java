package skeleton;

public class Jugador {
	
	private Opcion opcionElegida;
	private int numeroDeJugador;
	
        public Jugador(int numeroDeJugador){
		
    		this.numeroDeJugador = numeroDeJugador;
	
	}
    
	public void juegaPiedra() {
	
		this.opcionElegida =  Opcion.PIEDRA;	
	
	}

	public void juegaTijera() {
	
		this.opcionElegida = Opcion.TIJERA;
	
	}
	
	public void juegaPapel() {
	
		this.opcionElegida = Opcion.PAPEL;
	
	}

	public int getNumeroDeJugador (){
		
		return this.numeroDeJugador;
	
	}
    
	public Opcion getOpcionElegida (){
		
		return this.opcionElegida;	
	
	}
}
