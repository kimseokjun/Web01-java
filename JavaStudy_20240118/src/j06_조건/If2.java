package j06_조건;

public class If2 {

	public static void main(String[] args) {
		//hind
		/*
		 * 3000 -> 딸기 , 귤, 샤인머스켓
		 * 4000 -> 통귤, 산타
		 * 
		 * 10,000이 넘게 있으면 통귤, 산타 중에 하나 먹어라
		 * 6000원이 넘게 있으면 딸기 , 귤 , 샤인머스켓 중 하나 먹어라
		 * 6000원 미만이있으면 버스타고 가라
		 * 
		 */
		
		int money= 12000;
		if (money >10000)
		{
			System.out.println("통귤, 산타 중에 하나 먹어라");
		}else
		{
			if(money>6000)
			{
				System.out.println("딸기, 귤, 샤인머스켓 중에 하나 먹어");
			}
			else
			{
				System.out.println("버스타고 잡가라");
			}
		}
	}

}
