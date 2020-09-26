package classes;

public class Embaralhador1 implements Embaralhador {
	
	//logica: trocar a primeira letra pela última e a segunda letra pela antepenultima
	@Override
	public char[] embaralhaPalavra(String palavra) {
		char palavraEmbaralhada[] = new char[palavra.length() - 1];
		palavraEmbaralhada = palavra.toCharArray();
		
		char aux;
		aux = palavraEmbaralhada[0];
		palavraEmbaralhada[0] = palavraEmbaralhada[palavra.length() - 1];
		palavraEmbaralhada[palavra.length() - 1] = aux;
		
		aux = palavraEmbaralhada[1];
		palavraEmbaralhada[1] = palavraEmbaralhada[palavra.length() - 2];
		palavraEmbaralhada[palavra.length() - 2] = aux;
		
		return palavraEmbaralhada;
	}

}
