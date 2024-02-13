package j11_상속;

public class Human extends Animal{
	
	public Human() {
		//super();		생략되어있는거임 그래서 Human 객체가 생성될때 부모 생성자가 먼저 나오는거임
	System.out.println("Human 생성자 호출");
	}
	public void handling() {
		System.out.println("도구를 사용합니다.");
	}
	
	// 오버라이딩 : 재정의
	@Override
	public void move() {
		
		System.out.println("딸 피아노 고수");
		super.move();	//super 는 부모의 객체주소
	}
	
}
