package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEx {

	public static void main(String[] args) {
		
		/*
		 * 맵 키 값으로 리스트 넣기
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> strList = new ArrayList<String>();
		
		strList.add("사과");
		strList.add("apple회사");
		strList.add("동그랗고 빨간 과일");
		
		map.put("apple", strList);
		System.out.println(map);
	}

}
