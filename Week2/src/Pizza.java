import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	//attributes
	static int qtdeIngredienteGasto; // eu entendi que esta variável deve armazenar a quantidade de ingredientes gastos por todos os objetos do tipo Pizza
	Map<String, Integer> ingrediente = new HashMap<String, Integer>();
	
	//methods
	void adicionaIngrediente(String ingrediente) {
		this.ingrediente.put(ingrediente,new Integer(0));
		contabilizaIngrediente();
	}
	
	int getPreco() {
		if(ingrediente.size() <= 2)
			return 15;
		else if(ingrediente.size() <= 5)
			return 20;
		else
			return 23;
	}
	
	static void contabilizaIngrediente() {
		qtdeIngredienteGasto++;
	}
}
