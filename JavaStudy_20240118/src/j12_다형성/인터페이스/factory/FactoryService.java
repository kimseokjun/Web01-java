package j12_다형성.인터페이스.factory;

import j11_상속.factory.Factory;

public class FactoryService {
	private Factory factory;
	
	public FactoryService(Factory factory) {
		this.factory = factory;
	}
	public void factroyStart() {
		factory.start();
	}
	public void factoryStop() {
		factory.stop();
	}
}
