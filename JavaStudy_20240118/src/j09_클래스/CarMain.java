package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * Car 클래스
		 * 변수
		 * company
		 * model
		 * color
		 * 
		 * 메소드
		 * showInfo()
		 * 	 	회사명 : 
		 * 		모델명 : 
		 * 		색상 :
		 * 		
		 * chageEngineOil()
		 * {
		 * 		교체 후 주행거리 : 8000
		 * 		희망주입량(L): 10
		 * 		교체 한 후 9천 키로가 안되었으면.
		 * 		9,000km주행 후 교체 하십시오.
		 * 		
		 * 		교체 한 후 9천 키로가 되었으면,
		 * 		주입량을 주입합니다.
		 * 		*희먕 주입량이 5L 이상일시 최대 5L 만 주입
		 * }
		 * 
		 * 2대
		 * 현대자종다
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아 
		 * k5
		 * 블랙
		 * 	
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();;
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "K5";
		car2.color = "블랙";
		
		car1.showInfo();
		car2.showInfo();
		
		car1.changeEngineOil();
	}

}
