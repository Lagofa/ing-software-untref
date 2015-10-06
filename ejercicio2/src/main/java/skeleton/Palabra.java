package skeleton;

public class Palabra {
	
	char[] palabra;
	char[] estadoPalabra;
	
	public Palabra(String palabra ){
		this.palabra= palabra.toLowerCase().toCharArray();
		this.rellenarEstadoInicial();
	}
	
	private void rellenarEstadoInicial() {
		int limite= this.palabra.length;
		estadoPalabra= new char[limite];
		for(int i=0; i< limite;i++){
			estadoPalabra[i]='*';
		}
		
	}

	public char[] getPalabra(){
		return this.palabra;
	}
	
	public char[] getEstadoPalabra(){
		return this.estadoPalabra;
		
	}

}
