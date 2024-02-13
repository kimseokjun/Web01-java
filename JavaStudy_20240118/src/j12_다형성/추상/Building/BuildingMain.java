package j12_다형성.추상.Building;

public class BuildingMain {
	public static void main(String[] args) {
		
		BuildingLaw building63 = new Building63();
		BuildingLaw lottetower = new LotteTower();
		BuildingLaw lct = new LctLow();
		
		building63.elevator();
		
	}
}
