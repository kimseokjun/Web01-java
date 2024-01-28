package j05_입력;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		/*
		 * 자기소개 프로그램
		 * 이름:		next()		name
		 * 나이:		nextInt()	age
		 * 주소:		nextLine()	address
		 * 연락처:		next()		phone
		
			출력
			사용자의 이름은 홍길동이고 나이는 18세입니다.
		 */
		
		System.out.println("자기소개 프로그램");
		
		String name,address,phone;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		name = sc.next();
		
		System.out.print("나이를 입력하세요 :");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력하세요 :");
		address = sc.nextLine();
		
		System.out.print("연락처를 입력하세요 : ");
		phone = sc.next();
		
		System.out.println("사용자의 이름은 " + name + " 이고 나이는 " +age + " 입니다.");
		System.out.println("주소는 " + address + " 입니다.");
		System.out.println("연락처는 " + phone + " 입니다.");
	}
}
