package skeleton;

import skeleton.Palabra;
import org.junit.Assert;
import org.junit.Test;

public class TestPalabra {
	
	@Test
	public void testEstadoInicial() {
		Palabra palabra = new Palabra("hola");
		char[] estado = "****".toCharArray();
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
	}
	
	@Test
	public void testAciertoLetraMinuscuala(){
		Palabra palabra = new Palabra("hola");
		char[] estado = "****".toCharArray();
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
		palabra.verificarLetra("h");
		palabra.completarEstadoConLetra("h");
		estado[0] = 'h';
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
	}
	
	@Test
	public void testAciertoLetraMayuscuala(){
		Palabra palabra = new Palabra("hola");
		char[] estado = "****".toCharArray();
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
		palabra.verificarLetra("H");
		palabra.completarEstadoConLetra("H");
		estado[0] = 'h';
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
	}
	
	@Test
	public void testAciertoLetraEnVariasPosiciones(){
		Palabra palabra = new Palabra("POMELO");
		char[] estado = "******".toCharArray();
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
		palabra.verificarLetra("o");
		palabra.completarEstadoConLetra("o");
		estado[1] = 'o';
		estado[5] = 'o';
		Assert.assertArrayEquals(palabra.getEstadoPalabra(),estado);
	}

}
