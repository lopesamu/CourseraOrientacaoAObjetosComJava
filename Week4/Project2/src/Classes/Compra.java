package Classes;

public class Compra {
	protected double valorCompra;
	
	public Compra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double total() {
		return this.valorCompra;
	}
}
