package br.com.instrumentoMusical.core;

import java.time.LocalDate;

import br.com.instrumentoMusical.material.Material;

public abstract class InstrumentoMusical {

	protected Marca marca;
	protected Material material;
	protected LocalDate dataDeFabricacao;

	public void Afiar() {
		System.out.println("Afiar: " + this.getClass().getSimpleName().toUpperCase());
		this.tocar();
	}

	protected abstract void tocar();
}
