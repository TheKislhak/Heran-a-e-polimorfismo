package profissional;

class Medico extends ProfissionalSaude {
	protected String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
	}

	@Override
	public void agendarConsulta() {
		System.out.println("NOME: " + nome);
		System.out.println("ESPECIALIDADE: " + especialidade);
		System.out.println("VALOR DA CONSULTA: " + valorConsulta);
		System.out.println("CRM: " + crm);
		

	}
}