package j12_다형성.추상.Building;

public abstract class BuildingLaw {
	
	public abstract void elevator();
	public abstract void fire();
	public abstract void step();
	
	public void toilet() {
		System.out.println("화장실 ");
	}
//	public abstract void view();
//	public abstract void aquarium();
//	public abstract void waterpark();
//	public abstract void speedelevator();
//
//	public void Elevator() {
//		System.out.println("공통기능 :엘리베이터");
//	}
//	public void Fire() {
//		System.out.println("공통기능 :화재");
//	}
//	public void stair() {
//		System.out.println("공통기능 :피난용 계단");
//	}
//	public void toilet(int num) {
//		System.out.println("공통기능 :화장실 " + num + "개");
//	}
}
