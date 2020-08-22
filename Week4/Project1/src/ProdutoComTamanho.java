
public class ProdutoComTamanho extends Produto {
	
	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object obj) {
		ProdutoComTamanho p = (ProdutoComTamanho) obj;
		
		if(this.codigo == p.codigo && this.tamanho == p.tamanho)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.codigo + tamanho;
	}
	
}
