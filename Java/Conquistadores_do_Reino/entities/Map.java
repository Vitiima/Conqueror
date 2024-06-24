package entities;

public class Map {
	private int largura;
	private int altura;

	public Map(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	// Getters e Setters
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}