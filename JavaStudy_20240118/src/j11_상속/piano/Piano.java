package j11_상속.piano;

public class Piano extends Instrument {

	public Piano(int num) {
		super(num);
		System.out.println("Piano 생성자 호출");
	}

	public void soccer() {
		System.out.println("축구를 합니다.");

	}

}
