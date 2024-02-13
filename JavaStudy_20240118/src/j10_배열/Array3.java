package j10_배열;

import j09_클래스.접근지정자.Student.Student;

public class Array3 {
	public static void main(String[] args) {
		/*
		 * 배열들을 통해서 값을 받아올거임. 배열 크기 names 5 studentsYears 5 age 5
		 * 
		 * 홍길동 3 19 홍길서 2 18 홍길남 3 19 홍길북 1 17 홍길중 2 18
		 * 
		 * 이름은 홍길동이고 학년은 3학년 19세입니다.
		 * 
		 */
		String[] names = { "홍길동", "홍길서", "홍길남", "홍길북", "홍길중" };
		int[] studentsYears = { 3, 2, 3, 1, 2 };
		int[] age = { 19, 18, 19, 17, 18 };

		for (int i = 0; i < 5; i++) {
			System.out.println("이름은 " + names[i] 
					+ "이고 학년은 " + studentsYears[i] + "이고 나이는 " 
					+ age[i] + "세 입니다.");
		}
		
		
		//2
		/*
		 * names, studentYears,age 배열을 활용하여
		 * students 라는 배열(크기 : 5)에 값 주입
		 * 
		 * 이름 : 홍길동	학년 : 3	나이: 19
		 * 
		 * 
		 */
		
		// 객체배열
		Student[] students = new Student[5];
		int j = 0;
		
//		for(int i = 0; i<5; i++)
//		{
//			students[i] = new Student(names[i], studentsYears[i],age[i]);
//		}
//		for(int i = 0; i<5; i++)
//		{
//			System.out.println("이름 : " + students[i].getName() + 
//					"\t학년 : " + students[i].getStudentYear() +
//					"\t나이 : " + students[i].getAge() 
//					);
//		}
			
		
		for(int i = 0; i<5; i++)
		{
			students[i] = new Student();
			students[i].setName(names[i]);
			students[i].setStudentYear(studentsYears[i]);
			students[i].setAge(age[i]);
		}
		for(int i =0; i<5; i++)
		{
			System.out.println("이름 : " +students[i].getName() 
					+ "\t학년 : " + students[i].getStudentYear()
					+ "\t나이 : " + students[i].getAge());
		}
		
	}
}
