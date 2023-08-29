package model;

public class Pais {
	private String nome;
	private String capital;
	private int populacao;

	public Pais(String nome, String capital, int populacao) {
		this.nome = nome;
		this.capital = capital;
		this.populacao = populacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

}
