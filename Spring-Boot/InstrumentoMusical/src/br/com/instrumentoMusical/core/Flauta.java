package br.com.instrumentoMusical.core;

import br.com.instrumentoMusical.material.Material;

public class Flauta extends InstrumentoMusical {

	private int quantidadesDeFuros = 0;

	public Flauta(Marca marca, Material material, int quantidadeDeFuros) {
		this.marca = marca;
		this.material = material;
		this.quantidadesDeFuros = quantidadeDeFuros;
	}

	@Override
	protected void tocar() {
		System.out.println("Tocando a Flauta da marca " + marca.getNome() + " feito de " + material.getName() + " com "
				+ quantidadesDeFuros + " Furos");
	}
}
