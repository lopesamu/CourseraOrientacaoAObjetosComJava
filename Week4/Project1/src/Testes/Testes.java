package Testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Classes.CarrinhoDeCompras;
import Classes.Produto;
import Classes.ProdutoComTamanho;

class Testes {

	Produto p1, p2, p3, p4;
	ProdutoComTamanho pt1, pt2, pt3;
	CarrinhoDeCompras c;
	
	//testar função sobrescrita equals() na superclasse
	@Test
	public void testEqualsSuper() {
		p1 = new Produto("sabao", 1, 45);
		p2 = new Produto("sabao", 2, 90);
		p3 = new Produto("sabao", 2, 90);
		
		assertEquals(false,p1.equals(p2));
		assertEquals(false,p1.equals(p3));
		assertEquals(true,p2.equals(p3));
	}
	
	//Testar função sobrescrita equals() na subclasse
	@Test
	void testEqualsSub() {
		p1 = new ProdutoComTamanho("p1", 1, 2, 10);
		p2 = new ProdutoComTamanho("p2", 1, 4, 10);
		p3 = new ProdutoComTamanho("p3", 1, 6, 20);
		p4 = new ProdutoComTamanho("p4", 2, 8, 10);
			
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p1.equals(p1));
		assertEquals(false, p1.equals(p3));
		assertEquals(false, p2.equals(p3));
		assertEquals(false, p1.equals(p4));
	}
	
	//Adicionar, remover e calcular valor total em CarrinhoDeCompras
	@Test
	void testInserirRemoverCalcular() {
		
		p1 = new Produto("sapato", 1, 4); //HashCode: 1 
		p2 = new Produto("chinelo", 2, 4); //HashCode: 2
		p3 = new Produto("sapato", 1, 4); //HashCode: 1
		
		pt1 = new ProdutoComTamanho("sapato", 1, 4, 10); //HashCode: 11 
		pt2 = new ProdutoComTamanho("sapato", 1, 4, 10); //HashCode: 11
		pt3 = new ProdutoComTamanho("chinelo", 2, 4, 10); //HashCode: 12
		
		c = new CarrinhoDeCompras();
		
		c.adicionaProduto(p1, 10);
		c.adicionaProduto(p2, 20);
		c.adicionaProduto(p3, 30);
		c.adicionaProduto(pt1, 40);
		c.adicionaProduto(pt2, 50);
		c.adicionaProduto(pt3, 60);
		
		//Verifica se não foi adicionado produtos repetitivos, já que p1 = p3 e pt1 = pt2
		assertEquals(4,c.getListaProduto().size());
		
		//Verifica se a quantidade de cada produto foi adicionado corretamente
		assertEquals(40, c.getListaProduto().get(p1));
		assertEquals(20, c.getListaProduto().get(p2));
		assertEquals(90, c.getListaProduto().get(pt1));
		assertEquals(60, c.getListaProduto().get(pt3));
		
		//Verifica o método calculaValorTotal()
		assertEquals(840,c.calculaValorTotal());
		
		c.removeProduto(p3, 10);
		c.removeProduto(pt2, 5);
		
		//Verifica se os produtos foram removidos corretamente
		assertEquals(30, c.getListaProduto().get(p1));
		assertEquals(20, c.getListaProduto().get(p2));
		assertEquals(85, c.getListaProduto().get(pt1));
		assertEquals(60, c.getListaProduto().get(pt3));
		
		//Verifica o método calculaValorTotal() após as remoções
		assertEquals(780,c.calculaValorTotal());
	}
}
