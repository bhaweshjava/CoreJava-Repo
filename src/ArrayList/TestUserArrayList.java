package ArrayList;
//Example Using List Which contaion Duplicate Record and Maintain Order
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUserArrayList {
	public static void main(String[] args) {
		//Create List for Add All User
		List record = new ArrayList();
		List record1 = new ArrayList();
		//Create First Object Of User Class
		User user = new User(1,"bhawesh");
		//Create Second Object of User Class
		User user1 = new User(2,"Amit");
		//Create user for reord1 list
		User user2 = new User(3,"Deepu");
		User user3 = new User(2,"Lalit");
	
		System.out.println("first user"+user);
		System.out.println("first User Name:"+user.getId());
		System.out.println("first User Password:"+user.getPassword());
		System.out.println("second user"+user1);
		//Adding All User into list
		record.add(user);
		record.add(user1);
		//Show All user into reocrd
		System.out.println("All User");
	Iterator itr = record.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		//Add User into record1 
	record1.add(user2);
	record1.add(user3);
	//user of Recod1
	System.out.println(record1);
	//total user of Record  and Record1
	record1.add(record);
	System.out.println("toatl user of recod and recod1");
	System.out.println(record1);
	//Show all User of Record1
	Iterator itr2=record1.iterator();
	System.out.println("All User List");
	while(itr2.hasNext())
	{
		//ConcurrentModificationException
		//record1.add("name");
		System.out.println(itr2.next());
	}
		
		
	}

}
