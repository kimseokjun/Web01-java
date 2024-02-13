package j12_다형성.인터페이스;

public class Monitor implements Hdmi{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("HDMI를 통해 모니터를 연결합니다.");
	}


	@Override
	public void disConnect() {
		// TODO Auto-generated method stub
		System.out.println("HDMI 연결 해제");
	}
}

