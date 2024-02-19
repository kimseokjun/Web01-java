package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student[] students = {student1, student2, student3, student4,student5};
		
		
		List<Student> asList = Arrays.asList(students);
		studentList.addAll(asList);
		for(Student stu : studentList) {
			System.out.println("학번 : " + stu.getStudentCode() + " 이름  : " + stu.getName());
			
		}
		
		for(Student stu : studentList) {
			if(stu.getName().equals("홍길북")) {
				System.out.println("학번 : " + stu.getStudentCode() + " 이름  : " + stu.getName());
				studentList.remove(stu);
			}
		}
		System.out.println(studentList);
	}
}
