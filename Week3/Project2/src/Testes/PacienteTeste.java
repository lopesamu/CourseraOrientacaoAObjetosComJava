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
		p = new Paciente(40, 1.5);
		assertEquals(17.77, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso", p.diagnostico());
	}
	
	@Test
	public void TestePesoNormal() {
		p = new Paciente(45, 1.5);
		assertEquals(20, p.calcularIMC(), 0.01);
		assertEquals("Peso normal", p.diagnostico());
	}
	
	@Test
	public void TesteSobrePeso() {
		p = new Paciente(60, 1.5);
		assertEquals(26.66, p.calcularIMC(), 0.01);
		assertEquals("Sobrepeso", p.diagnostico());
	}
	
	@Test
	public void TesteObesidadeGrau1() {
		p = new Paciente(70, 1.5);
		assertEquals(31.11, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau I", p.diagnostico());
	}
	
	@Test
	public void TesteObesidadeGrau2() {
		p = new Paciente(80, 1.5);
		assertEquals(35.55, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau II", p.diagnostico());
	}
	
	@Test
	public void TesteObesidadeGrau3() {
		p = new Paciente(95, 1.5);
		assertEquals(42.22, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau III (obesidade mórbida)", p.diagnostico());
	}
}
