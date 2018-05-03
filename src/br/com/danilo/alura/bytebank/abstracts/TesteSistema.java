package br.com.danilo.alura.bytebank.abstracts;

import br.com.danilo.alura.bytebank.herdado.Administrador;
import br.com.danilo.alura.bytebank.herdado.Cliente;
import br.com.danilo.alura.bytebank.herdado.Gerente;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);

		Administrador adm = new Administrador();
		adm.setSenha(222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(adm);
		sistema.autentica(cliente);
	}

}
