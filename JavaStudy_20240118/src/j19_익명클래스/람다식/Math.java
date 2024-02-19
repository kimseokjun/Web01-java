package j19_익명클래스.람다식;

//제네릭 생성할때 자료형을 잡아줌

@FunctionalInterface	//메서드 하나만 쓸수이써 -> 즉 람다식을 사용할때 사용가능
public interface Math<T1,T2> {
	
	public double calc(T1 value, T2 value2);
	///public double minus(T1 value, T2 value2);
	
	/*
	 * 문제
	 * 람다식 패키지안에 
	 * MathTest라는 인터페이스 만들기
	 * 
	 * test메소드 만들기
	 * 
	 * 테스트메소드안에 정수인 점수 던지기
	 * A학점
	 * B학점
	 * 계산 불가를 리턴
	 */
}
