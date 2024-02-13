package j11_상속.factory;

public class FactoryMain4 {
	public static void main(String[] args) {
		
		Factory[] fac = new Factory[6];
	

		fac[0] = new SamsungFactory(1);	// 업캐스팅
		fac[1] = new SamsungFactory(2);
		fac[2] = new LGFactory(1);
		fac[3] = new SamsungFactory(3);
		fac[4] = new LGFactory(2);
		fac[5] = new LGFactory(3);
		
		for(int i = 0; i<fac.length; i++)
		{	
			if(fac[i] instanceof SamsungFactory ) {
				fac[i].start();
				((SamsungFactory)fac[i]).produceSmartPhone();
				fac[i].stop();
			
				System.out.println();
			}else {
				fac[i].start();
				((LGFactory)fac[i]).produceSmartTv();
				fac[i].stop();
				System.out.println();
			}
		
	
		}
	
		
		
		/*
		 * 공장 6개 만들기(팩토리 배열)
		 * 삼성1
		 * 삼성2
		 * 엘지1
		 * 삼성3
		 * 엘지2
		 * 엘지3
		 * 
		 * 
		 * 가동- 생산 - 중지
		 * 삼성 1공장을 가동합니다.
		 * 스마트폰 생산
		 * 삼성 1공장을 중지합니다.
		 * 
		 * 삼성2공장 가동하..
		 * 
		 */
		
		
	}
}
