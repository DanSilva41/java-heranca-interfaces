package br.com.danilo.alura.bytebank.herdado;

import br.com.danilo.alura.bytebank.composicao.Autenticador;

public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador util;

	public Administrador() {
		this.util = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		return 50;
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
