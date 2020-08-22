import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class TestProdutoComTamanho {

	ProdutoComTamanho p1, p2, p3, p4;
	
	//Testar função sobrescrita equals()
	@Test
	void testEquals() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("p1", 1, 2, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("p2", 1, 4, 10);
		ProdutoComTamanho p3 = new ProdutoComTamanho("p3", 1, 6, 20);
		ProdutoComTamanho p4 = new ProdutoComTamanho("p4", 2, 8, 10);
		
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p1.equals(p1));
		assertEquals(false, p1.equals(p3));
		assertEquals(false, p2.equals(p3));
		assertEquals(false, p1.equals(p4));
	}
}
