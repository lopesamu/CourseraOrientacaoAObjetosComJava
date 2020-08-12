public class Principal {

	public static void main(String[] args) {
		
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
		
		//Imprimir valor total do carrinho de compras
		System.out.println("Valor total: R$"+c.valorTotalCarrinho());
		
		//Imprimir a quantidade utilizada de cada ingrediente
		System.out.println("\nQuantidade utilizada de cada ingrediente:\n"+Pizza.ingredienteGasto);
	}

}
