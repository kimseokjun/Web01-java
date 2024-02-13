package j12_다형성.인터페이스2;

public class MessengerMiddleware {
	
	private Messenger messenger;		//인터페이스

	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
		
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	
	public void runAddOns() {		//instanceof 활용해서 선물 보냅니다.  스토리를 보냅니다.
		if(messenger instanceof KakaoTalk) {
			((KakaoTalk) messenger).sendPresent();
		}else if(messenger instanceof Instagram){
			((Instagram) messenger).sendStory();
		}
	}
}
