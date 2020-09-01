import java.util.Calendar;

public class Pessoa {
	
	private Calendar dataDeNascimento;
	
	public Pessoa(int dia, int mes, int ano) {
		dataDeNascimento = Calendar.getInstance();
		dataDeNascimento.set(Calendar.YEAR, ano);
		dataDeNascimento.set(Calendar.MONTH, mes - 1);
		dataDeNascimento.set(Calendar.DAY_OF_MONTH, dia);
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade() {
		Calendar hoje = Calendar.getInstance();
		int idade = hoje.get(Calendar.YEAR) - this.dataDeNascimento.get(Calendar.YEAR);
		
		//caso ainda nao tenha feito aniversario, retornar idade--
		if(this.dataDeNascimento.get(Calendar.MONTH) > hoje.get(Calendar.MONTH)) {
			idade--;
		}
		else if(this.dataDeNascimento.get(Calendar.MONTH) == hoje.get(Calendar.MONTH)) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) > hoje.get(Calendar.DAY_OF_MONTH))
				idade--;
		}
		
		return idade;
	}
	
	public String getSigno() {
		return "";
	}
}
