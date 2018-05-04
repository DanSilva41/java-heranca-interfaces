package br.com.danilo.alura.bytebank.interfaces;

public class CalculadorDeImposto {

	public double totalImposto;

	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}
