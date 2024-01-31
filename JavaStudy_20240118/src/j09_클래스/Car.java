package j09_클래스;


import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	
	String company;
	String model;
	String color;
	int distance;
	int oil;
	
	//생성자의 특징
	// 1. 주소값을 리턴한다.
	// 2. 클래스명과 동일하다.
	/*
	 *  * 기본 생성자는 생략이 가능하다.
	 *  
	 */
	
	Car() {
	}
	
	void showInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println();
	}
	
	void changeEngineOil() {
		System.out.print("교체 후 주행거리 : ");
		distance = sc.nextInt();
		System.out.print("희망주입량(L) : ");
		oil = sc.nextInt();
		
		System.out.println(distance);
		System.out.println(oil);
		if(distance < 9000) {
			System.out.println("9000km 주행 후 교체 하십시오.");
		}
		else {
			if(oil >= 5)
			{
				System.out.println("최대 5L 만 주입가능합니다.");
				oil = 5;
			}else {
				System.out.println(oil + "(L)를 주입합니다.");
			}
		}
		
		
	}
}
