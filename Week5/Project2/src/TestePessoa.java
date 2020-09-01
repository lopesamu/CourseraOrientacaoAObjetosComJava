import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestePessoa {

	@Test
	void test() {
		Pessoa p = new Pessoa(31, 10, 1996);
		System.out.println(p.getIdade());
	}

}
