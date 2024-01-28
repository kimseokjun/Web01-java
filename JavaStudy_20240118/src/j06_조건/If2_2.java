package j06_조건;

import java.util.Scanner;

public class If2_2 {
	public static void main(String[] args) {
		/*
		 * 학점 판독기 점수(score)
		 * 
		 * 점수가 89점 초과이면 >> A학점 입니다. 점수가 79점 초과이면 >> B학점 입니다. 점수가 69점 초과이면 >> C학점 입니다.
		 * 점수가 59점 초과이면 >> D학점 입니다. 점수가 59점 이하이면 >> F학점 입니다. 점수가 0점이하이거나 100점 초과이면 ->
		 * 계산불가
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String result = "";
		System.out.print("점수를 입력하세요 >> ");
		score = sc.nextInt();
		if (score > 100 || score <= 0) {
			result = "계산불가";
		} else if (score > 89) {
			result = "A학점";
		} else if (score > 79) {
			result = "B학점";
		} else if (score > 69) {
			result = "C학점";
		} else if (score > 59) {
			result = "D학점";
		}

		System.out.println(result);

	}
}
