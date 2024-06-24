package entities;

public class Miner extends Person {
	private String nome;
	private int producao;
	private int tamanho = 1;

	public Miner(String nome, int producao) {
		this.nome = nome;
		this.producao = producao;
	}

	public int calcularProducaoTotal(int producao) {
		return producao + producao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getProducaoExtra() {
		return producao;
	}

	public void setProducao(int producao) {
		this.producao = producao;
	}

	public int getTamanho() {
		return tamanho;
	}
}
