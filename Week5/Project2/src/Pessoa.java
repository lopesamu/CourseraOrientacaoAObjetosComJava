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
		
		//capricornio ou aqu�rio 
		if(this.dataDeNascimento.get(Calendar.MONTH) == 0) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "capric�rnio";
			else
				signo = "aqu�rio";
		}
		//aqu�rio ou peixes
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 1) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 19)
				signo = "aqu�rio";
			else
				signo = "peixes";
		}
		//peixes ou �ries
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 2) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "peixes";
			else
				signo = "�ries";
		}
		//�ries ou touro
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 3) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "�ries";
			else
				signo = "touro";		
		}
		//touro ou g�meos
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 4) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "touro";
			else
				signo = "g�meos";
		}
		//g�meos ou c�ncer
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 5) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 20)
				signo = "g�meos";
			else
				signo = "c�ncer";
		}
		//c�ncer ou le�o
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 6) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "c�ncer";
			else
				signo = "le�o";
		}
		//le�o ou virgem
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 7) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 22)
				signo = "le�o";
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
		//libra ou escorpi�o
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 9) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 22)
				signo = "libra";
			else
				signo = "escorpi�o";
		}
		//escorpi�o ou sagit�rio
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 10) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "escorpi�o";
			else
				signo = "sagit�rio";
		}
		//sagit�rio ou capric�rnio
		else if(this.dataDeNascimento.get(Calendar.MONTH) == 10) {
			if(this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) <= 21)
				signo = "sagit�rio";
			else
				signo = "capric�rnio";
		}
		
		return signo;		
	}
}
