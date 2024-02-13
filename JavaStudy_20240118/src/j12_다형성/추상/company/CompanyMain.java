package j12_다형성.추상.company;

public class CompanyMain {
	public static void main(String[] args) {
		
		Boss boss = new HardHuman();
		boss.work1();
		boss.work2();
		boss.work3();
		boss.snack();
	}
}
