package ArrayList;
//Example Using Set Which Can not contaion Duplicate Record and Not Maintain Order
import java.util.HashSet;
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
		//Itrate Set
		System.out.println(userList.size());
		System.out.println(userList.contains(user1));
		

	}

}
