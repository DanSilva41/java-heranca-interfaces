package br.com.danilo.alura.bytebank.herdado;

public class Gerente extends FuncionarioAutenticavel {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return super.getSalario() + 1000;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
