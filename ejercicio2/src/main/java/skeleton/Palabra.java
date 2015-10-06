package skeleton;

public class Palabra {
	
	char[] palabra;
	char[] estadoPalabra;
	
	public Palabra(String palabra ){
		this.palabra = palabra.toLowerCase().toCharArray();
		this.rellenarEstadoInicial();
	}
	
	private void rellenarEstadoInicial() {
		int cantLetras = this.palabra.length;
		estadoPalabra = new char[cantLetras];
		for(int i = 0; i < cantLetras; i++){
			estadoPalabra[i] = '*';
		}
	}

	public char[] getPalabra(){
		return this.palabra;
	}
	
	public char[] getEstadoPalabra(){
		return this.estadoPalabra;
	}

	public Boolean verificarLetra(String letraArriesgada) {
		Boolean encontro = false;
		int cantLetras = this.palabra.length;
		int contador = 0;
		char letraABuscar = letraArriesgada.toLowerCase().toCharArray()[0];
		while(encontro == false && contador < cantLetras ){
			if(letraABuscar == this.palabra[contador]){
				encontro = true;
			}
			contador++;
		}
		return encontro;
	}
	
	public void completarEstadoConLetra(String letraArriesgada){
		int cantLetras = this.palabra.length;
		char letra = letraArriesgada.toLowerCase().toCharArray()[0];
		for(int i = 0; i < cantLetras; i++){
			if(letra == this.palabra[i]){
				estadoPalabra[i] = letra;
			}
		}	
	}

}
