package Producao;

public class Paciente {
	//attributes
	double peso;
	double altura;
		
	//methods
	public Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
		
	public double calcularIMC() {
		return this.peso/(this.altura*this.altura);
	}
		
	public String diagnostico() {
		double IMC = this.calcularIMC();
		
		if (IMC < 16) {
			return "Baixo peso muito grave";
		}
		else if (IMC < 16.99) {
			return "Baixo peso grave";
		}
		else if (IMC < 18.49) {
			return "Baixo peso";
		}
		else if (IMC < 24.99) {
			return "Peso normal";
		}
		else if (IMC < 29.99) {
			return "Sobrepeso";
		}
		else if (IMC < 34.99) {
			return "Obesidade grau I";
		}
		else if (IMC < 39.99) {
			return "Obesidade grau II";
		}
		else {
			return "Obesidade grau III (obesidade mórbida)";
		}
	}	
}
