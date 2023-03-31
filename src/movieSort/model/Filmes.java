package movieSort.model;

public class Filmes extends Midia {
	
	private int duracao;
	
	public Filmes(String nome, String sinopse, String atores, double imdb, int ano, int genero, int tipo, int duracao) {
		super(nome, sinopse, atores, imdb, ano, genero, tipo);
		this.duracao = duracao;
	}

	
	public int getDuracao() {
		return duracao;
	}

	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public String toString() {
	    return "Filme: " + this.getNome() + " - Ano: " + this.getAno() + " Genero: " + this.getGenero() + " Nota: " + this.getImdb() + " Duração: " + this.getDuracao() + "min.";
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Duração do filme: " + this.duracao + " minutos");
	}
	
	
}
