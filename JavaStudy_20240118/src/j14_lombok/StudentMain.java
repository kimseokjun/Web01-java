package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student student = new Student();
//		Student student2 = new Student(20240001,"김석준",3,18);
//		
//		System.out.println(student2.getName());
//		System.out.println(student2.getAge());
//		
//		System.out.println(student2);
		
		Student student = new Student("홍길동",18);
		System.out.println(student.getAge());
	}

}
