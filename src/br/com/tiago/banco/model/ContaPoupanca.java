package br.com.tiago.banco.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirConta() {
		System.out.println("=== Conta Poupança ===");
		super.imprimirConta();
	}
	
}
