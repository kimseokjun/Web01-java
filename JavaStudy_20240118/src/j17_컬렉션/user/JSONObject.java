package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {
		
		/*
		 * {
		 * "no" : 1,
		 * "message" : "1page list",
		 * "data" : [
		 * 				{
		 * 					"name" : "홍길동"
		 * 					"address" : "부산광역시 서구",
		 * 					"연락처" : "010-1234-5678",
		 * 					"성별" : 1
		 * 				},
		 * 				{
		 * 					"name" : "홍길서"
		 * 					"address" : "부산광역시 진구",
		 * 					"연락처" : "010-1111-2222",
		 * 					"성별" : 2
		 * 				},
		 */
		Map<String, Object> infoMap = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		Map<String, Object> map3 = new HashMap<String, Object>();
		List<Map<String,Object>> strList = new ArrayList<Map<String,Object>>();
	
		map2.put("name", "홍길동");
		map2.put("주소", "부산광역시 서구");
		map2.put("연락처", "010-1234-5678");
		map2.put("성별", 0);
		
		map3.put("name", "홍길서");
		map3.put("주소", "부산광역시 진구");
		map3.put("연락처", "010-1111-2222");
		map3.put("성별", 1);
		
		strList.add(map2);
		strList.add(map3);
		
		infoMap.put("no",1);
		infoMap.put("message","1page list");
		infoMap.put("data",strList);
		
		System.out.println(infoMap);
		
		
	}

}
