package j14_lombok;

public class BuilderMain {
	
	public static void main(String[] args) {
		
		Builder builder = new Builder();	//builder 생성자 호출
		
		
		Car car = builder.builder()
				.company("기아")
				.model("k5")
				.color("black")
				.build();
		
		System.out.println(car);
	}	
}
