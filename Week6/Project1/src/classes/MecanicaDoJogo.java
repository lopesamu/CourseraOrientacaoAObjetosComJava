package classes;

public interface MecanicaDoJogo {
	public void mostrarPalavraEmabaralhada();
	public boolean acabouJogo();
	public boolean acertouPalavra(String resposta);
	public void decrementarVida();
	public void podeTentarNovamente();
	public int getQtdeVida();
	public void zeraQtdeVidas();
	public void avisoAcerto();
	public void avisoTenteNovamente();
	public void avisoFimDeJogo();
	
	//Implementacao 1: pode ter 3 vidas
	//Implementacao 2: pode ter apenas 1 vida
}
