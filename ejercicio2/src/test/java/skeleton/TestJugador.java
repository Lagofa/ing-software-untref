package skeleton;


import skeleton.Jugador;

import org.junit.Assert;
import org.junit.Test;

public class TestJugador {
    
	@Test
	public void testGetVidas() {
		Jugador jugador=new Jugador(7);
		Assert.assertEquals(jugador.getVidas(),7);
	}
	
	@Test
	public void testDecrementarVida() {
		int vidas;
		Jugador jugador=new Jugador(7);
		jugador.decrementarVida();
		vidas= jugador.getVidas();
		Assert.assertEquals(vidas,6);
	}
	

}
