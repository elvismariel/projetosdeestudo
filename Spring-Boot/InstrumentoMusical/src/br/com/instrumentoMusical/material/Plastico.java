package br.com.instrumentoMusical.material;

public class Plastico implements Material {
	
	public String nome;

	public Plastico(String nome) {
		this.nome = nome;
	}

	@Override
	public String getName() {
		return this.nome;
	}
}