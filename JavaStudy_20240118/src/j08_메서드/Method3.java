package j08_메서드;


/*
 * 메소드 오버로딩
 * 
 */


public class Method3 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	public static void test1(int num2)
	{
		System.out.println("매개변수가 하나이고 int 인 test2");
	}
	public static void test1(int num1, int num2)
	{
		System.out.println("매개변수가 두개이고 모두 int 인 test1");
	}
	public static void test1(int num1, String num2)
	{
		System.out.println("매개변수가 두개이고  int,string 인 test1");
	}
	
	public static void test1(String name, int age)
	{
		System.out.println("매개변수가 두개이고 String, int인 test1");
	}
	public static void main(String[] args) {
		test1();
		test1(100);
		test1(1,2);
		test1("홍길동",100);
		test1(100,"홍길동");
	
	}
}
