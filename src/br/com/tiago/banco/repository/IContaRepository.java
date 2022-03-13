package br.com.tiago.banco.repository;

import br.com.tiago.banco.model.Conta;

public interface IContaRepository {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta conta);
}
