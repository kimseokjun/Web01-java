package j07_반복;

import java.util.Scanner;

public class kiosk {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 인생네컷 1. 하루필름 2. 포토그레이 3. 항공필름 원하는 인생네컷을 고르시오 : 1 인원수를 입력하시오 : 2
		 * 
		 * 하루필름을 선택하셨습니다. 2가 넘으면 >> 인원을 초과하였습니다. 출력
		 * 
		 * 찰칵! (2초 대기) 찰칵! (2초 대기) 찰칵! (2초 대기) 찰칵! (2초 대기)
		 * 
		 * 원하는 사진을 입력하시오(짝수만 입력가능) : 4
		 * 
		 * 사진 1 나왔습니다. 사진 2 나왔습니다. 사진 3 나왔습니다. 사진 4 나왔습니다.
		 * 
		 * (올바르지 않은 입력입니다.)
		 */

		Scanner sc = new Scanner(System.in);
		int option, personCount, pictureNum = 0;
		while (true) {
			System.out.println();
			System.out.println("1. 하루필름(2인)\n2. 포토그레이(3인)\n3. 항공필름(4인)");
			System.out.println("원하는 인생네컷을 골라주세요 >> ");
			option = sc.nextInt();

			System.out.println("인원 수를 입력하세요");

			personCount = sc.nextInt();

			if (option == 1) {
				if (personCount > 2 || personCount < 1) {
					System.out.println("잘못입력하셨습니다.");
					while (personCount > 2) {
						System.out.println("다시 인원 수를 입력하세요");

						personCount = sc.nextInt();
					}
				}
			} else if (option == 2) {
				if (personCount > 3 || personCount < 1) {
					System.out.println("잘못입력하셨습니다.");
					while (personCount > 2) {
						System.out.println("다시 인원 수를 입력하세요");

						personCount = sc.nextInt();
					}
				}
			} else if (option == 3) {
				if (personCount > 4 || personCount < 1) {
					System.out.println("잘못입력하셨습니다.");
					while (personCount > 2) {
						System.out.println("다시 인원 수를 입력하세요");

						personCount = sc.nextInt();
					}
				}
			}

			int i = 0;
			while (i < 4) {

				System.out.println("찰칵!");
				Thread.sleep(2000);
				i++;
			}

			while (true) {
				System.out.println("원하는 사진 수를 입력하시오(짝수만 입력가능)");
				pictureNum = sc.nextInt();
				if (pictureNum % 2 == 1) {
					System.out.println("잘못입력하셨습니다.");
					continue;
				} else {
					i = 0;
					while (i < pictureNum) {
						System.out.println("사진" + (i + 1) + "나왔습니다.");
						i++;
					}
					break;
				}

			}

		}
	}
}
