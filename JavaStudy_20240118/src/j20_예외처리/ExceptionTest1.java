package j20_예외처리;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 4, 5 };

		
		for (int i = 0; i < numArray.length; i++) {
			try {
				System.out.println(numArray[i]);
				throw new NullPointerException();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("배열 갯수 초과");
			} finally {
				System.out.println("무조건실행");
			}
		}

		System.out.println("반복후");

	}
}
