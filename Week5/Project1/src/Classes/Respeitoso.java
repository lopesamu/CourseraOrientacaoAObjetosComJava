package Classes;

public class Respeitoso implements FormatadorNome {
	private boolean ehMasculino;
	
	public Respeitoso(boolean ehMasculino) {
		this.ehMasculino = ehMasculino;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(this.ehMasculino)
			return "Sr. "+sobrenome;
		else
			return "Sra. "+sobrenome;
	}
}
