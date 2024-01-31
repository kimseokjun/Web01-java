package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {

		//System.out.println(Math.random());
		
		
		int i = 0;
		
		while(i<5) {
			double rNum = Math.random();
			System.out.println((int)(rNum*100));
			
			i++;
		}
	}

}
