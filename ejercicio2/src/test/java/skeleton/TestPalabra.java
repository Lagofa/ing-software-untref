package skeleton;

import skeleton.Palabra;
import org.junit.Assert;
import org.junit.Test;

public class TestPalabra {
	
	@Test
	public void testEstadoInicial() {
		Palabra palabra=new Palabra("hola");
		char[] estado ="****".toCharArray();
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
	}

}
