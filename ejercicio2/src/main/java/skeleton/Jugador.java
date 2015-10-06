package skeleton;

public class Jugador {
	
	int vidas;
	
	public Jugador(int vidas){
		this.vidas= vidas;
	}
	
	public int getVidas(){
		return this.vidas;
	}

	public void decrementarVida() {
		this.vidas--;		
	}

}
