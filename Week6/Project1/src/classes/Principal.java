package classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("---BEM-VINDO AO NOSSO JOGO!!!---");
		
		int opcao = 3;
		while(opcao != 1 && opcao != 2) {
			System.out.println("Qual a dificuldade do jogo?\n(1)Fácil (3 chances de errar)\n(2)Difícil (sem chances de errar)");
			
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();
		}
		
		//se 1, retornar MecanicaDoJogo1. Se 2, retornar MecanicaDoJogo2
		MecanicaDoJogo m = FabricaMecanicaDoJogo.mecanicaUtilizada(opcao);
		//MecanicaDoJogo m = new MecanicaDoJogo1(3);
		
		//mostra a palavra embaralhada
		m.mostrarPalavraEmabaralhada();
		
		String resposta;
		//enquanto não acabar as vidas
		while(m.acabouJogo() != true) {
			System.out.println("Qual é a palavra certa?");
			Scanner aux = new Scanner(System.in);
			resposta = aux.nextLine();
			
			//verificar se a resposta esta correta
			if(m.acertouPalavra(resposta)) {
				System.out.println("\nVOCÊ ACERTOU, PARABÉNS!!!");
				break;
			}
			else {
				//caso nao esteja, retirar uma vida
				m.decrementarVida();
				if(m.getQtdeVida() > 0)
					System.out.println("Tente novamente!!! Você ainda tem " + m.getQtdeVida() + " vida(s)");
				else
					System.out.println("\nVocê não conseguiu acertar a palavra :(");
			}
		}
		
		System.out.println("\nFim de jogo!!!");
	}
}
