import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarrinhoDeComprasTeste {
	
	//Verifica se o método valorTotalCarrinho() soma corretamente
	@Test
	void testCarrinho1() {
		//Criar três pizzar com sabores diferentes
		Pizza p[] = new Pizza[3];
		for(int i = 0; i < 3; i++)
			p[i] = new Pizza();
						
		p[0].adicionaIngrediente("calabresa");
		p[0].adicionaIngrediente("cebola");	
		p[1].adicionaIngrediente("frango");
		p[1].adicionaIngrediente("catupiry");
		p[1].adicionaIngrediente("azeitona");
		p[2].adicionaIngrediente("mussarela");
		p[2].adicionaIngrediente("presunto");
				
		//Adicionar as pizzas no carrinho de compras
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p[0]);
		c.adicionaPizza(p[1]);
		c.adicionaPizza(p[2]);
		
		assertEquals(50,c.valorTotalCarrinho());
	}
	
	//Verifica se o método valorTotalCarrinho() soma corretamente
	@Test
	void testCarrinho2() {
		//Criar três pizzar com sabores diferentes
		Pizza p[] = new Pizza[3];
		for(int i = 0; i < 3; i++)
			p[i] = new Pizza();
							
		p[0].adicionaIngrediente("calabresa");
		p[0].adicionaIngrediente("cebola");	
		p[1].adicionaIngrediente("frango");
		p[1].adicionaIngrediente("catupiry");
		p[1].adicionaIngrediente("azeitona");
		p[2].adicionaIngrediente("mussarela");
		p[2].adicionaIngrediente("presunto");
		p[2].adicionaIngrediente("cebola");
			
			
		//Adicionar as pizzas no carrinho de compras
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p[0]);
		c.adicionaPizza(p[1]);
		c.adicionaPizza(p[2]);
		
		assertEquals(55,c.valorTotalCarrinho());
	}
	
	//Verifica se o método valorTotalCarrinho() quando nenhuma pizza é adicionada
	@Test
	void testCarrinho3() {
		//Adicionar as pizzas no carrinho de compras
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		assertEquals(0,c.valorTotalCarrinho());
	}
	
	//Verifica se o método adicionaPizza() impede que uma pizza sem ingredientes seja inserida
	@Test
	void testPizzaSemIngrediente() {
		//Criar três pizzar com sabores diferentes
		Pizza p[] = new Pizza[3];
		for(int i = 0; i < 3; i++)
			p[i] = new Pizza();
							
		p[0].adicionaIngrediente("calabresa");
		p[0].adicionaIngrediente("cebola");	
		p[1].adicionaIngrediente("frango");
		p[1].adicionaIngrediente("catupiry");
		p[1].adicionaIngrediente("azeitona");
			
		//Adicionar as pizzas no carrinho de compras
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p[0]);
		c.adicionaPizza(p[1]);
		c.adicionaPizza(p[2]);
		
		assertEquals(0,c.adicionaPizza(p[2]));
	}

}
