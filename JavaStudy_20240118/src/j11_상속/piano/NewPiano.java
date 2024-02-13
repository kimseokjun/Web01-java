package j11_상속.piano;

public class NewPiano extends Instrument{

	public NewPiano(int num) {
		super(5);
		System.out.println("뉴피아노 생성자");
	}
	public void baseball() {
		System.out.println("야구를 합니다.");
	}
}
