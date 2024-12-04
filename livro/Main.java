package livro;

public class Main {

	public static void main(String[] args) {

		Livro livro = new Livro("Five Nights at Freddy's: Olhos Prateados", "Scott Cawton");

		System.out.println("Livro: " + livro.getNome() + ". Escrito por: " + livro.getAutor());
	}

}
