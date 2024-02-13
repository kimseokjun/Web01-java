package j12_다형성.인터페이스;

// 인터페이스 특징
// 1. 모든 메소드는 기본적으로 추상메소드로 정의한다.
// 2. 생성을 할 수 없다.
// 3. 일반변수 선언 할 수 없다.
// 4. 무조건 스태틱 상수를 사용한다.
// 5. 일반 메소드를 정의하기 위해서는 반환 자료형 앞에
//    default를 입력해야함
//	6. 인터페이스는 다중구현이 된다.


public interface Hdmi {
	public void connect();
	public void disConnect();
	
//	public default void hi() {
//		
//	}
}
