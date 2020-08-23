package Classes;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto,Integer> listaProduto = new HashMap<>();
	
	public void adicionaProduto(Produto p, int quantidade) {
		//caso o produto ainda não exista
		if(this.listaProduto.get(p) == null) {
			this.listaProduto.put(p, quantidade);
		}
		//caso o produto já existir, somar quantidade
		else {
			this.listaProduto.put(p,this.listaProduto.get(p) + quantidade);
		}
	}
	
	public void removeProduto(Produto p, int quantidade) {
		this.listaProduto.put(p, this.listaProduto.get(p) - quantidade);
	}
	
	public double calculaValorTotal() {
		double valorTotal = 0;
		for (Produto p : this.listaProduto.keySet()) {
			  valorTotal += p.getPreco() * this.listaProduto.get(p);
		}
		
		return valorTotal;
	}
	
	public Map<Produto, Integer> getListaProduto() {
		return listaProduto;
	}
	
}
