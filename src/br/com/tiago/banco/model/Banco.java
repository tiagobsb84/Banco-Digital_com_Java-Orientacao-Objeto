package br.com.tiago.banco.model;

import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> cliente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}	
	
	
}
