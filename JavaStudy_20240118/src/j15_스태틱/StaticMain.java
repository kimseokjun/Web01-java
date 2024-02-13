package j15_스태틱;

public class StaticMain {
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		staticTest.name = "김석준";
		System.out.println(staticTest.name);
		
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest2.name);	
		//같은 값이 나오는 이유는 static은 메모리를 공유하고 있기 때문이다.
		
		
	}
}
