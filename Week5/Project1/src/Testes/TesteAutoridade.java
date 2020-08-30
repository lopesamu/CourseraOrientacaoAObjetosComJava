package Testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Classes.*;

class TesteAutoridade {
	
	FormatadorNome f;
	
	@Test
	void testeInformal() {
		f = new Informal();
		Autoridade a = new Autoridade("Samuel", "Lopes", f);
		assertEquals(a.getTratamento(), "Samuel");
		//System.out.println(a.getTratamento());
	}
	
	@Test
	void testeRespeitoso() {
		f = new Respeitoso(true);
		Autoridade a = new Autoridade("Samuel", "Lopes", f);
		assertEquals(a.getTratamento(), "Sr. Lopes");
		//System.out.println(a.getTratamento());
	}
	
	@Test
	void testeComTitulo() {
		f = new ComTitulo("Mestre");
		Autoridade a = new Autoridade("Samuel", "Lopes", f);
		assertEquals(a.getTratamento(), "Mestre Samuel Lopes");
	}

}
