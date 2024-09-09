package Biblioteca;

public class Main {

	public static void main(String[] args) {
		// Método principal para testar a classe

		// Criando uma instância da classe Livro
		Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

		// Exibindo os detalhes do livro
		meuLivro.exibirDetalhes();

		// Emprestando o livro
		meuLivro.emprestar();

		// Exibindo os detalhes após o empréstimo
		meuLivro.exibirDetalhes();

		// Devolvendo o livro
		meuLivro.devolver();

		// Exibindo os detalhes após a devolução
		meuLivro.exibirDetalhes();

	}
}
