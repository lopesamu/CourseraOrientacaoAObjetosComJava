package classes;

public interface MecanicaDoJogo {
	public void mostrarPalavraEmabaralhada();
	public boolean acabouJogo();
	public boolean acertouPalavra(String resposta);
	public void decrementarVida();
	public boolean podeTentarNovamente();
	public boolean pontuacaoFinal();
	public int getQtdeVida();
	
	//Implementacao 1: pode ter 3 vidas
	//Implementacao 2: pode ter apenas 1 vida
}
