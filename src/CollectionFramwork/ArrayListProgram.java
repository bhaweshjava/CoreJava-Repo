package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ArrayList.User;

public class ArrayListProgram {
	public static void main(String[] args) {
		List items = new ArrayList();
		items.add(2);
		items.add("1");
		items.add("bhawesh");
		items.add("amit");
		items.add("Mca");
		System.out.println(items);
		//Short User 
		 
	       
		Collections.sort((List<User>) items);

	}
}
