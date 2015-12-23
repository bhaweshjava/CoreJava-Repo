package ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserMap {
	public static void main(String[] args) {
		
	
	Map userMap = new HashMap();
	User user = new User(1,"pawan");
	User user1 = new User(2,"Divendra");
	userMap.put("first", user);
	userMap.put("second", user1);
	System.out.println(userMap);
	
	}

}
