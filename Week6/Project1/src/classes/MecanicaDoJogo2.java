package classes;

public class MecanicaDoJogo2 implements MecanicaDoJogo {
	private int qtdeVidas;
	private BancoDePalavras bp = new BancoDePalavras();
	private Embaralhador e = FabricaEmbaralhadores.embaralhadorUtilizado(); 
	
	public MecanicaDoJogo2(int qtdeVidas) {
		this.qtdeVidas = qtdeVidas;
	}
	
	@Override
	public boolean acabouJogo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acertouPalavra() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean podeTentarNovamente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pontuacaoFinal() {
		// TODO Auto-generated method stub
		return false;
	}

}
