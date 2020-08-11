import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	//attributes - USAR LIST AO INVES DE HASHMAP - https://www.caelum.com.br/apostila-java-orientacao-objetos/collections-framework#listas-javautillist
	Map<Pizza, Integer> pizzaComprada = new HashMap<Pizza, Integer>();//lista de pizzas e seus respectivos valores
	
	//methods
	void adicionaPizza(Pizza pizza) {
		if(pizza.ingrediente.size() < 0)
			this.pizzaComprada.put(pizza, pizza.getPreco());
		else
			System.out.println("Pizza não adicionada porque não possui ingredientes!!!");
	}
	
	int valorTotalCarrinho() {
		int valorTotal = 0;
		for(Pizza pizza: pizzaComprada.keySet()) {
			valorTotal += pizzaComprada.get(pizza);
		}
		
		return valorTotal;
	}
}
