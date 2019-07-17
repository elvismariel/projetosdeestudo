package br.com.instrumentoMusical.material;

public class Madeira implements Material {

	public String nome;

	public Madeira(String nome) {
		this.nome = nome;
	}

	@Override
	public String getName() {
		return this.nome;
	}
}
