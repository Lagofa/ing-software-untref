package batalla;

public class Horizontal extends Orientacion {

	public Posicion contiguo(Posicion posicion) {
		return new Posicion(posicion.getPosicionX(), posicion.getPosicionY() + 1);
	}

}