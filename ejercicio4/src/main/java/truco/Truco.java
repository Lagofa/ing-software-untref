package truco;

public class Truco {

	public int obtenerEnvidoDe(Carta cartaUno, Carta cartaDos, Carta cartaTres) {
		return mayorEnvido(cartaUno.getEnvido(cartaDos), cartaUno.getEnvido(cartaTres), cartaDos.getEnvido(cartaTres));
	}

	private int mayorEnvido(int envidoUno, int envidoDos, int envidoTres) {
		int mayorEnvido = envidoUno;
		if (envidoDos > mayorEnvido) {
			mayorEnvido = envidoDos;
		} else if (envidoTres > mayorEnvido) {
			mayorEnvido = envidoTres;
		}
		return mayorEnvido;
	}
}