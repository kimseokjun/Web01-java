package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		
		/*
		 *1~45 까지의 숫자중 5개를 랜덤으로 뽑고 그중 가장 큰수를 출력하시오
		 */
		
		Random random = new Random();
		
		int rNum = 0;
		int max = 0;
		int i = 0;
		while(i<5) {
			rNum = random.nextInt(45)+1;
			System.out.println(rNum);
			if(i==0)
			{
				max = rNum;
			}else if(max < rNum)
			{
				max = rNum;
			}
			i++;
		}
		System.out.println("가장 큰 수는 " + max);
		

	}

}
