package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		// 리스트는 순서가 있음, 중복 허용
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		// 원하는 위치에 값 추가
		list.add(1, "css");

		
		// 리스트의 크기(개수)
		System.out.println(list.size());
		
		System.out.println(list);
		
		//리스트에서 해당 인덱스로 값 찾기
		String subject = list.get(2);
		System.out.println(subject);
		
		//리스트에서 값을통해 인덱스 찾기
		int findindex = list.indexOf("python");
		System.out.println(findindex);
		
		//값 수정
		list.set(1, "java");
		
		System.out.println(list);
		
		//해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("C");

		
		boolean contains = list.contains("java");	//java가 list안에 있는지
		System.out.println(contains);
		
		boolean containsAll = list.containsAll(tempList);	//tempList에 있는 요소들이 list에도 있는지?
		System.out.println(containsAll);
		
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		
		//리스트에 배열 넣기
		String [] strs = {"java", "python", "C", "html"};
		
		List<String> asList = Arrays.asList(strs);
		
		list.addAll(asList);
		System.out.println(list);
		for(int i = 0; i< list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String str : list) {
			System.out.println(str);
		}
	}
	

}
