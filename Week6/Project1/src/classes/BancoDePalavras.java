package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class BancoDePalavras {
	private String bancoPalavras[] = new String[20]; 
	
	//construtor para criar o banco de palavras em um vetor de 20 posições
	public BancoDePalavras() {
		String csvFile = "C:\\Users\\samul\\Documents\\MeusProjetos\\CourseraOrientacaoAObjetosComJava\\Week6\\Project1\\palavras.txt";
	    BufferedReader br = null;
	    String line = "";

	    try {
	    	br = new BufferedReader(new FileReader(csvFile));
	    	int i = 0;
	    	while ((line = br.readLine()) != null) {
	    		this.bancoPalavras[i] = line;
	    		//System.out.println(line);
	    		i++;
	        }

	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    } finally {
	    	if (br != null) {
			    try {
			    	br.close();
			    } catch (IOException e) {
			    	e.printStackTrace();
			    }
	    	}
	    }
	}
	
	//método que retorna uma palavra retirada aleatóriamente
	public String palavraAleatoria() {
		Random gerador = new Random();
		return this.bancoPalavras[gerador.nextInt(20)];
	}
	
}
