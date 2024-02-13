package j12_다형성.인터페이스.ex;

public class ComputerMain2 {
	public static void main(String[] args) {
		Monitor2 monitor2  = new Monitor2();
		Computer2 computer2 = new Computer2(monitor2);
		
		computer2.powerOn();
	}
}
