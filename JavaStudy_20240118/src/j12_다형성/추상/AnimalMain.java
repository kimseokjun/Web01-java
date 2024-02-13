package j12_다형성.추상;

public class AnimalMain {
	public static void main(String[] args) {
		
//		Animal animal = new Animal();
// 추상 클래스는 생성이 안됨.
		
		Animal human = new Human();
		human.move();
	
	}
}
