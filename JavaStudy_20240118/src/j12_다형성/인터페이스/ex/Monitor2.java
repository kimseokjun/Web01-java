package j12_다형성.인터페이스.ex;

public class Monitor2 implements HDMI2{
	//HDMI를 구현
	@Override
	public void connect() {
		System.out.println("HDMI 연결합니다.");
	}

	@Override
	public void disconnected() {
		System.out.println("HDMI 연결을 해제합니다.");
	}

}
