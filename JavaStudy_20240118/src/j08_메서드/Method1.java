package j08_메서드;



public class Method1 {
	
	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 20;
		
		//Method1 method = new Method1();	//add함수에서 static을 지웠을때 add함수를 사용하는 방법
		// method.add()
		
		int sum = add(num1, num2);
		System.out.println(sum);
	}
	
	
	public static int add(int n1, int n2)
	{
		int result = n1 + n2;
		return result;
	}

}
