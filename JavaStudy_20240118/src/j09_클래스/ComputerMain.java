package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
		
//		System.out.println(new Computer());	//new 생성
//		System.out.println(new Computer());	// 이 둘은 다르다.  주소가 다르다
//		
//		Computer address = new Computer();
//		System.out.println(address); 	//객체 주소
		
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
//		System.out.println(c1);
//		System.out.println(c2);
		
		//값주입 방법1
		c1.cpu = "i7";
		c1.company = "SAMSUNG";
		c1.year = 2023;
		c1.ram = 8;
		c1.graphic = "RTX3060";
		
		
		c2.cpu = "i5";		// . 찍는것 주소를 참조
		c2.company = "LG";
		c2.year = 2022;
		c2.ram = 16;
		c2.graphic = "GTX1080";
		
		

		c1.showInfo();
		c2.showInfo();
		System.out.println("전");
		c1.addRam(8);
		c1.addRam(8);
		c1.addRam(16);
		c2.addRam(16);
		System.out.println("후");
		c1.showInfo();
		c2.showInfo();
		
		c1.removeRam(16);
		c1.removeRam(16);
		c2.removeRam(8);
		c1.showInfo();
		c2.showInfo();
	}

}
