package j09_클래스.생성자;

public class Constructor1 {
	
	String name;
	int age;
	
	
	// 값주입 방법2
	//기본 생성자
	//NoArgsConsturctor
	public Constructor1() {
		System.out.println("기본생성자");
	}
	
	// RequiredNoArgsConsturctor
	public Constructor1(String name) {
		this.name = name;
		
		System.out.println("매개변수 : " + name);
		System.out.println("name을 매개변수로 받는 생성자");
	}
	public Constructor1(int age) {
		this.age = age;
		System.out.println("매개변수 : " + age);
		System.out.println("age을 매개변수로 받는 생성자");
	}
	
	//전체생성자
	//AllArgsConsturctor
	public Constructor1(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("매개변수 : " + name);
		System.out.println("매개변수 : " + age);
		System.out.println("전체 생성자");
	}
	
	//Args - > Arguemnts(인수, 매개변수)
}
