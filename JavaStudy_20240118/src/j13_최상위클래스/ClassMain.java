package j13_최상위클래스;

import java.lang.reflect.Method;



public class ClassMain {
	public static void main(String[] args) {
		
		Student student = new Student(20240001, "김석준");
		
		Class c = student.getClass();
		System.out.println("클래스명(모든경로): "+ c.getName());
		System.out.println("클래스명(클래스명만): "+ c.getSimpleName());
		
		Method[] methods = c.getMethods();
//		System.out.println(methods[0].getName());
		
		for(int i = 0; i<methods.length; i++)
		{
			System.out.println(methods[i].getName());
		}
	}
}
