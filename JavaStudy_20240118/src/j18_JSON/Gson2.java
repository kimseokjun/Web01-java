package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	public static void main(String[] args) {
		
		User user = UserService.createUser();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);

		User userObj = gson.fromJson(userJson, User.class);		//데이터를 뽑을때는 Json 형태?
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
	}
}
