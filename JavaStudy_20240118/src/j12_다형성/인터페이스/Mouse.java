package j12_다형성.인터페이스;

public class Mouse implements Hdmi, Bluetooth{

	@Override
	public void wireless() {
		System.out.println("무선연결");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("무선연결 해제");
	}

	@Override
	public void connect() {
		System.out.println("마우스 유선 연결");
	}

	@Override
	public void disConnect() {
		System.out.println("마우스 유선연결 해제");
	}

}
