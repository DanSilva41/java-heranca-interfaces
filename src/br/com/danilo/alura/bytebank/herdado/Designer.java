package br.com.danilo.alura.bytebank.herdado;

public class Designer extends Funcionario {

	public double getBonificacao() {
		return super.getSalario() + 100;
	}
}
