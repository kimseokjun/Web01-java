package j19_익명클래스.람다식;

public class MathTestMain {

	public static void main(String[] args) {
		
		
		//매개변수가 하나일시 소괄호 생략 가능 (v1)안해도됌
		MathTest math = v1 -> {
			if(v1 > 100 || v1 <= 0) {
				return "계산불가";
			}else if (v1 > 89) {
				return "A학점";
			} else if (v1 > 79) {
				return "B학점";
			} else if (v1 > 69) {
				return "C학점";
			} else if (v1 > 59) {
				return "D학점";
			}else {
				return "F학점";
			}
		};
		
		System.out.println(math.test(35));
		
	}

}
