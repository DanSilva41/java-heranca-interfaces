package br.com.danilo.alura.bytebank.interfaces;

import br.com.danilo.alura.bytebank.herdado.conta.ContaCorrente;

public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida sv = new SeguroDeVida();

		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(cc);
		calculador.registra(sv);

		System.out.println(calculador.getTotalImposto());
	}

}
