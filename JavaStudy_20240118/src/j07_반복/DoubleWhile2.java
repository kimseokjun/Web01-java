package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i< 8)
		{
			
			int j = 0;
			System.out.println();
			System.out.println(i+2 + "단");
			System.out.println();
			while(j < 9)
			{
				System.out.println(i+2 + " x " + (j+1) + " = " + (i+2)*(j+1) );
				j++;
			}
			i++;
		}
	}

}
