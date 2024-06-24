package entities;

import java.util.ArrayList;
import java.util.List;

public class Mina extends Build {
	private int producao;
	private int armazenamento;
	private int espaco;
	private List<Miner> mineiros;

	public Mina() {
		this.producao = 1;
		this.armazenamento = 50;
		this.espaco = 30;
		this.mineiros = new ArrayList<>();
	}

	public void contratarMiner(Miner miner) {
		if (mineiros.size() < espaco) {
			mineiros.add(miner);
			House house = new House();
			house.addPerson(miner);
			System.out.println("Mineiro " + miner.getNome() + "mineiro treinado, hora do pao de queijo!");
		} else {
			System.out.println("Não temos pão de queijo suficientes(sem espaco irmao)");
		}
	}

	public int calcularProducaoTotal() {
		return mineiros.size() * 5;
	}

	public int getProducao() {
		return producao;
	}

	public void setProducao(int producao) {
		this.producao = producao;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public int getEspaco() {
		return espaco;
	}

}
