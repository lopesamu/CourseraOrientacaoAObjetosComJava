package Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import Producao.Paciente;

public class PacienteTeste {

	Paciente p;
	
	@Test
	public void TesteBaixoPesoMuitoGrave() {
		p = new Paciente(32, 1.5);
		assertEquals(14.22, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso muito grave", p.diagnostico());
	}
	
	@Test
	public void TesteBaixoPesoGrave() {
		p = new Paciente(38, 1.5);
		assertEquals(16.88, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso grave", p.diagnostico());
	}
	
	@Test
	public void TesteBaixoPeso() {
		//Fazer
	}
	
	@Test
	public void TestePesoNormal() {
		//Fazer
	}
	
	@Test
	public void TesteSobrePeso() {
		//Fazer
	}
	
	@Test
	public void TesteObesidadeGrau1() {
		//Fazer
	}
	
	@Test
	public void TesteObesidadeGrau2() {
		//Fazer
	}
	
	@Test
	public void TesteObesidadeGrau3() {
		//Fazer
	}
}
