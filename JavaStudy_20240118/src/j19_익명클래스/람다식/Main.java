package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 정수, 정수 받아서 두 정한 값을 리턴하는 cals 함수
		 */
		
		
	
		
		Math<Double, Double> math2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value, Double value2) {
				// TODO Auto-generated method stub
				return value + value2;
			}
			
	
		};
		
		System.out.println(math2.calc(3.14, 4.44));
		
		Math<Double, Double> math3 = (v1,v2)-> v1 + v2;	//람다식
		
		System.out.println(math3.calc(3.14, 4.44));
		
		Math<Double,Double> math4 =  (v1,v2) -> {
			System.out.println("hi");
			return 3.14;
		};// return 외에 실행문이 없을시 중괄호와 return이 생략 가능하다.
		math4.calc(1.0, 1.0);
		
		/*
		 * minus라는 메소드를 만들고 num1- num2리턴하는 람다식 만들기
		 */
 		
	}

}
