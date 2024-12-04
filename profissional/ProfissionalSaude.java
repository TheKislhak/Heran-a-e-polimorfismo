package profissional;

public abstract class ProfissionalSaude {
	protected String nome;
	protected String especialidade;
	protected int valorConsulta;
	public String agendarConsulta;


	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}

	public abstract void agendarConsulta(); 
}