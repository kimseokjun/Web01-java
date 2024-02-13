package j15_스태틱;

public class StudentMain {
	public static void main(String[] args) {

		Student[] students = new Student[30];

		for(int i = 0; i<students.length; i++)
		{
			students[i] = new Student("홍길동" + (i+1));
		}
		
		for(int i = 0; i<students.length; i++)
		{
			System.out.println(students[i]);
		}
	}
}
