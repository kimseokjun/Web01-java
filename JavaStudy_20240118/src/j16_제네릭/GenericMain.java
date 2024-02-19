package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
	
	//	GenericTest genericTest = new GenericTest();
		
	//	genericTest.setNumber(100);
	//	genericTest.setData(200);
		
	//	System.out.println(genericTest.getNumber() + genericTest.getData());
		GenericTest<String> genericTest = new GenericTest<String>();
		genericTest.setData("안녕");
		genericTest.setNumber(10);
		System.out.println(genericTest.getData());
		System.out.println(genericTest.getNumber());
		
		GenericTest<Integer> genericTest2 = new GenericTest<Integer>();		//기본자료형 int는 들어올수가 없음
		genericTest2.setData(20);		
		genericTest2.setNumber(10);
		System.out.println(genericTest2.getData()+genericTest2.getNumber());
	}
}
