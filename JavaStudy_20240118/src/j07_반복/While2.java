package j07_반복;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 입장인원 : 7
		 * 
		 * 익명 1이 입장하셨습니다.
		 * 익명 2이 입장하셨습니다.
		 * 익명 3이 입장하셨습니다.
		 * 익명 6이 입장하셨습니다.
		 * 익명 5이 입장하셨습니다.
		 * 익명 7이 입장하셨습니다.
		 *
		 */
		
		int i = 0;
		int totalperson = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장 인원 : ");
		totalperson = sc.nextInt();
		while( i <(totalperson)) {	//반복횟수를 적고 그 이후에 변수에 대해 맞춰주기 
			System.out.println("익명 " +(i+1) + "이 입장하셨습니다.");
			i++;
		}
		Thread.sleep(1000);
		System.out.println();
		
		int num2 = 0;
		while(num2 < totalperson) {
			System.out.println("익명" + (totalperson - num2) + "가 퇴장했습니다.");
			num2++;
		}
//		while(i > 0)
//		{
//			System.out.println("익명 " + i + "이 퇴장하였습니다.");
//			i--;
//		}
		
	}

	
	
}
