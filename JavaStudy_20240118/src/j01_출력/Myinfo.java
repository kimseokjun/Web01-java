package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		
		String  fullName;
		fullName = "김석준";
		
		//선언은 무조건 한번만 가능
//		String fullName = "김석준"; - error
		String fullName2 = "김석준";
		System.out.println(fullName);
		
		// 대입은 여러번 가능
		fullName = "홍길서";
		System.out.println(fullName);
		
		int x = 1;	//1 을 x에 대입한다.
		// 자료형 - int String double float char boolean
		// 변수는 메모리에 저장된다.
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		int age = 18;
		boolean result = true;
		
		String address = "부산 진구 가야동";	//문자는 '', 문자열""
		// String은 기본 자료형이 아니다. 그래서 색깔이 다르다. 클래스 자료형이라네요
		
		System.out.println(name1 + name2);	// 문자를 문자열로 나타내려 하면 숫자가 나옴 (아스키코드값)
		
		
		/*
		 * 자동완성 : Ctrl + space바
		 * 출력문 단축키 : syso 적고 자동완성(Ctrl + Space바)
		 */
		
	}

}
