package j11_상속.factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}

	@Override
	public void start() {
		System.out.print( "삼성 " );
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
	
	public void produceSmartPhone() {
		System.out.println("스마트 폰을 생산합니다.");
	}
}
