package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
//Example Using Set Which Can not contaion Duplicate Record and Not Maintain Order
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestUserHashSet {
	public static void main(String[] args) {

		HashSet<User> userList = new HashSet<User>();
		// Create user Class Object
		User user = new User(1, "Sachin");
		User user1 = new User(2, "Virat");
		User user2 = new User(3, "Dhoni");
		User user3 = new User(4, "Rahul");
		User user4 = new User(4, "Rahul");
		// adding Record into userList Set
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		System.out.println(userList);
		//Size of  Set
		System.out.println(userList.size());
		//Itrate Set All User
		Iterator<User> userRecord=userList.iterator();
		while(userRecord.hasNext())
		{
			System.out.println(userRecord.next());
		}
		//Short User 
		  List<User> uList = new ArrayList<User>(userList);
	       
		Collections.sort((List<User>) uList);
		

	}

}
