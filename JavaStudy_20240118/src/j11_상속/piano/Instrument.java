package j11_상속.piano;

public class Instrument {
	
	//생성자가 오버로딩 되었으므로 기본생성자를 정의해줘야한다.
	
	public Instrument(int num) {
		System.out.println("num : " + num);
		System.out.println("Instrument 생성자 호출");
	}
	
	void piano() {
		System.out.println("악기를 연주합니다.");
	}
}
