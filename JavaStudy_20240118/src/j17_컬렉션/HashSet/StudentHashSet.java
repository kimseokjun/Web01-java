package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import j15_스태틱.Student;

public class StudentHashSet {
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");
		Student[] students = {student1, student2, student3, student4,student5};
		
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.addAll(Arrays.asList(students));
		
		System.out.println("원하시는 메뉴를 선택하시오");
		System.out.println("1. 학생 전체 조회");
		System.out.println("2. 삭제");
		
		Scanner sc = new Scanner(System.in);
		
		int sel = sc.nextInt();
		
		
		switch(sel) {
		case 1 :
				for(Student s : studentSet) {
					System.out.println("학번 : " + s.getStudentCode() + "이름 " + s.getName());
				}
				break;
		case 2:
			System.out.println("삭제할 학생의 이름을 입력하시오 : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			for(Student s : studentSet) {
				if(s.getName().equals(name)) {
					System.out.println("학번을 입력하시오 : ");
					int code = sc.nextInt();
					
					if(s.getStudentCode() == code) {
						studentSet.remove(s);
						break;
					}else {
						System.out.println("학번이 올바르지 않습니다.");
					}
				}
			}
	}
}
}