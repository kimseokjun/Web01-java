package j12_다형성.추상.Building;

public class Lct extends BuildingLaw{

	@Override
	public void elevator() {
		System.out.println("엘시티 엘리베이터");
	}

	@Override
	public void fire() {
		System.out.println("엘시티 화재경보");
	}

	@Override
	public void step() {
		System.out.println("엘시티 피난계단");
	}
	
	public void waterpark() {
		System.out.println("엘시티 워터파크");
	}


	

}
