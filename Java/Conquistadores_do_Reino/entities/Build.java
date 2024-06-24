package entities;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Build {
	protected List<Build> construcao;

	public Build() {
		construcao = new ArrayList<>();
	}

	public void PrintBuild(Player player) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual edificio deseja construir:");
		System.out.println("1. Quartel");
		System.out.println("2. Mina");
		System.out.println("3. Casa");

		int decisao = scanner.nextInt();

		switch (decisao) {
		case 1:
			Quarters quartel = new Quarters();
			construcao.add(quartel);
			player.playerbuilds();
			break;

		case 2:
			Mina mine = new Mina();
			construcao.add(mine);
			player.playerbuilds();
			break;

		case 3:
			House house = new House();
			construcao.add(house);
			player.playerbuilds();
			break;

		default:
			System.out.println("Escolha uma construção existente");
		}
	}
}