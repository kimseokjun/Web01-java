package j07_반복;

public class For3 {
	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * 
		 * 반복문을 돌려서 출력
		 * a
		 * b
		 * c
		 */
		String str = "abcdefghijk";
		int length = str.length();	//11
		for(int i =0; i < length; i++)
		{
			System.out.println(str.substring(i, i + 1));
		}
	}
}
