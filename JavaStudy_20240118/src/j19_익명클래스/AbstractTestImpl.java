package j19_익명클래스;

public class AbstractTestImpl extends AbstractTest{

	@Override
	public void showData(String data) {
		System.out.println("data : " + data);
	}

	@Override
	public void add(int num1, int num2) {
		System.out.println("num1 + num2 = " + (num1 +num2));
	}

}
