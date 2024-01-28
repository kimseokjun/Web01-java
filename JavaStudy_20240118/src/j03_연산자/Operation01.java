package j03_연산자;

public class Operation01 {
	public static void main(String[] args) {
		//관계연산자
		System.out.println(10>5);
		
		// 10 > 5 이것을 result라는 변수에 대입하시오
		
		boolean result = 10>5;
		System.out.println(result);
		
		int num = 7;
		
		System.out.println(num < 10);
		System.out.println(num > 10);
		// 기준은 무조건 왼쪽!
		
		boolean result2 = num !=20;	//true
		
		System.out.println(result2);
		
		boolean result3 = num == 10;	//false
		System.out.println(result3);
		
		
		/*
		 * 논리 연산 : boolean 끼리 연산하는 것
		 * And연산(&&) - 곱
		 * true && true => true
		 * true && false => false
		 * false && false = false
		 * 
		 * OR연산(||) => 합
		 * true || true => true
		 * true || false => true
		 * false || false => false
		 * 
		 * true 는 1, false 는 0 이다라고 생각만 하기
		 * 
		 * 
		 * Not연산 => 부정
		 * !true => false
		 * !false => true
		 */
		
	}
}
