package br.com.danilo.alura.bytebank.herdado;

import br.com.danilo.alura.bytebank.composicao.Autenticador;

public class Cliente implements Autenticavel {

	private Autenticador util;

	public Cliente() {
		this.util = new Autenticador();
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
