package movieSort.model;

public class Series extends Midia {
	private int temporada;

	public Series(String nome, String sinopse, String atores, double imdb, int ano, int genero, int tipo, int temporada) {
		super(nome, sinopse, atores, imdb, ano, genero, tipo);
		this.temporada = temporada;
	}
	

	public int getTemporada() {
		return temporada;
	}
	

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	@Override
	public String toString() {
        return "Série: " + this.getNome() + " Ano: " + this.getAno() + " Genero: " + this.getGenero() + " nota: " + this.getImdb() + " Temporada: " + this.getTemporada();
    }

	public void visualizar() {
		super.visualizar();
		System.out.println("Temporada: " + this.temporada);
	}
	
}

