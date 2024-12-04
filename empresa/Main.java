package empresa;

public class Main {

	public static void main(String[] args) {


		Departamento dep = new Departamento ("Abacaxi Gestão");
		Empresa empresa = new Empresa("Morango & CIA", dep);

		System.out.println("Empresa: " + empresa.getNome() + ". \nDepartamento: " + dep.getNome());
	}

}