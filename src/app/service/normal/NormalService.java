package app.service.normal;

import app.service.Service;

public class NormalService implements Service {

	@Override
	public void acao() {
		System.out.println("Normal");
	}

}