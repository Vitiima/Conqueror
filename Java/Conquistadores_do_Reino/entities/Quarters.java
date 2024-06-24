package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quarters extends Build {
	private String nome;
	private List<Soldier> tropasProduzidas;

	public Quarters() {
		this.tropasProduzidas = new ArrayList<>();
	}

	public void criarTropas(Player player) {
		String tipo;
		int quantidade;
		int nivel;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite: \n 'tipo' (Arqueiro, Cavaleiro, Lanceiro) \n 'quantidade' \n 'nivel da tropa'");
		tipo = scanner.nextLine();
		quantidade = scanner.nextInt();
		nivel = scanner.nextInt();

		for (int i = 0; i < quantidade; i++) {
			Soldier soldier = new Soldier(tipo, nivel);
			tropasProduzidas.add(soldier);
			House house = new House();
			house.addPerson(soldier);
			player.setTropasProduzidas(tropasProduzidas);
		}
		System.out.println(quantidade + " tropas do tipo " + tipo + " foram criadas!");
	}

	public List<Soldier> getTropasProduzidas() {
		return tropasProduzidas;
	}

	public String getNome() {
		return nome;
	}
}
