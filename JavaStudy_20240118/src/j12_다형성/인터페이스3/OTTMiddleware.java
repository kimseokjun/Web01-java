package j12_다형성.인터페이스3;

public class OTTMiddleware {
	private OTT ott;
	
	public OTTMiddleware(OTT ott) {	//받아오면서 업캐스팅이 일어남
		
		this.ott = ott;
	}
	
	public void ShowDarama() {
		ott.drama();
	}
	
	public void ShowMovie() {
		ott.movie();
	}
	public void ShowAni() {
		ott.animation();
	}
	
	
	public void abd() {
		if(ott instanceof Netflix) {
			((Netflix) ott).sale();		//다운캐스팅
		}else if(ott instanceof Tving) {
			((Tving) ott).bundle();
		}else if(ott instanceof Watcha) {
			((Watcha) ott).freetier();
		}
	}
}
