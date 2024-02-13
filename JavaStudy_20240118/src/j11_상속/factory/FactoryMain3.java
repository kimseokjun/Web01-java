package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {

		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory sfactory = samsungFactory;	//업캐스팅
		SamsungFactory samsungFactory2 = (SamsungFactory)sfactory;	//다운캐스팅
		
		// Factory factory = new Factory(1);	
		// LGFactory lgFactory = (LGFactory)factory;		//다운캐스팅 바로는 안됨
		// 근본 주소로 내려오는건 가능. 부모주소에서 자식주소 못 내려옴
		
		
	}

}
