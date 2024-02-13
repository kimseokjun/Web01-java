package j12_다형성.인터페이스;

public class Computer {
	
	private Hdmi hdmi;
	private Bluetooth bluetooth;
	
	public Computer(Hdmi hdmi) {
		this.hdmi = hdmi;
	}
	
	public void setBluetooth(Bluetooth bluetooth) {
		this.bluetooth = bluetooth;
	}

	public void powerOn() {
		
		System.out.println("컴퓨터의 전원을 켭니다.");
		connectedDisplay();
		bluetooth.wireless();
	}
	
	public void powerOff() {
		
		System.out.println("컴퓨터의 전원을 끕니다.");
		disConnectedDisplay();
	}
	
	private void connectedDisplay() {
		System.out.println("출력장치를 연결합니다.");
		hdmi.connect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력장치 연결을 해제합니다.");
		hdmi.disConnect();
	}
}
