package j12_다형성.인터페이스3;

public class Watcha implements OTT{

	@Override
	public void drama() {
		// TODO Auto-generated method stub
		System.out.println("왓챠에서 드라마시청");
	}

	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("왓챠에서 영화시청");
	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub
		System.out.println("왓차에서 애니메이션시청");
	}
	
	public void freetier() {
		System.out.println("왓차는 2주 무료 시청입니다.");
	}

}
