package j12_다형성.인터페이스.ex;

public class Computer2 {
	
	HDMI2 hdmi2;
	public Computer2(HDMI2 hdmi2) {
			this.hdmi2 = hdmi2;
	}
	
	
	public void powerOn() {
		System.out.println("전원이 켜집니다.");
		Connect();
	}
	
	public void powerOff() {
		System.out.println("전원이 켜집니다.");
		DisConnected();
	}
	
	private void Connect() {
		System.out.println("연결하는중");
		hdmi2.connect();
	}
	private void DisConnected() {
		System.out.println("연결을 해제하는중");
		hdmi2.disconnected();
	}
}
