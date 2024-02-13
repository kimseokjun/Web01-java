package j10_배열;

import j09_클래스.Computer;

public class Array1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];  //방이 5개다.
		
		String[] strArray = new String[4];
		
		a[0] = 10;
		a[1] = 9;
		
		System.out.println(a.toString()); //주소
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		strArray[2] = "김석준";
		System.out.println(strArray[2]);
		
		Computer[] computers = new Computer[4];
//		computers[1] = new Computer();
		System.out.println(computers[1]);
		
	}

}
