package entities;

import java.util.ArrayList;
import java.util.List;

public class House extends Build {
	private int pessoas;
	private List<Person> espacos;
	private int maxEspacos;

	public House() {
		this.maxEspacos = 10;
		this.espacos = new ArrayList<>();
	}

	public void addPerson(Person person) {
		if (pessoas < maxEspacos) {
			espacos.add(person);
			pessoas++;
			System.out.println("Habitante adicionada ao seu reino.");
		} else {
			System.out.println("tem pessoas até no teto das casas, construa mais habitacoes");
		}
	}

	public int getPessoas() {
		return pessoas;
	}

	public List<Person> getEspacos() {
		return espacos;
	}
}