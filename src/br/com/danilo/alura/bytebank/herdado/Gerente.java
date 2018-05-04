package br.com.danilo.alura.bytebank.herdado;

import br.com.danilo.alura.bytebank.composicao.Autenticador;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador util;

	public Gerente() {
		this.util = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario() + 1000;
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.util.autentica(senha);
		if (autenticou) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
}
