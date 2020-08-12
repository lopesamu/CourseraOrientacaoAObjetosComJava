import java.util.*;

public class CarrinhoDeCompras {
	
	//Lista de pizzas do carrinho de compras
	List<Pizza> pizzaComprada = new ArrayList<Pizza>();
	
	//methods
	void adicionaPizza(Pizza pizza) {
		if(pizza.ingrediente.size() > 0)
			this.pizzaComprada.add(pizza);
		else
			System.out.println("Pizza não adicionada porque não possui ingredientes!!!");
	}
	
	int valorTotalCarrinho() {
		int valorTotal = 0;
	    for (int i = 0; i < this.pizzaComprada.size(); i++) {
	    	valorTotal += this.pizzaComprada.get(i).getPreco();
	    }
		
		return valorTotal;
	}
}
