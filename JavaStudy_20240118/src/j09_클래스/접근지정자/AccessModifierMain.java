package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA;
import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {
	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2();
		testA_2.testA2();
		
		TestA testA = new TestA();
		// 접근지정자를 입력하지 않으면 default로 설정
		
		TestB testB = new TestB();
		//		System.out.println(testB.tb);	private으로 되어있기때문에 접근이 안댐:)
		System.out.println(testB.getTb());
	}
}
