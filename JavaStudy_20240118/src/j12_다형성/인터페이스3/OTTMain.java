package j12_다형성.인터페이스3;

public class OTTMain {
	public static void main(String[] args) {
		Netflix netflix = new Netflix();
		Tving tving = new Tving();
		Watcha watcha = new Watcha();
		
		OTTMiddleware[] ottmiddleware = new OTTMiddleware[3];// 배열 3개생성
		
	
		ottmiddleware[0] = new OTTMiddleware(netflix);	//업캐스팅 발생
		ottmiddleware[1] = new OTTMiddleware(tving);
		ottmiddleware[2] = new OTTMiddleware(watcha);
		
		for(int i = 0; i<ottmiddleware.length; i++)
		{
			ottmiddleware[i].ShowDarama();
			ottmiddleware[i].ShowAni();
			ottmiddleware[i].ShowMovie();
			ottmiddleware[i].abd();
			System.out.println();
		}
	}
}
