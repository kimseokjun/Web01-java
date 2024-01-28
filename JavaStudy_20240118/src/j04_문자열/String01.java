package j04_문자열;

public class String01 {

	public static void main(String[] args) {
		/*
		 *  String은 클래스 자료형이다.
		 *  String 자료형을 가진 변수명.함수명(); 사용가능
		 *  
		 *  int는 기본 자료형이다.
		 *  클래스가 이나라서 함수가 없다.
		 *  num.length()가 없다.
		 *  
		 *  
		 */
		System.out.print("월요일, 동우가 말했다.\n");
		System.out.println("\" 안녕 \"");
		//이스케이프 문자
		
		//인덱싱과 슬라이싱
		// 홍길동88
		// 홍길서95
		// A B C
		
		String address = "부산시 진구 가야동";
		System.out.println(address.indexOf("시"));		//인덱스는 0부터 세아린다.
		int index = address.indexOf("시");
		System.out.println(index);
		
		String address2 = "부산시 동래구 사직동";
		int index2 = address2.indexOf("동");
		System.out.println("동의 위치 : " + index2);
		// 띄어쓰기도 인덱스값에 포함
		
		int index3 = address2.lastIndexOf("동");
		System.out.println(index3);
		
		String subAddress = address2.substring(0,4);	///0번부터 인덱스 3번까지 반환
		System.out.println(subAddress);
		
		String subAddress2 = address2.substring(0,3);
		System.out.println(subAddress);
	
		String address3 = "부산광역시 서구 부민동";
		
		int sub1 = address3.indexOf("부");
		int sub2 = address3.lastIndexOf("부");
		String subaddressaa = address3.substring(sub1,sub2-1);	//뒤에 띄어쓰기를 없애주기 위해 -1해주기
		
		System.out.println(subaddressaa);
		
		
	}

}
