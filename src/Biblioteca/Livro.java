package Biblioteca;

public class Livro {

	// Atributos
	public String titulo;
	public String autor;
	public int ano;
	public boolean disponivel;

	// Método Construtor
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = true; // Valor padrão para disponível
	}

	// Método da classe
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
			System.out.println("O livro foi emprestado.");
		} else {
			System.out.println("O livro não está disponível para emprestar.");
		}
	}

	public void devolver() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("O livro foi devolvido.");
		} else {
			System.out.println("O livro já está disponível.");
		}
	}
	
	public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
