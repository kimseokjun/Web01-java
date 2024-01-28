package j07_반복;


public class While1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int i = 0;	//초기문
		
		while(i < 5) { //조건문
			System.out.println(i);	//실행문(여러줄 당연히 가능)
			i++;	//후처리문
		}
		
		System.out.println("프로그램 종료");
	}
}
