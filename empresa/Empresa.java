package empresa;

public class Empresa {
	private String nome;
	private Departamento departamento;


	public Empresa(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}