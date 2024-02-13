package j12_다형성.추상.Building;

public  class LotteTower extends BuildingLaw{

	@Override
	public void elevator() {
		System.out.println("롯데타워 엘리베이터");
	}

	@Override
	public void fire() {
		System.out.println("롯데타워 화재경보");
	}

	@Override
	public void step() {
		System.out.println("롯데타워 피난계단");
	}

	public void observaTory() {
		System.out.println("롯데타워 전망대");
	}
	
}
