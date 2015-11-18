package truco;

import org.junit.Assert;
import org.junit.Test;

public class CartaTest {

	@Test
	public void envidoCon1y7DeBasto() {
		Carta cartaUno = new Carta(7, Palo.BASTO);
		Carta cartaDos = new Carta(1, Palo.BASTO);
		Assert.assertEquals(28, cartaUno.getEnvido(cartaDos));
	}
	
	@Test
	public void envidoCon10y12DeBasto() {
		Carta cartaUno = new Carta(10, Palo.BASTO);
		Carta cartaDos = new Carta(12, Palo.BASTO);
		Assert.assertEquals(20, cartaUno.getEnvido(cartaDos));
	}
	
	@Test
	public void envidoCon6DeBastoy7DeOro() {
		Carta cartaUno = new Carta(6, Palo.BASTO);
		Carta cartaDos = new Carta(7, Palo.ORO);
		Assert.assertEquals(7, cartaUno.getEnvido(cartaDos));
	}
	
	
	
}