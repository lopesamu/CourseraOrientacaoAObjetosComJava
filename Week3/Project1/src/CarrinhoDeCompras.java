import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	//Lista de pizzas do carrinho de compras
	List<Pizza> pizzaComprada = new ArrayList<Pizza>();
	
	//methods
	int adicionaPizza(Pizza pizza) {
		if(pizza.ingrediente.size() > 0) {
			this.pizzaComprada.add(pizza);
			return 1;
		}
			
		else
			return 0;
	}
	
	int valorTotalCarrinho() {
		int valorTotal = 0;
	    for (int i = 0; i < this.pizzaComprada.size(); i++) {
	    	valorTotal += this.pizzaComprada.get(i).getPreco();
	    }
		
		return valorTotal;
	}
}
