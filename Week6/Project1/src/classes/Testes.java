package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void test() {
		BancoDePalavras b = new BancoDePalavras();
		
		Embaralhador e = new Embaralhador2();
		System.out.println(e.embaralhaPalavra(b.palavraAleatoria()));
	}

}
