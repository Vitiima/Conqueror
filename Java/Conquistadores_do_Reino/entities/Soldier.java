package entities;

import java.util.Random;

public class Soldier extends Person {
	private String nome;
	private int quantidade;
	private int poderAtaque;
	private int poderDefesa;
	private int nivel;
	private int custoTreinamento = 35;

	public Soldier(String nome, int nivel) {
		this.nome = nome;
		this.quantidade = 0;
		this.custoTreinamento = getCustoTreinamento();
		this.poderAtaque = (new Random().nextInt(10) + 1) * nivel;
		this.poderDefesa = (new Random().nextInt(10) + 1) * nivel;
		this.nivel = nivel;
	}

	public void treinarTropa() {
		this.quantidade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCustoTreinamento() {
		return custoTreinamento + (nivel * 2);
	}

	public void setCustoTreinamento(int custoTreinamento) {
		this.custoTreinamento = custoTreinamento;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	public int getPoderDefesa() {
		return poderDefesa;
	}

	public void setPoderDefesa(int poderDefesa) {
		this.poderDefesa = poderDefesa;
	}

}
