package j12_다형성.인터페이스3;

public class Tving implements OTT{

	@Override
	public void drama() {
		// TODO Auto-generated method stub
		System.out.println("티빙에서 드라마시청");
	}

	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("티빙에서 영화시청");
	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub
		System.out.println("티빙에서 애니메이션시청");
	}
	public void bundle() {
		System.out.println("티빙은 1+1 입니다.");
	}
}
