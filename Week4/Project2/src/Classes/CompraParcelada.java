package Classes;

public class CompraParcelada extends Compra {

	private int qtdeParcelas;
	private double jurosMensal;

	public CompraParcelada(double valorCompra, int qtdeParcelas, double jurosMensal) {
		super(valorCompra);
		this.qtdeParcelas = qtdeParcelas;
		this.jurosMensal = jurosMensal;
	}
	
	public double total() {
		return this.valorCompra*(Math.pow(1 + this.jurosMensal, this.qtdeParcelas));
	}
}
