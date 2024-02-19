package j20_예외처리;

public class ExceptionTest3 {


	public void printArray() throws Exception{
		int[] numArray = {1,2,3,4,5};
		
		for(int i =0; i<numArray.length+1; i++) {
			System.out.println(numArray[i]);
		}
		
	}
}
