package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
//		System.out.println(scanner.next());
		System.out.print("이름을 입력하시오: ");
		String name = scanner.next();
		System.out.print("나이를 입력하세오: ");
		String age = scanner.next();
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
	}

}
