package j12_다형성.인터페이스.factory;

import j11_상속.factory.LGFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LGFactory lgFactory = new LGFactory(1);
		
		FactoryService factoryService = new FactoryService(samsungFactory);
		
		
		factoryService.factroyStart();
		System.out.println();
		factoryService.factoryStop();
	}

}
