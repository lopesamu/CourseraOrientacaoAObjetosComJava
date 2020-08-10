public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(30, 1.3), p2 = new Paciente(60, 1.7), p3 = new Paciente(100, 1.6);
		
		//show results
		System.out.println("Diagnóstico do Paciente 1 --- "+"IMC: "+p1.calcularIMC()+" --- "+p1.diagnostico()+"\n");
		System.out.println("Diagnóstico do Paciente 2 --- "+"IMC: "+p2.calcularIMC()+" --- "+p2.diagnostico()+"\n");
		System.out.println("Diagnóstico do Paciente 3 --- "+"IMC: "+p3.calcularIMC()+" --- "+p3.diagnostico()+"\n");
	}
}


