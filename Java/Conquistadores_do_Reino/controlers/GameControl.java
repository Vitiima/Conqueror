package controlers;

import java.util.List;
import javax.swing.JMenuBar;

import entities.Build;
import entities.Player;
import entities.Quarters;

import java.util.ArrayList;
import java.util.Scanner;

public class GameControl {
	private int turn;

	public GameControl() {
		Scanner scanner = new Scanner(System.in);
		int decisao = 0;
		List<Player> jogador = new ArrayList<>();
		List<Build> build = new ArrayList<>();

		System.out.println("Serao Quantos jogadores: (1 - 4)");
		decisao = scanner.nextInt();

		for (int i = 1; i <= decisao; i++)
			jogador.add(new Player());

		while (turn != -1) {
			for (int i = 0; i < jogador.size(); i++) {
				System.out.println("Turno do Jogador: " + i);
				System.out.println("Qual o seu proximo movimento:");
				System.out.println("1. Atacar");
				System.out.println("2. Construir");
				System.out.println("3. Treinar Soldado");
				System.out.println("4. Info");
				decisao = scanner.nextInt();

				switch (decisao) {
				case 1:
					int poder1 = jogador.get(i).getPoder();

					System.out.println("Qual jogador deseja atacar: ");
					for (int j = 0; j < jogador.size(); j++)
						System.out.println(j + 1 + ". " + j);
					decisao = scanner.nextInt();

					if (decisao > jogador.size() + 1)
						break;
					int poder2 = jogador.get(decisao - 1).getPoder();

					if (poder1 < poder2) {
						System.out.println("Infelizmente a derrota chega ate mesmo para os mais preparados");
						jogador.remove(jogador.get(i));
					} else if (poder1 > poder2) {
						System.out.println(
								"Felizmente seus guerreiros sao mais fortes que um mineiro no final do expediente");
						jogador.remove(jogador.get(decisao - 1));
					} else
						System.out.println("Doidera, voces sao igualmente poderozos");
					break;

				case 2:
					build.add(new Build());
					build.get(i).PrintBuild(jogador.get(i));
					break;

				case 3:
					Quarters quarters = new Quarters();
					quarters.criarTropas(jogador.get(i));
					break;

				case 4:
					jogador.get(i).infoplayer();
					break;

				default:
					System.out.println("Valor fora de escopo!");
					i--;
					break;
				}
			}
		}
	}
}
