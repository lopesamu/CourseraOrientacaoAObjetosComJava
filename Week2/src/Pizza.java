import java.util.*;

public class Pizza {
	
	//attributes
	static Map<String, Integer> ingredienteGasto = new HashMap<String, Integer>();
	List<String> ingrediente = new ArrayList<String>();
	
	//methods
	void adicionaIngrediente(String ingrediente) {
		this.ingrediente.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	int getPreco() {
		if(ingrediente.size() <= 2)
			return 15;
		else if(ingrediente.size() <= 5)
			return 20;
		else
			return 23;
	}
	
	static void contabilizaIngrediente(String ingrediente) {
		//se o ingrediente ja tiver sido adicionado, somar ao seu valor. Caso contrario, criar chave com valor 1
		if(ingredienteGasto.containsKey(ingrediente))
			ingredienteGasto.put(ingrediente, ingredienteGasto.get(ingrediente) + 1);
		else
			ingredienteGasto.put(ingrediente, 1);
	}
}
