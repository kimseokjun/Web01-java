package j20_예외처리;

public class ExceptionTestMain {

	public static void main(String[] args) {
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		ExceptionTest3 exceptionTest3 = new ExceptionTest3();
		
		try {
			exceptionTest2.printArray();
			exceptionTest3.printArray();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("한곳에서 에외처리");
		}
	
	}

}
