package profissional;

public class Main {

	public static void main(String[] args) {
		Medico medico1 = new Medico ("André", "Pediatra", 300, "ABCDE");
		Dentista dentista1 = new Dentista ("Wellington", "Faz aparelho", 500, "OPXCGF");
		Fisioterapeuta fisio1 = new Fisioterapeuta ("Naves", "Vôlei", 450, "EUFSDG");
		
		medico1.agendarConsulta();
		System.out.println();
		dentista1.agendarConsulta();
		System.out.println();
		fisio1.agendarConsulta();
		

	}

}
