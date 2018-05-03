package br.com.danilo.alura.bytebank.herdado;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}
}
