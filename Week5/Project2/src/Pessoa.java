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
		String signo = "nao entrou";
		
		//capricornio ou aquário 
		if(this.dataDeNascimento.get(Calendar.MONTH) == 0) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "capricórnio";
			else
				signo = "aquário";
		}
		//aquário ou peixes
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 1) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 19)
				signo = "aquário";
			else
				signo = "peixes";
		}
		//peixes ou áries
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 2) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "peixes";
			else
				signo = "áries";
		}
		//áries ou touro
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 3) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "áries";
			else
				signo = "touro";		
		}
		//touro ou gêmeos
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 4) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "touro";
			else
				signo = "gêmeos";
		}
		//gêmeos ou câncer
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 5) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "gêmeos";
			else
				signo = "câncer";
		}
		//câncer ou leão
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 6) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "câncer";
			else
				signo = "leão";
		}
		//leão ou virgem
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 7) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 22)
				signo = "leão";
			else
				signo = "virgem";
		}
		//virgem ou libra
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 8) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 22)
				signo = "virgem";
			else
				signo = "libra";
		}
		//libra ou escorpião
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 9) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 22)
				signo = "libra";
			else
				signo = "escorpião";
		}
		//escorpião ou sagitário
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 10) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "escorpião";
			else
				signo = "sagitário";
		}
		//sagitário ou capricórnio
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 10) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "sagitário";
			else
				signo = "capricórnio";
		}
		
		return signo;		
	}
}
