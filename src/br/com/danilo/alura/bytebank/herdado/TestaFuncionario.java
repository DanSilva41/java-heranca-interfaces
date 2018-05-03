package br.com.danilo.alura.bytebank.herdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		// Funcionario danilo = new Funcionario();
		Funcionario danilo = new Gerente();

		danilo.setNome("Danilo Silva");
		danilo.setCpf("223355646-9");
		danilo.setSalario(2590.80);

		System.out.println(danilo.getNome());
		System.out.println(danilo.getBonificacao());
	}

}
