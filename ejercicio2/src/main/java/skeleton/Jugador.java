package skeleton;

public class Jugador {
	
	int vidas;
	
	public int getVidas(){
		return this.vidas;
	}

	public void decrementarVida() {
		this.vidas--;		
	}
    
	public void setVidas(int vidas){
		this.vidas = vidas;
	}
	
}
