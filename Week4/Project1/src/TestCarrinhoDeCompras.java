import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class TestCarrinhoDeCompras {
	
	Produto p1, p2, p3;
	ProdutoComTamanho pt1, pt2, pt3;
	CarrinhoDeCompras c;
	
	//Adicionar, remover e calcular valor total
	@Test
	void testInserirProdutosRepetidos() {
		
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
