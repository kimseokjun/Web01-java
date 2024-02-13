package j12_다형성.인터페이스2;

public class KakaoTalk implements Messenger{

	@Override
	public void send() {
		System.out.println("카카오톡에서 메신저를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("카카오톡에서 메신저를 받습니다.");
	}
	
	public void sendPresent() {
		System.out.println("카카오톡에서 선물을 보냅니다.");
	}
}
