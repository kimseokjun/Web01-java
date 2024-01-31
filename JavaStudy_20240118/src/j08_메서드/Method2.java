package j08_메서드;

public class Method2 {
	// 반환(리턴) 매개변수도 없는 메소드
	public static void test1()
	{
		System.out.println("테스트1 호출");
	}
	// 반환도 없고 매개변수가 하나인 메소드
	public static void test2(int num)
	{
		System.out.println("num : " + num);
		System.out.println("테스트2 호출");
	}
	
	// 반환도 없고 매개변수가 두개인 메소드
	public static void test3(int num1, int num2, int num3)
	{
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
	}
	
	//반환은 있고 매개변수가 없는 ㅔㅁ소드
	public static int test4() {
		System.out.println("test4 호출");
		return 100;
	}
	
	public static boolean test5(int num)
	{
		System.out.println("num: " + num);
		return true;
	}
	public static void main(String[] args) {
		
		// 메소드 종류
		
		// 반환(리턴) 매개변수도 없는 메소드
		test1();
		
		// 반환도 없고 매개변수가 하나인 메소드
		test2(111);
		// 반환도 없고 매개변수가 두개인 메소드
		test3(111,222,333);
		System.out.println(test4());
		System.out.println(test5(100));
	}

}
