public class Produto {
	protected String nome;
	protected int codigo;
	protected double preco;
	
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		Produto outroProduto = (Produto) obj;
		
		if(this.codigo == outroProduto.codigo)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}
}
