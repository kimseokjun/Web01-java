package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import j15_스태틱.Student;

public class UserArrayList {
	private List<User> userList;
	private Scanner sc;
	public UserArrayList() {
		userList = new ArrayList<User>();		//업캐스팅
		sc = new Scanner(System.in);
	}
	private void addUser() {
		
		
//		Scanner sc = new Scanner(System.in);
//		User user = new User();
		System.out.print("아이디 : ");
		String userName = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passWord = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("이메일 : ");
		String Email = sc.nextLine();
		
		User user = User.builder()
				.username(userName)
				.password(passWord)
				.name(name)
				.email(Email)
				.build();
		userList.add(user);
				//		user.setUsername(userName);
//		user.setPassword(passWord);
//		user.setName(name);
//		user.setEmail(Email);
//		return user;
	}
	private void printUserlist() {
		 
		 for(User user : userList) {
			 System.out.println("아이디 /t > " + user.getUsername());
			 System.out.println("비밀번호 \t > " + user.getPassword());
			 System.out.println("이름 \t\t > " + user.getName());
			 System.out.println("이메일 \t\t > " + user.getEmail());
		 }
	}
	
	private void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("아이디를 입력하시오 : ");
		username = sc.nextLine();
		
		for(User user : userList) {
			if(user.getUsername().equals(username)) {
				System.out.println("비밀번호를 입력하시오 : ");
				password = sc.nextLine();
				if(user.getPassword().equals(password)) {
					userList.remove(user);
				}else {
					System.out.println("비밀번호가 올바르지 않습니다.");
				}
				return ;
			}
			
		}
		System.out.println("존재하지 않는 아이디 입니다.");
	}
	public static void main(String[] args) {

		/*
		 * 사용자 관리 프로그램
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 
		 * 메뉴 선택 > 1
		 * 
		 * 아이디 : gildong
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 이메일 : gildong@gmail.com
		 * 
		 * 	 * 사용자 관리 프로그램
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 *메뉴선택 > 2
		 *
		 * 아이디 > gildong
		 * 비밀번호 > 1234
		 * 이름 > 홍길동
		 * 이메일 > gildong@gmail.com
		 * 
		 * 아이디 > gildong2
		 * 비밀번호 > 1234
		 * 이름 > 홍길동2
		 * 이메일 > gildong@gmail.com
		 *
		 */
//		Scanner sc = new Scanner(System.in);
//		String select = null;
//		ArrayList<User> users = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		UserArrayList userArrayList = new UserArrayList();
		String select = null;
		while(true) {
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q  프로그램 종료");
			System.out.println("메뉴선택 > ");
			
			select = sc.nextLine();
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserlist();
			}else if(select.equals("3")) {
				userArrayList.removeUser();
			}
		}
	}

}
