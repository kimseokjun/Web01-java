package j03_연산자;

public class Operation05 {
	public static void main(String[] args) {
		String str = "안녕";
		System.out.println(str.length());
		
		/*
		 * pw
		 * 비밀번호를 8-16자리가 되어야함.
		 * 8~16자리를 충족하면 비밀번호가 확인되었습니다.
		 * 비밀번호자릿수를 맞춰주세요.
		 * 비밀번호가 미 작성시 비밀번호를 입력하세요.
		 */
		
		String pw = "";
		String ans ;
		int pwCount  = pw.length();
		System.out.println(pwCount);
		ans = (pwCount == 0) ? "비밀번호를 입력하세요" 
				: (pwCount >7 && pwCount <17) ? "비밀번호가 확인되었습니다." 
				: "비밀번호자릿수를 맞춰주세요" ;
		
		System.out.println(ans);
		

		
		
	}
}
