import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		Map<String, Integer> ingrediente = new HashMap<String, Integer>();
		
		//inserir item
		ingrediente.put("calabresa",new Integer(10));
		ingrediente.put("queijo",new Integer(40));
		ingrediente.put("tomate",new Integer(60));
		
		
		//calcular tamanho do map
		System.out.println("Quantidade de ingredientes: "+ingrediente.size());
		
		//imprimir itens
		int total = 0;
		for(String item : ingrediente.keySet()) {
			int valor = ingrediente.get(item);
			System.out.println("Ingrediente: "+item+" --- Valor: "+valor);
			total += valor;
		}
		
		//valor total
		System.out.println("\nValor total: "+total);
			
	}

}
