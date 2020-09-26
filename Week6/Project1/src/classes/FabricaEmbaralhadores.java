package classes;

import java.util.Random;

public class FabricaEmbaralhadores {
	public static Embaralhador embaralhadorUtilizado() {
		Random gerador = new Random();
		
		if(gerador.nextInt(2) == 0)
			return new Embaralhador1();
		else
			return new Embaralhador2();
	}
}
