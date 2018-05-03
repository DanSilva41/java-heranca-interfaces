package br.com.danilo.alura.bytebank.abstracts;

import br.com.danilo.alura.bytebank.herdado.FuncionarioAutenticavel;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(FuncionarioAutenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar!");
		}
	}
}
