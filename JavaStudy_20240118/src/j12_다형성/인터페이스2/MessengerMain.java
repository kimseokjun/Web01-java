package j12_다형성.인터페이스2;

public class MessengerMain {

	public static void main(String[] args) {
		
		KakaoTalk kakaoTalk = new KakaoTalk();
		Instagram  instagram = new Instagram();
		
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(instagram);
		
		messengerMiddleware.sendMessage();
		System.out.println();
		messengerMiddleware.receiveMessage();
		
		System.out.println();
		messengerMiddleware.runAddOns();
	}

}
