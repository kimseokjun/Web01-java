package j07_반복;

import java.util.Scanner;

public class Continue1 {
	public static void main(String[] args) {

		// 0부터 9까지 출력하는 반복문 작성

		//continue를 사용하여 1부터 129까지의 수 중 홀수의 합
		
		int sum = 0;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		int endNum = sc.nextInt();
		while(i<endNum)
		{
			int j = i+1;
			if(j % 2 == 0)
			{
				i++;	//후처리 해주기!!!!!!!!!
				continue;
			}
			
			sum +=j;
			i++;		//후처리 해주기!!!!!!!!!!!!!!!!
		}
//		for(int i = 0; i<130; i++)
//		{
//			if(i % 2 == 0)
//			{
//				continue;
//			}
//			sum +=i;
//		}
		System.out.println("홀수의 합" + sum);
		
	}
}
