package SimpleProgram;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class StringProgram {
public static void main(String[] args) {
	String name = "bhawesh";
	String name1="bhawesh";
	System.out.println("name:"+name);
	
	System.out.println("name1:"+name1);
	System.out.println("name length"+name.length());
	System.out.println("name char positon:"+name.charAt(0));
	System.out.println("Object Check");
	name = name.concat("kahar");
	if(name==name1)
	{
		
		System.out.println("name and name1 are equal"+name);
	
	}
	else
	{
		System.out.println("name and name1 are not Equal"+name);
	}
	System.out.println("Contenct Check");
	if(name.equals(name1))
	{
		System.out.println("name and name1 are equal");
	}
	else
	{
		System.out.println("name and name1 are not Equal");
	}
}
}
