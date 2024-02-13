package j11_상속.factory;

public class FactoryMain1 {
	
	/*
	 * 삼성 팩토리 배열(크기 : 5)
	 * 1공장 ~ 5공장
	 * 
	 * 엘지 팩토리 배열 (크기 : 3)
	 * 1공장 ~ 5공장
	 * 
	 * 
	 * 삼성공장가동
	 * 1공장을 가동합니다.
	 * ...
	 * 5공장을 가동합니다.
	 * 
	 * 삼성공장중지
	 * 1공장을 중지합니다.
	 * ...
	 * 5공장을 중지합니다.
	 * 
	 * 엘지공장가동..
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		SamsungFactory [] Samsung = new SamsungFactory[5];
		LGFactory [] Lg = new LGFactory[3];
		System.out.println("삼성공장가동");
		for(int i = 0; i<Samsung.length; i++)
		{
			Samsung[i] = new SamsungFactory(i+1);
			Samsung[i].start();
		}
		System.out.println();
		System.out.println("삼성공장중지");
		for(int i = 0; i<Samsung.length; i++)
		{
			Samsung[i] = new SamsungFactory(i+1);
			Samsung[i].stop();
		}
		System.out.println();
		System.out.println("LG공장 가동");
		for(int i = 0; i<Lg.length; i++)
		{
			Lg[i] = new LGFactory(i+1);
			Lg[i].start();
		}
		System.out.println();
		System.out.println("LG공장 중지");
		for(int i = 0; i<Lg.length; i++)
		{
			Lg[i] = new LGFactory(i+1);
			Lg[i].stop();
		}
	}
}
