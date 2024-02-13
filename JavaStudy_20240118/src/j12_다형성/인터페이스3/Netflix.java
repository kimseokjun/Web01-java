package j12_다형성.인터페이스3;

public class Netflix implements OTT{

	@Override
	public void drama() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스에서 드라마 시청");
	}

	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스에서 영화시청");
	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스에서 애니메이션시청");
	}

	public void sale() {
		System.out.println("넷플릭스는 20% 세일 합니다.");
	}
}
