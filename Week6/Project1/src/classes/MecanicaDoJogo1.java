package classes;

public class MecanicaDoJogo1 implements MecanicaDoJogo {
	private int qtdeVidas;
	private String palavra;
	private Embaralhador e = FabricaEmbaralhadores.embaralhadorUtilizado(); 
	
	public MecanicaDoJogo1(int qtdeVidas) {
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
	
	
}
