package profissional;

class Fisioterapeuta extends ProfissionalSaude {
	protected String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
	}

	@Override
	public void agendarConsulta() {
		System.out.println("NOME: " + nome);
		System.out.println("ESPECIALIDADE: " + especialidade);
		System.out.println("VALOR DA CONSULTA: " + valorConsulta);
		System.out.println("CREFITO: " + crefito);
	}
}