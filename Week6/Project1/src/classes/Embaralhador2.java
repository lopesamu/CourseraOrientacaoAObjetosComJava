package classes;

import java.util.Random;

public class Embaralhador2 implements Embaralhador {
	
	//logica: trocar duas letras de maneira aleatoria
	@Override
	public char[] embaralhaPalavra(String palavra) {
		char palavraEmbaralhada[] = new char[palavra.length() - 1];
		palavraEmbaralhada = palavra.toCharArray();
		
		Random r = new Random();
		char aux;
		int indiceDeQuemTroca;
		for(int i = 0; i < palavra.length(); i++) {
			if(r.nextInt(2) == 1) {
				indiceDeQuemTroca = r.nextInt(palavra.length());
				aux = palavraEmbaralhada[i];
				palavraEmbaralhada[i] = palavraEmbaralhada[indiceDeQuemTroca];
				palavraEmbaralhada[indiceDeQuemTroca] = aux;
			}
		}
		return palavraEmbaralhada;
	}

}
