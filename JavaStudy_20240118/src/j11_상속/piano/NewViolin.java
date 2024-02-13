package j11_상속.piano;

public class NewViolin extends Instrument{
	
	public NewViolin(int num) {
		super(num);
	}
	@Override
	public void piano() {
		System.out.println("바이올린 잘 켬.");
		super.piano();
	}

}
