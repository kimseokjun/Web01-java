package j04_문자열;

public class String02 {
	public static void main(String[] args) {
		String address = "부산광역시 서구 부민동";
		System.out.println(address.replace(' ', '-'));
		
		String address2 = "부산광역시 연제구 연산동";
		String replaceAddress = address2.replaceAll(" 연", " 홍");
		System.out.println(replaceAddress);
		
		/*
		 * 01033004698
		 * -> 비밀번호 확인완료
		 * 
		 * 
		 * 010-3300-4698
		 * -> 01033004698 비밀번호저장완료
		 * 
		 * 010/3300/4698
		 * -> 01033004698 비밀번호저장완료
		 * 
		 * 010-3300-466987
		 *  -> 삼항연산자 replace 등을 사용
		 *  
		 */
		
		String phoneNumber = "010-3300-4698";
		
		String checkpw;
		
		int checkpww = phoneNumber.length();
		
		String subpw1 = phoneNumber.replace("-","");
		int checkpw1 = subpw1.length();
		
		String subpw2 = phoneNumber.replace("-","");
		int checkpw2 = subpw2.length();
		
	
		
		checkpw = (checkpww == 11) ? "비밀번호 확인완료" 
				: (checkpw1 == 11 || checkpw2 ==11) ?  subpw1+" 비밀번호 저장완료"
				: "번호가 올바르지 않습니다.";
		
		System.out.println(checkpw);
		
		System.out.println("================================================");
		
		String phoneNumbers2 = "010/3300/4698, 010/1234/5678";
		
		String change = phoneNumbers2.replaceAll("/","-").replaceAll(", ","/").replaceAll("010", "011");
		
		System.out.println(change);
		
		
	}
}
