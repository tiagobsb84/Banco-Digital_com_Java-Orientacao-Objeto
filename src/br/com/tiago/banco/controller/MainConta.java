package br.com.tiago.banco.controller;

import br.com.tiago.banco.model.Cliente;
import br.com.tiago.banco.model.Conta;
import br.com.tiago.banco.model.ContaCorrente;
import br.com.tiago.banco.model.ContaPoupanca;

public class MainConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Tiago Silva");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(400.0);

		Conta cp = new ContaPoupanca(cliente);

		cc.transferir(250.0, cp);
		
		cc.imprimirConta();
		cp.imprimirConta();
		
	}	
}
