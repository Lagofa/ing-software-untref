package truco;

public class Carta {

	private int valorEnvido = 0;
	private Palo palo;

	public Carta(int numero, Palo palo) {

		if (numero < 10) {
			this.valorEnvido = numero;
		}

		this.palo = palo;
	}

	public int getEnvido(Carta carta) {
		int sumaEnvido;
		if (this.palo == carta.getPalo()) {
			sumaEnvido = this.valorEnvido + carta.getValorEnvido() + 20;
		} else if (this.valorEnvido > carta.getValorEnvido()) {
			sumaEnvido = this.valorEnvido;
		} else {
			sumaEnvido = carta.getValorEnvido();
		}
		return sumaEnvido;
	}

	private int getValorEnvido() {
		return this.valorEnvido;
	}

	public Palo getPalo() {
		return this.palo;
	}
}