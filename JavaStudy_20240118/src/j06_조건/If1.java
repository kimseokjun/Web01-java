package j06_조건;

public class If1 {
	public static void main(String[] args) {
		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라

		boolean money = true;

		if (money) {
			System.out.println("택시를 타고가라");
		}
		if (!money) {
			System.out.println("걸어가라");
			System.out.println("걸어가다가 빨리 뛰라");
		}

		// 돈이 있으면 탕후루를 먹고 돈이 없으면 감귤 먹어라

		boolean money2 = false;
		if (money2) {
			System.out.println("탕후루 먹자");
		}
		if (!money2)
			System.out.println("그냥 감귤 먹자");
		// 조건문 안의 실행문이 하나일때는 중괄호 생략가능
		System.out.println("제주 한라산 굿");
		System.out.println();
		if (money2) {
			System.out.println("탕후루 먹어라2");
			System.out.println("탕후루 짱짱!");
		} else {
			System.out.println("감귤먹어라2");
		}

		// 자동정렬단축키 -? ctrl + shitf+F

	}
}
