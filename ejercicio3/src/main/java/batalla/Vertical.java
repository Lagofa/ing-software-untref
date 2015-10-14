package batalla;

public class Vertical extends Orientacion {

	public Posicion contiguo(Posicion posicion) {
		return new Posicion(posicion.getPosicionX() + 1, posicion.getPosicionY());
	}

}
