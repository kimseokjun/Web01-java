package j18_JSON;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data

public class User {
	private int userCode;
	private String username;
	private String password;
	private String name;
	private String email;
	private String address;
	private String phone;
	private List<String> hobby;
	
}
