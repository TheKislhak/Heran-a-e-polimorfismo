package livro;

public class Livro {
	private String nome;
	private Autor autor;


	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = new Autor(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor.getNomeAutor();
	}
	
}