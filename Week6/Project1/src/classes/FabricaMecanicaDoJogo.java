package classes;

public class FabricaMecanicaDoJogo {
	
	public static MecanicaDoJogo mecanicaUtilizada(int opcao) {
		if(opcao == 1)
			return new MecanicaDoJogo1(3);//modo facil
		else
			return new MecanicaDoJogo2(1);//modo dificil
	}
}
