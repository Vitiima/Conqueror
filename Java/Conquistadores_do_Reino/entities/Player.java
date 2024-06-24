package entities;

import java.util.ArrayList;
import java.util.List;

public class Player extends Build {
	private int dinheiro;
	private List<Soldier> tropasProduzidas;
	private int poder;

	public Player() {
		tropasProduzidas = new ArrayList<>();
		poder = tropasProduzidas.size();
		return;
	}w

	public List<Soldier> getTropasProduzidas() {
		return tropasProduzidas;
	}

	public void setTropasProduzidas(List<Soldier> tropasProduzidas) {
		this.tropasProduzidas = tropasProduzidas;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = +poder;
	}

	public void infoplayer() {
		System.out.println(" Quantidade de tropas: " + tropasProduzidas + "\n Quantidade de construcoes: "
				+ construcao.size() + "\n Poder: " + poder);
		return;
	}

	public void playerbuilds() {
		int mineCount = 0;
		int quartersCount = 0;
		int houseCount = 0;
		for (Build build = 0: construcao) {
			if (build instanceof Mina) {
				mineCount++;
			}
			if (build instanceof Quarters) {
				quartersCount++;
			}
			if (build instanceof House) {
				houseCount++;
			} else
				return;
		}
		System.out.println(" Quantidade de minas: " + mineCount + "\n Quantidade de Quarteis: " + quartersCount
				+ "\n Quantidade de Casas: " + houseCount);
	}
}
