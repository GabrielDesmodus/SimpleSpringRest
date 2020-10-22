package com.example.springrestservice;

public class Carro {
	private final long id;
	private final String cor;
	
	public Carro(long id, String cor) {
		super();
		this.id = id;
		this.cor = cor;
	}
	
	public long getId() {
		return id;
	}
	
	public String getCor() {
		return cor;
	}
	
	
}
