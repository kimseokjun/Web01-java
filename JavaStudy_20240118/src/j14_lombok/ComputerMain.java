package j14_lombok;

public class ComputerMain {

	public static void main(String[] args) {
		Computer computer = Computer.builder()
				.code(20240001)
				.name("코리아컴퓨터")
				.year(2024)
				.build();
		System.out.println(computer);
		
		Computer computer2 = Computer.builder()
				.name("zzz")
				.code(20240001)		//순서는 중요하지 않음
				.build();
		System.out.println(computer2);
	}
}
