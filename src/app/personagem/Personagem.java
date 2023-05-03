package app.personagem;

import app.service.Service;

public class Personagem {
	
	private Service service;

	public void set(Service service) {
		this.service = service;
	}
	
	public void get() {
		service.acao();
	}
}