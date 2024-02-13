package j12_다형성.인터페이스;

public class ComputerMain {
	public static void main(String[] args) 
	{	
		Bluetooth bluetooth = new Mouse();
		Monitor monitor = new Monitor();
		Computer computer = new Computer(monitor);
		// Hdmi hdmi = new Hdmi();
		//인터페이스도 생성이 안됨
		computer.setBluetooth(bluetooth);
		
		computer.powerOn();
		computer.powerOff();
	}
}
