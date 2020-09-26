package classes;

public class MecanicaDoJogo2 implements MecanicaDoJogo {
	private int qtdeVidas;
	private String palavra;
	private Embaralhador e = FabricaEmbaralhadores.embaralhadorUtilizado(); 
	
	public MecanicaDoJogo2(int qtdeVidas) {
		//palavra que deve ser acertada
		BancoDePalavras bp = new BancoDePalavras();
		this.palavra = bp.palavraAleatoria();
		
		//quantidade de vidas
		this.qtdeVidas = qtdeVidas;
	}
	
	@Override
	public void mostrarPalavraEmabaralhada() {		
		//embaralhar por meio de 'Emabaralhador'
		System.out.println("---> Palavra Embaralhada <---");
		System.out.println(e.embaralhaPalavra(palavra));
	}
	
	@Override
	public boolean acabouJogo() {
		if(this.qtdeVidas == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean acertouPalavra(String resposta) {
		if(resposta.equals(this.palavra))
			return true;
		else
			return false;
	}
	
	@Override
	public void decrementarVida() {
		this.qtdeVidas--;
	}

	@Override
	public int getQtdeVida() {
		return this.qtdeVidas;
	}
	
	@Override
	public void zeraQtdeVidas() {
		this.qtdeVidas = 0;
	}
	
	@Override
	public void podeTentarNovamente() {
		//decrementar uma vida, pois o usuário errou
		this.decrementarVida();
		this.avisoTenteNovamente();
	}
	
	@Override
	public void avisoAcerto() {
		System.out.println("\nVOCÊ ACERTOU, PARABÉNS!!!");
	}

	@Override
	public void avisoTenteNovamente() {
		if(this.acabouJogo() == false)
			System.out.println("Tente novamente!!! Você ainda tem " + this.getQtdeVida() + " vida(s)");
		else
			System.out.println("\nVocê não conseguiu acertar a palavra :(");
		
	}

	@Override
	public void avisoFimDeJogo() {
		System.out.println("\nFim de jogo!!!");
		
	}
}
