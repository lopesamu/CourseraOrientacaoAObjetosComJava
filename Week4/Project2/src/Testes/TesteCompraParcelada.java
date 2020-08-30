package Testes;

import static org.junit.Assert.*;

import org.junit.Test;
import Classes.CompraParcelada;

public class TesteCompraParcelada {
	CompraParcelada cp;
	
	@Test
	public void UmaParcela() {
		cp = new CompraParcelada(1000, 1, 0.005);
		assertEquals(cp.total(), 1005, 0.1);
	}
	
	@Test
	public void DuasParcela() {
		cp = new CompraParcelada(1000, 2, 0.005);
		assertEquals(cp.total(), 1010.02, 0.1);
	}
	
	@Test
	public void CincoParcela() {
		cp = new CompraParcelada(1000, 5, 0.005);
		assertEquals(cp.total(), 1025.25, 0.1);
	}
	
	@Test
	public void DezParcela() {
		cp = new CompraParcelada(1000, 10, 0.005);
		assertEquals(cp.total(), 1051.14, 0.1);
	}
}
