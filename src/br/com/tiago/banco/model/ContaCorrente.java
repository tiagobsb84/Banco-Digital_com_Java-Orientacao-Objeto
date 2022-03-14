package br.com.tiago.banco.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirConta() {
		System.out.println("=== Conta Corrente ===");
		super.imprimirConta();
	}

	
}
