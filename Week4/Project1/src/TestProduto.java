import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestProduto {
	
	Produto p1, p2, p3, p4;
	
	//testar função sobrescrita equals()
	@Test
	public void testEquals() {
		p1 = new Produto("sabao", 1, 45);
		p2 = new Produto("sabao", 2, 90);
		p3 = new Produto("sabao", 2, 90);
		
		assertEquals(false,p1.equals(p2));
		assertEquals(false,p1.equals(p3));
		assertEquals(true,p2.equals(p3));
	}
}
