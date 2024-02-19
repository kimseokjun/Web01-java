package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("python");
		set.add("1");
		set.add("2");
		set.add("html");
		set.add("react");
		set.add("C");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
		
		// 2면 출력하기
//		for(int i = 0; i<set.size(); i++)
//		{
//			if(ir.hasNext()) {
//				String str = ir.next();
//				if(str.equals("2")) {
//					System.out.println(str);
//				}
//			}
//		}
		for(int i = 0; i<set.size(); i++)
		{
			if(ir.hasNext()) {
				String str = ir.next();
				if(str.equals("C")) {
					System.out.println(str);
					set.remove(str);	//순서가 없기 때문에 제거가 되었을때 다음으로 가지를 못함.
					break;		
					//break를 써서 오류에서 벗어나기
				}
			}
		}
		
	}

}
