package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		String num = "40";

		switch (num) {
		case "10":
			System.out.println("10 입니다.");
		case "20":
			System.out.println("20 입니다.");
		case "30":
			System.out.println("30 입니다");
		case "40":
			System.out.println("40 입니다");
			System.out.println("40 입니다2");
			break;	// 멈추고 빠져나감
		case "50":
			System.out.println("50 입니다.");
		default:
			System.out.println("결과에 상관없이 실행");
		}
		System.out.println("switch 밖");
	}

}
