package j06_조건;

import java.util.Scanner;

public class If3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = "";
	name = sc.nextLine();
	if(name.equals("파마산")) {
		System.out.println("파마산 입니다.");
	}else if(name.equals("모짜렐라")) {
		System.out.println("모짜렐라 입니다.");
	}
}
}
