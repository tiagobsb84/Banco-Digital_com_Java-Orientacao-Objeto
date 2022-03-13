package br.com.tiago.banco.model;

import br.com.tiago.banco.repository.IContaRepository;

public abstract class Conta implements IContaRepository {

	private int agencia;
	private int numero;
	private double saldo;
	
	@Override
	public void sacar(double valor) {
		
	}

	@Override
	public void depositar(double valor) {
		
	}

	@Override
	public void transferir(double valor, Conta conta) {
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
