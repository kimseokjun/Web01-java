package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

   
    public static User createUser() {
    	
    	 List<String> list = new ArrayList<String>();
    	 list.addAll(Arrays.asList(new String[]{"축구", "농구", "야구", "골프", "탁구"}));
    	  
        User user = User.builder()
                .userCode(0)
                .password("1234")
                .name(null)
                .email("abc")
                .address("울산")
                .phone("010-1111-2222")
                .hobby(list)
                .build();
        return user;
    }
}
