package j09_클래스.생성자;

public class ConstructorMain {

	public static void main(String[] args) {
		
		Constructor1 constructor1 = new Constructor1();
		System.out.println();
		Constructor1 constructor12 = new Constructor1("홍길동");
		System.out.println();
		Constructor1 constructor13 = new Constructor1(1);
		System.out.println();
		Constructor1 constructor14 = new Constructor1("홍길동", 1);
		
		System.out.println();
		System.out.println(constructor12.name);
		System.out.println();
		
		
	}

}
