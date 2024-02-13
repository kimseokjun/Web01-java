package j12_다형성.인터페이스2;

public class Instagram implements Messenger {

	@Override
	public void send() {
		System.out.println("인스타그랩에서 메신저를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("인스타그램에서 메신저를 받습니다.");
	}
	
	public void sendStory() {
		System.out.println("인스타그램에서 스토리를 보냅니다.");
	}

}
