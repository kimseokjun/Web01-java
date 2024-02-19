package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("address", "부산광역시 진구");
		jsonObject.addProperty("phone", "010-1111-2222");
		
		//
		String json = gson.toJson(jsonObject);
		
		System.out.println(json);
		
		JsonObject jsonObject2 = gson.fromJson(json, JsonObject.class);
		System.out.println(jsonObject2);
		
		System.out.println();
		User user = UserService.createUser();
		String userJson = gson.toJson(user);
		System.out.println(userJson);
	}

}
