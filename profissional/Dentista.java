package profissional;

class Dentista extends ProfissionalSaude {
	protected String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
	}

	@Override
	public void agendarConsulta() {
		System.out.println("NOME: " + nome);
		System.out.println("ESPECIALIDADE: " + especialidade);
		System.out.println("VALOR DA CONSULTA: " + valorConsulta);
		System.out.println("CRO: " + cro);

	}
}