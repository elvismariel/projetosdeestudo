package br.com.instrumentoMusical.core;

import br.com.instrumentoMusical.material.Material;

public class Violao extends InstrumentoMusical {

	private int quantidadeDeCordas;

	public Violao(Marca marca, Material material, int quantidadeDeCordas) {
		this.marca = marca;
		this.material = material;
		this.quantidadeDeCordas = quantidadeDeCordas;
	}

	@Override
	protected void tocar() {
		System.out.println("Tocando o Violão da " + marca.getNome() + " feito de " + material.getName() + " com "
				+ quantidadeDeCordas + " cordas");
	}
}
