package br.com.danilo.alura.bytebank.abstracts;

import br.com.danilo.alura.bytebank.herdado.Autenticavel;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar!");
		}
	}
}
