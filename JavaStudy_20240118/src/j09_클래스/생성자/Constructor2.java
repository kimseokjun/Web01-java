package j09_클래스.생성자;

public class Constructor2 {
	String name;
	int age;
	boolean wishWindow;

	
	/*
	 * 생성자 오버로딩했을경우 
	 * 기본생성자는 생략이 안됨
	 * 기본생성자를 사용하고 싶을 경우 무조건 명시해야함
	 * 
	 */
	public Constructor2() {
		// TODO Auto-generated constructor stub
	}
	public Constructor2(String name) {
		
		this.name = name;
	}

	public Constructor2(String name, boolean wishWindow) {
		
		this.name = name;
		this.wishWindow = wishWindow;
	}

	public Constructor2(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public Constructor2(boolean wishWindow) {
		
		this.wishWindow = wishWindow;
	}

	public Constructor2(int age) {
		
		this.age = age;
	}

	public Constructor2(String name, int age, boolean wishWindow) {
	
		this.name = name;
		this.age = age;
		this.wishWindow = wishWindow;
	}


}
