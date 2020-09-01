import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestePessoa {

	@Test
	void test1() {
		Pessoa p = new Pessoa(20, 04, 1998);
		assertEquals(p.getIdade(), 22);
		assertEquals(p.getSigno(), "áries");
	}
	
	@Test
	void test2() {
		Pessoa p = new Pessoa(15, 9, 2019);
		assertEquals(p.getIdade(), 0);
		assertEquals(p.getSigno(), "virgem");
	}
	
	@Test
	void test3() {
		Pessoa p = new Pessoa(01, 01, 1945);
		assertEquals(p.getIdade(), 75);
		assertEquals(p.getSigno(), "capricórnio");
	}

}
