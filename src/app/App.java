package app;

import app.personagem.Personagem;
import app.service.Service;
import app.service.ataque.AtaqueService;
import app.service.defesa.DefesaService;
import app.service.normal.NormalService;

public abstract class App {
	public static void main(String[] args) {
		Service ataque = new AtaqueService();
		Service defesa = new DefesaService();
		Service normal = new NormalService();
		
		Personagem personagem = new Personagem();
		personagem.set(normal);
		personagem.get();
		personagem.get();
		personagem.set(defesa);
		personagem.get();
		personagem.set(ataque);
		personagem.get();
		personagem.get();
		personagem.get();
	}
}