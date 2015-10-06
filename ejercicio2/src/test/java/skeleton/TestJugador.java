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
	
	

}
