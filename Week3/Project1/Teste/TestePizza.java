import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestePizza {
	
	@Before
	public void Inicializacao() {
		Pizza.zeraIngrediente();
		assertEquals(null,Pizza.ingredienteGasto);
	}
	
	//Verifica o valor de uma pizza com 1 ingrediente
	@Test
	public void testValorPizza1() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("mussarela");
		assertEquals(15,p.getPreco());
	}
	
	//Verifica o valor de uma pizza com 3 ingredientes
	@Test
	public void testValorPizza2() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("molho de tomate");
		p.adicionaIngrediente("calabresa");
		assertEquals(20,p.getPreco());
	}
	
	//Verifica o valor de uma pizza com 5 ingredientes
	@Test
	public void testValorPizza3() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("molho de tomate");
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("tomate");
		p.adicionaIngrediente("catupiry");
		p.adicionaIngrediente("frango");
		assertEquals(23,p.getPreco());
	}
	
	//Verifica o valor de uma pizza com nenhum ingrediente
		@Test
		public void testValorPizza4() {
			Pizza p = new Pizza();
			assertEquals(15,p.getPreco());
		}

}
