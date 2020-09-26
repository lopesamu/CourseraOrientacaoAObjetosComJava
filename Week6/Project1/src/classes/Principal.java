package classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//define a dificuldade do jogo
		System.out.println("---BEM-VINDO AO NOSSO JOGO!!!---");
		
		int opcao = 3;
		while(opcao != 1 && opcao != 2) {
			System.out.println("Qual a dificuldade do jogo?\n(1)Fácil (3 chances de errar)\n(2)Difícil (sem chances de errar)");
			
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();
		}
		
		//se opcao = 1, retornar MecanicaDoJogo1. Se opcao = 2, retornar MecanicaDoJogo2
		MecanicaDoJogo m = FabricaMecanicaDoJogo.mecanicaUtilizada(opcao);
		
		//mostra a palavra embaralhada
		m.mostrarPalavraEmabaralhada();
		
		String resposta;
		//enquanto não acabar as vidas
		while(m.acabouJogo() != true) {
			//lê resposta do usuário
			System.out.println("Qual é a palavra certa?");
			Scanner aux = new Scanner(System.in);
			resposta = aux.nextLine();
			
			//verificar se a resposta esta correta
			if(m.acertouPalavra(resposta)) {
				//zerar as vidas para sair do loop
				m.zeraQtdeVidas();
				m.avisoAcerto();
			}
			else {
				m.podeTentarNovamente();
			}
		}
		m.avisoFimDeJogo();
	}
}
