package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		/*
		 * 놀이기구 
		 * 1. 자이로드롭 (170)
		 * 2. 후룸라이드 (15)
		 * 3. 바이킹 (160)
		 * 4. 회전목마 (140)
		 * 5. 관람차 (130)
		 * 
		 * 키를 입력하시오 : 140
		 * 회전목마 탑승가능
		 * 관람차 탑승가능
		 * 커플 입장시 10% 할인
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int height;
		int num;
		System.out.print("키를 입력하시오 : ");
		height = sc.nextInt();
		
		num = height / 10;	//10을 나눠서 몫을 구하여 시행
		switch(num)
		{
		case 17:
			System.out.println("자이로드롭 탑승가능");
		case 16:
			System.out.println("바이킹 탑승가능");
		case 15:
			System.out.println("후룸라이드 탑승가능");
		case 14:
			System.out.println("회전목마 탑승가능");
		case 13:
			System.out.println("관람차 탑승가능");
		default:
			System.out.println("커플 입장시 10%할인");
		
		}
			
	}
}
