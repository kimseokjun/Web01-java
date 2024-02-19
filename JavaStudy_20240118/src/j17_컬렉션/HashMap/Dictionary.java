package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {

		// 축구(soccer)
		// 야구(baseball)
		// 농구(basketball)
		// 골프(golf)

		// 1. 검색기능(종료q)
		// 2. 추가기능
		// 3. 전체조회
		// # 프로그램 종료(exit)

		// 1선택
		// 검색어 : 축구
		// soccer
		// 검색어 : 농구
		// basketball

		// 2선택
		// 한글 : 볼링
		// 영어 : bowling

		// 한글 : 배구
		// 영어 : volleyball

		// 3선택
		// 축구(soccer)
		// 야구(baseball)
		// 농구(basketball)
		// 골프(golf)
		// 볼링(bowling)
		// 배구(volleyball)

		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("축구", "soccer");
		dic.put("야구", "baseball");
		dic.put("농구", "basketball");
		dic.put("골프", "golf");
		Scanner sc = new Scanner(System.in);
		String sel;
		String findKey;
		String addKey;
		String addValue;

		while (true) {
			System.out.println("[사전]");
			System.out.println("1. 검색기능 (종료 q)");
			System.out.println("2. 추가기능 (종료 q)");
			System.out.println("3. 전체조회");
			sel = sc.nextLine();
			if (sel.equals("1")) {
				while (true) {
					System.out.print("검색어 : ");
					findKey = sc.nextLine();
					if (findKey.equals("q")) {
						break;
					} else {
						System.out.println(dic.get(findKey));
						System.out.println();
					}
				}

			} else if (sel.equals("2")) {
				while(true)
				{
					System.out.print("한글 : ");
					addKey = sc.nextLine();
					if(addKey.equals("q")) {
						break;
					}
					System.out.print("영어 : ");
					addValue = sc.nextLine();
					dic.put(addKey, addValue);
				}
			
				
			} else if (sel.equals("3")) {
				for(String key : dic.keySet()) {
					System.out.println(key + "(" + dic.get(key) + ")");
				}
			} else if (sel.equals("exit")) {
				break;
			}
		}

	}

}
