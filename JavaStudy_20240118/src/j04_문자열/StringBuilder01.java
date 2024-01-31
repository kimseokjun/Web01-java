package j04_문자열;

public class StringBuilder01 {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder2 = new StringBuilder();
		
		stringBuilder.append("이름 : ");
		stringBuilder.append("홍길동");
		
		stringBuilder.delete(1, 2);
		System.out.println(stringBuilder);
		
		stringBuilder2.append("hihi");
		System.out.println(stringBuilder2.toString());
	}
}